package com.adelbrx.visitor.exercice;

public class NoiseReductionFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Fact Segment -> Reduce noise");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Format Segment -> Reduce noise");
    }
}
