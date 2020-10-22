package nl.bioinf.java_demos.lesson10;

public class TextDecorator {
    private final String text;

    public TextDecorator(String text) {
        this.text = text;
    }

    public String decorate() {
        return "~~~~~" + text + "~~~~~";
    }

    //getter
    protected String getText() {
        return text;
    }
}
