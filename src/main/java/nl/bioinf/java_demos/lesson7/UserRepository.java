package nl.bioinf.java_demos.lesson7;

import nl.bioinf.java_demos.lesson6.Address;
import nl.bioinf.java_demos.lesson6.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String SEPARATOR = ";";
    private final String userFile;
    private final List<User> users = new ArrayList<>();

    public UserRepository(String userFile) {
        this.userFile = userFile;
    }

    public void readUsers() {
        //System.out.println("Paths.get(\".\").toAbsolutePath() = " + Paths.get(".").toAbsolutePath());
        Path dataPath = Paths.get(userFile);
        try(BufferedReader reader = Files.newBufferedReader(dataPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() < 2) continue;
                //System.out.println("line = " + line);
                final User user = processUser(line);
                System.out.println("user = " + user);
                this.users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private User processUser(String line) {
        //Henk Hindriks;henk@example.com;Groningen;Zernikeplein 11;9701DA
        String[] userElmnts = line.split(";");
        String name = userElmnts[0];

        String email = null; //NullPointerException
        Address address = null;

        if (userElmnts.length < 2) {
            return new User(name, email, address);
        }

        email = userElmnts[1];  //Arie geeft een ArrayIndexOutOfBoundsException
        String city = userElmnts[2];
        String streetAndNumber = userElmnts[3];
        String street;

        //Willem geeft hier ArrayIndexOutOfBoundsException
        //Desiree geeft hier een NumberFormatException
        String[] streetNumberArr = streetAndNumber.split(" ");
        street = streetAndNumber.split(" ")[0];
        int number = -1;
        if (streetNumberArr.length == 2) {
            //String numberPattern = "\\d+";
            try{
                number = Integer.parseInt(streetAndNumber.split(" ")[1]);
            } catch (NumberFormatException ex) {
                //defaults to -1
            }
        }
        String zipCode = userElmnts[4];

        address = new Address(city, street, number, zipCode);
        //System.out.println("address = " + address);
        return new User(name, email, address);
    }

    public void addUser(User newUser) {
        this.users.add(newUser);
        System.out.println("Users size = " + users.size());
    }

    public void save() {
        Path dataPath = Paths.get(userFile);
        try (BufferedWriter writer = Files.newBufferedWriter(dataPath, Charset.forName("US-ASCII"), StandardOpenOption.WRITE)) {
            for (User user : users) {
                System.out.println("write user = " + user);
                writer.write(user.getName());
                writer.write(SEPARATOR);
                writer.write(user.getEmail() == null ? "" : user.getEmail());
                writer.write(SEPARATOR);
                if (user.getAddress() == null) {
                    writer.newLine();
                    return;
                }

                writer.write(user.getAddress().getCity());
                writer.write(SEPARATOR);
                writer.write(user.getAddress().getStreet());
                writer.write(" ");
                writer.write("" + user.getAddress().getNumber());
                //System.out.println("user.getAddress().getNumber() = " + user.getAddress().getNumber());
                writer.write(SEPARATOR);
                writer.write(user.getAddress().getZipCode());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
