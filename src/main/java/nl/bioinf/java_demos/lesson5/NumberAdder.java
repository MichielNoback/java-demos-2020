package nl.bioinf.java_demos.lesson5;

class NumberAdder implements NumberCombiner{

    @Override
    public int combine(int first, int second) {
        return first + second;
    }
}
