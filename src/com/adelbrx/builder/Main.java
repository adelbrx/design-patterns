package com.adelbrx.builder;

public class Main {
    static void main(String[] args) {
        var presentation = new Presentation();

        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        presentation.export(new MovieBuilder());
    }
}
