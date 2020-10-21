package nl.bioinf.java_demos.lesson9;

public enum AlignmentAlgorithm {
    LOCAL("Local Alignment", 3), //AlignmentAlgorithm.LOCAL = new AlignmentAlgorithm("Local Alignment);
    GLOBAL("Global Alignment", 3),
    SEMIGLOBAL("Semiglobal Alignment", 3),
    STRUCTURAL("3D Alignment", 5);
//    {
//        @Override
//        public int getMismatchPenalty() {
//        return 5;
//    }
//    }
    private final String name;
    private final int mismatchPenalty;

    AlignmentAlgorithm(String name, int mismatchPenalty) {
        this.name = name;
        this.mismatchPenalty = mismatchPenalty;
    }

    public int getMismatchPenalty() {
        return this.mismatchPenalty;
    }

    @Override
    public String toString() {
        return name;
    }
}
