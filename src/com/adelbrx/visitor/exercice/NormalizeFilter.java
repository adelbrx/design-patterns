package com.adelbrx.visitor.exercice;

public class NormalizeFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Fact Segment -> Normalize");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Format Segment -> Normalize");
    }
}
