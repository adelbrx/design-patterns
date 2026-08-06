package com.adelbrx.memento.exercice;

public class Demo {
    public static void show() {
        var originator = new Document();
        var caretaker = new History();

        originator.setContent("c1");
        originator.setFontName("f1");
        originator.setFontSize(1);
        caretaker.push(originator.createMemento());

        System.out.println("Step 1 :");
        System.out.println(originator.toString());


        originator.setContent("c2");
        originator.setFontName("f2");
        originator.setFontSize(2);
        caretaker.push(originator.createMemento());

        System.out.println("Step 2 :");
        System.out.println(originator.toString());


        originator.setContent("c3");

        System.out.println("Step 3 :");
        System.out.println(originator.toString());


        originator.restore(caretaker.pop());

        System.out.println("After undo 1:");
        System.out.println(originator.toString());


        originator.restore(caretaker.pop());

        System.out.println("After undo 2:");
        System.out.println(originator.toString());

    }
}