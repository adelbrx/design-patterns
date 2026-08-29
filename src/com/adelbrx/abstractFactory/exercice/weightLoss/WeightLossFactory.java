package com.adelbrx.abstractFactory.exercice.weightLoss;

import com.adelbrx.abstractFactory.exercice.GoalFactory;
import com.adelbrx.abstractFactory.exercice.MealPlan;
import com.adelbrx.abstractFactory.exercice.WorkoutPlan;

public class WeightLossFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkoutPlan();
    }
}
