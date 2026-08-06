package com.adelbrx.state.exercice;

public class Demo {
    public static  void show() {
        var directionService = new DirectionService(new Transit());

        var codeEta = directionService.getEta();
        System.out.println(codeEta);

        var codeDirection = directionService.getDirection();
        System.out.println(codeDirection);
    }
}
