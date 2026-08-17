package com.adelbrx.visitor.exercice;

public class FormatSegment implements Segment {
    @Override
    public void accept(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
