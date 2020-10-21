package nl.bioinf.java_demos.lesson9;

public class SequenceAligner {
    //Needleman-Wunch:
    //Smith-Waterman: LOCAL

//    //Local alignment / Smith & Waterman / mismatch = 3
//    private static final String LOCAL = "LOCAL";
//    //Global Alignment
//    private static final String GLOBAL = "GLOBAL";
//    private static final String SEMIGLOBAL = "SEMIGLOBAL";

    private final AlignmentAlgorithm currentAlgorithm;

    public SequenceAligner(AlignmentAlgorithm currentAlgorithm) {
        this.currentAlgorithm = currentAlgorithm;
    }

    public void align() {
        switch (currentAlgorithm) {
            case LOCAL:
                System.out.println("doing " + currentAlgorithm);
                break;
            case SEMIGLOBAL:
                System.out.println("doing " + currentAlgorithm);
                break;
            case GLOBAL:
                System.out.println("doing " + currentAlgorithm);
                break;
            default:
                System.out.println("No support for " + currentAlgorithm);
        }
    }
}
