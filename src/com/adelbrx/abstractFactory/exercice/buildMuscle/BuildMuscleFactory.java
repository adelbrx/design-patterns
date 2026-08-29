package com.adelbrx.abstractFactory.exercice.buildMuscle;

import com.adelbrx.abstractFactory.exercice.GoalFactory;
import com.adelbrx.abstractFactory.exercice.MealPlan;
import com.adelbrx.abstractFactory.exercice.WorkoutPlan;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkoutPlan();
    }
}
