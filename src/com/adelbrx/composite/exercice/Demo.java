package com.adelbrx.composite.exercice;

public class Demo {
    public static void show() {
        var team1 = new Team();
        team1.add(new Truck());
        team1.add(new HumanRessource());
        team1.add(new HumanRessource());

        var team2 = new Team();
        team2.add(new Truck());
        team2.add(new HumanRessource());
        team2.add(new HumanRessource());

        var team = new Team();
        team.add(team1);
        team.add(team2);

        team.deploy();
    }
}
