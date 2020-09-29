package nl.bioinf.java_demos.snippets;

import nl.bioinf.java_demos.lesson5.CombinerFactory;
import nl.bioinf.java_demos.lesson5.NumberCombiner;

import java.util.ArrayList;
import java.util.List;

public class NumberCombinerConsumer {
    public static void main(String[] args) {
        final NumberCombiner numberAdder = CombinerFactory.getNumberAdder();
        System.out.println("A " + numberAdder.combine(2, 5));

        //not possible
        //NumberCombiner combiner = new NumberAdder();

        final NumberCombiner numberDivider = CombinerFactory.getNumberDivider();
        System.out.println("B " + numberDivider.combine(15, 5));

        List<NumberCombiner> combiners = new ArrayList<>();
        combiners.add(numberAdder);
        combiners.add(numberDivider);
        combiners.add(CombinerFactory.getNumberPowerUpper());

        for (NumberCombiner com : combiners) {
            System.out.println("C " + com.combine(4, 4));
        }//polymorphism
    }
}
