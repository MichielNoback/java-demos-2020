package nl.bioinf.java_demos.lesson1;

class Buzzard extends Bird{

    Buzzard() {
        super("buzzard");
    }

    @Override
    void fly() {
        System.out.println("I don't simply fly, I soar!");
    }
}
