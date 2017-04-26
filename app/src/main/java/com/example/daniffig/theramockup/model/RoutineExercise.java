package com.example.daniffig.theramockup.model;

import java.util.List;

/**
 * Created by daniffig on 26/04/17.
 */

public class RoutineExercise {
    private Long id;
    private Routine routine;
    private Exercise exercise;
    private Integer quantity;

    static private Long CURRENT_ID = 1L;

    public RoutineExercise(Routine routine, Exercise exercise, Integer quantity) {
        super();
        this.setId(CURRENT_ID++);
        this.setRoutine(routine);
        this.setExercise(exercise);
        this.setQuantity(quantity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFormattedQuantity() {
        return getQuantity() + " " + getExercise().getExerciseUnit().getShortName()
    }

    static public RoutineExercise generateRandomFor(Routine routine) {
        return new RoutineExercise(routine, Exercise.getRandom(), (int) (1 + Math.random() * (30)));
    }
}
