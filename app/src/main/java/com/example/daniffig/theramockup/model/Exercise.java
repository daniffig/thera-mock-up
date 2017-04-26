package com.example.daniffig.theramockup.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class Exercise {
    private Long id;
    private String name;
    private ExerciseUnit exerciseUnit;

    static private Long CURRENT_ID = 1L;
    static private List<ExerciseUnit> DATABASE = null;

    public Exercise(String name, ExerciseUnit exerciseUnit) {
        super();
        this.setName(name);
        this.setExerciseUnit(exerciseUnit);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExerciseUnit getExerciseUnit() {
        return exerciseUnit;
    }

    public void setExerciseUnit(ExerciseUnit exerciseUnit) {
        this.exerciseUnit = exerciseUnit;
    }

    // class methods

    static public List<Exercise> doSelectAll() {
        List<Exercise> exerciseList = new ArrayList<Exercise>();

        exerciseList.add(new Exercise("Protuir", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Retruir", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Caramelo", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Inflar cachetes", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Lengua arriba", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Lengua abajo", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Lengua a la derecha", ExerciseUnit.doSelectById(1L)));
        exerciseList.add(new Exercise("Lengua a la izquierda", ExerciseUnit.doSelectById(1L)));

        return exerciseList;
    }

    static public Exercise doSelectById(Long id) {
        for (Exercise e : doSelectAll()) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    static public Exercise getRandom() {
        return Exercise.doSelectById((long) (1 + Math.random() * CURRENT_ID));
    }
}
