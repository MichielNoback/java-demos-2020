package nl.bioinf.java_demos.lesson7;

import nl.bioinf.java_demos.lesson6.Address;
import nl.bioinf.java_demos.lesson6.User;

import java.util.Scanner;

//class should not be subclassed
public final class UserManagerApp {
    private static final String USER_REPO_LOCATION = "./data/users.csv";
    private static final String SCANNER_FORMAT_STRING = "___%-10s___";
    private UserRepository userRepository;

    //class should not be instantiated or subclassed
    private UserManagerApp() { }

    /**
     * entry point of the application
     * @param args
     */
    public static void main(String[] args) {
        //get out of static!
        UserManagerApp app = new UserManagerApp();
        app.start();
    }

    /**
     * main app logic; private!
     */
    private void start() {
        initializeUserRepo();
        processNewUsers();
        saveUsers();
    }


    private void initializeUserRepo() {
        this.userRepository = new UserRepository(USER_REPO_LOCATION);
        userRepository.readUsers();
    }

    /**
     * Processes new users entered via the command line
     * Better is the Console class, but that does not work within IntelliJ terminal
     */
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
            //alternatively, but conflicting with the method flow:
            //in.nextInt();

            System.out.println(String.format(SCANNER_FORMAT_STRING, "zip code"));
            String zipCode = in.nextLine();

            try {
                Address address = new Address(city, street, number, zipCode);
                User user = new User(name, email, address);
                System.out.println("user = " + user);
                this.userRepository.addUser(user);
            } catch (Exception ex) {
                System.err.println("Something went wrong storing the User. Please try again");
            }

        } while (input.length() > 0);
    }

    /**
     * saves all users to the repo
     */
    private void saveUsers() {
        userRepository.save();
    }

}
