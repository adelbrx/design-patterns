package com.adelbrx.abstractFactory.exercice;

import com.adelbrx.abstractFactory.exercice.buildMuscle.BuildMuscleFactory;
import com.adelbrx.abstractFactory.exercice.weightLoss.WeightLossFactory;

public class Demo {
    public static void show() {
        new HomePage().setGoal(new WeightLossFactory());
    }
}
