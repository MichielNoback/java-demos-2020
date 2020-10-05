package nl.bioinf.java_demos.lesson7;

import nl.bioinf.java_demos.lesson6.Address;
import nl.bioinf.java_demos.lesson6.User;

import java.util.Scanner;

//class should not be subclassed
public final class UserManagerApp {
    private static final String userRepoLocation = "./data/users.csv";
    private static final String SCANNER_FORMAT_STRING = "___%-10s___";
    private UserRepository userRepository;

    //class should not be instantiated or subclassed
    private UserManagerApp() { }


    public static void main(String[] args) {
        UserManagerApp app = new UserManagerApp();
        app.start();
    }

    private void start() {
        initializeUserRepo();
        processNewUsers();
        saveUsers();

    }

    private void initializeUserRepo() {
        this.userRepository = new UserRepository(userRepoLocation);
        userRepository.readUsers();
    }

    private void processNewUsers() {
        System.out.println("When you are finished entering users, just enter an empty line");

        Scanner in = new Scanner(System.in);
        String input = "new";
        do {
            System.out.println(String.format(SCANNER_FORMAT_STRING, "name"));
            String name = in.nextLine();

            if (name.length() == 0) {
                System.out.println("finished");
                break;
            }

            System.out.println(String.format(SCANNER_FORMAT_STRING, "email"));
            String email = in.nextLine();

            System.out.println(String.format(SCANNER_FORMAT_STRING, "city"));
            String city = in.nextLine();

            System.out.println(String.format(SCANNER_FORMAT_STRING, "street"));
            String street = in.nextLine();

            System.out.println(String.format(SCANNER_FORMAT_STRING, "number"));
            int number = Integer.parseInt(in.nextLine());

            System.out.println(String.format(SCANNER_FORMAT_STRING, "zip code"));
            String zipCode = in.nextLine();

            Address address = new Address(city, street, number, zipCode);
            User user = new User(name, email, address);
            this.userRepository.addUser(user);

        } while (input.length() > 0);
    }

    private void saveUsers() {
        userRepository.save();
    }


}
