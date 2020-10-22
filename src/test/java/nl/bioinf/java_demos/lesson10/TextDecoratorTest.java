package nl.bioinf.java_demos.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextDecoratorTest {

    @Test
    void decorate() {
        TextDecorator dec = new TextDecorator("hello, world");
        System.out.println(dec.decorate());

        TextDecorator dec2 = new EvilDecorator();
        System.out.println(dec2.decorate());

    }
}