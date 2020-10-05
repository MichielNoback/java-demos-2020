package nl.bioinf.java_demos.lesson6;

import java.util.HashSet;
import java.util.Set;

public class UserCollectionDemo {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        final User henk = new User("Henk", "henk@example.com");
        final User piet = new User("Piet", "piet@example.com");
        users.add(henk);
        users.add(piet);
        System.out.println("users.size() = " + users.size());
        henk.setName("Henkie");
        System.out.println("users.size() = " + users.size());
        System.out.println("users.contains(\"henk\") = " + users.contains("henk"));
    }

}
