package nl.bioinf.java_demos.snippets;

import java.util.ArrayList;
import java.util.List;

public class FindTheBug {
    List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        FindTheBug bugger = new FindTheBug();
        bugger.addSome();
    }

    private void addSome() {
        names.add("Rose");
        names.add(new String("Peter"));
        //return names;
    }
}
