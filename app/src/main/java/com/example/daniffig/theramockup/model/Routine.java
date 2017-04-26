package com.example.daniffig.theramockup.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by daniffig on 20/04/17.
 */

public class Routine {
    private Long id;
    private String name;
    private String description;
    private List<RoutineExercise> exercises = new ArrayList<RoutineExercise>();

    static private Long CURRENT_ID = 1L;
    static private List<Routine> DATABASE = null;

    public Routine(String name) {
        super();
        this.setId(CURRENT_ID++);
        this.setName(name);

        for (int i = 0; i < 4; i++) {
            this.getExercises().add(RoutineExercise.generateRandomFor(this));
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // class methods

    static public List<Routine> doSelectAll() {
        if (DATABASE == null) {
            DATABASE = new ArrayList<Routine>();

            DATABASE.add(new Routine("Week 1"));
            DATABASE.add(new Routine("Week 2"));
            DATABASE.add(new Routine("Week 3"));
            DATABASE.add(new Routine("Week 4"));
            DATABASE.add(new Routine("Week 5"));
            DATABASE.add(new Routine("Week 6"));
            DATABASE.add(new Routine("Week 7"));
            DATABASE.add(new Routine("Week 8"));
        }

        return DATABASE;
    }

    static public Routine doSelectById(Long id) {
        for (Routine r : doSelectAll()) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    public List<RoutineExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<RoutineExercise> exercises) {
        this.exercises = exercises;
    }
}
