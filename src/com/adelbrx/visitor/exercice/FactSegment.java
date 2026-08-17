package com.adelbrx.visitor.exercice;

public class FactSegment implements Segment {
    @Override
    public void accept(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
