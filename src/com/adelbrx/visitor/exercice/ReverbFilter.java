package com.adelbrx.visitor.exercice;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Fact Segment -> Add reverb");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Format Segment -> Add reverb");
    }
}
