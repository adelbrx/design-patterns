package com.adelbrx.memento;

public class Main {
     public static void main(String[] args) {
         var originator = new Originator();
         var caretaker = new Caretaker();

         originator.setContent("a");
         caretaker.push(originator.createState());

         originator.setContent("b");
         caretaker.push(originator.createState());

         originator.setContent("c");
         originator.restoreState(caretaker.pop());
         originator.restoreState(caretaker.pop());

         System.out.println(originator.getContent());
     }
}