package nl.bioinf.java_demos.lesson1;

class Bird {
    String name;

    //constructor: __init__(self):
    Bird(String birdName) {
        this.name = birdName; //this === self (in python)
    }

    void fly() {
        System.out.println("I am a " + this.name + " so I like to fly"); //print()
    }
}
