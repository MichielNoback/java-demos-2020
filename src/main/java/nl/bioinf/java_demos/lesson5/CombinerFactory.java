package nl.bioinf.java_demos.lesson5;

public class CombinerFactory {
    public static NumberCombiner getNumberAdder() {
        //uses regular top-level class
        return new NumberAdder();
    }

    public static NumberCombiner getNumberDivider() {
        //uses inner class
        return new NumberDivider();
    }

    public static NumberCombiner getNumberPowerUpper() {
        //uses anonymous inner class
        return new NumberCombiner() {
            @Override
            public int combine(int first, int second) {
                return (int)Math.pow(first, second);
            }
        };
    }

    //static inner class
    static class NumberDivider implements NumberCombiner {
        @Override
        public int combine(int first, int second) {
            return (int)((double)first / second);
        }
    }
}
