package nl.bioinf.java_demos.lesson1;

class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    void start() {
        //Create a Bird and let it fly
        Bird genericBird = new Bird("Generic Bird");
        genericBird.fly();

        //Create a House Sparrow
        HouseSparrow houseSparrow = new HouseSparrow();
        houseSparrow.fly();

        //Create a Buzzard
        Buzzard buzzard = new Buzzard();
        buzzard.fly();
    }
}
