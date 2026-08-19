package com.adelbrx.composite.exercice;

import java.util.ArrayList;
import java.util.List;

public class Team extends Ressource {
    private List<Ressource> ressources = new ArrayList<>();

    public void add(Ressource ressource) {
        ressources.add(ressource);
    }

    @Override
    public void deploy() {
        for (var ressource : ressources)
            ressource.deploy();
    }
}
