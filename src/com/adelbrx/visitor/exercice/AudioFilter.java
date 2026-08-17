package com.adelbrx.visitor.exercice;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}

