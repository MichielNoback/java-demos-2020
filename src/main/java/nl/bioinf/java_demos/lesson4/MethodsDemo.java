package nl.bioinf.java_demos.lesson4;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("Remote URL=" + WebUser.REMOTE_URL_BASE);

        WebUser henk = new WebUser("Henk");
        System.out.println("Henk: " + henk);

        //two ways to get clearance
        System.out.println("clearance = " + WebUser.getSecurityClearance(henk));

        henk.addRole("ADMIN");

        System.out.println("clearance = " + henk.getSecurityClearance());

        WebUser.kill(henk);

        System.out.println("Henk: " + henk);

    }
}
