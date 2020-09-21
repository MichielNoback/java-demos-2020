package nl.bioinf.java_demos.lesson4;

import java.util.ArrayList;
import java.util.List;

public class WebUser {
    //a static/class variable
    public static final String REMOTE_URL_BASE = "https://www.example.com?details=yes&user=";

    //a static variable; defaults to "null"
    private static List<String> possibleRoles;

    //a class initialization block
    static {
        possibleRoles = new ArrayList<>();
        possibleRoles.add("ADMIN");
        possibleRoles.add("MODERATOR");
        possibleRoles.add("USER");
        possibleRoles.add("GUEST");
    }

    //this instance variable will be given the value false at instantiation,
    // the default value for booleans
    private boolean isAlive;

    //an explicit initialization
    private String name = "ANONYMOUS";

    //declaration only; will default to "null"
    private List<String> roles;

    //an object initialization block
    //not much seen in Java code but quite useful
    {
        roles = new ArrayList<>();
        roles.add("GUEST");

        isAlive = true;
    }

    //a "no-arg" constructor
    public WebUser() { }

    //a constructor taking a name as argument
    public WebUser(String name) {
        this.name = name;
    }

    //no matter which constructor runs, the object initializer will execute!

    //a "getter"
    public String getName() {
        return name;
    }

    //a "setter"
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //an "adder"
    public void addRole(String role) {
        if (! possibleRoles.contains(role)) {
            throw new IllegalArgumentException("Unknown role provided: " + role);
        }
        this.roles.add(role);
    }

    //a regular method (object logic)
    public int getSecurityClearance() {
        return WebUser.getSecurityClearance(this);
    }

    //the String representation for printing


    @Override
    public String toString() {
        return "WebUser{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", roles=" + roles +
                '}';
    }

    //static/class logic
    public static int getSecurityClearance(WebUser user) {
        int indexOfRole = possibleRoles.size();
        for (String role : user.roles) {
            final int currentIndex = WebUser.possibleRoles.indexOf(role);
            if(currentIndex < indexOfRole) {
                indexOfRole = currentIndex;
            }
        }
        return possibleRoles.size() - indexOfRole;
    }
    //exercise: refactor this method to use switch/case logic

    //static/class logic
    public static void kill(WebUser user) {
        user.isAlive = false;
        user.roles.clear();
        user.addRole("GUEST");
    }
}
