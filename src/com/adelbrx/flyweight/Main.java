package com.adelbrx.flyweight;

public class Main {
    static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
