package nl.bioinf.java_demos.lesson9;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceAlignerTest {
    @Tag("demos")
    @Test
    public void align() {
        //System.out.println("penalty = " + AlignmentAlgorithm.LOCAL.getMismatchPenalty());
        SequenceAligner sequenceAligner = new SequenceAligner(AlignmentAlgorithm.SEMIGLOBAL);
        sequenceAligner.align();

        for (AlignmentAlgorithm algorithm : AlignmentAlgorithm.values()) {
            System.out.println(algorithm + ": " +  algorithm.getMismatchPenalty());
        }
    }
}