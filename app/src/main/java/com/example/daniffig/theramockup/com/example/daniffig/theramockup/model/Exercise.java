package com.example.daniffig.theramockup.com.example.daniffig.theramockup.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class Exercise {
    public String name;

    public Exercise(String name) {
        super();
        this.name = name;
    }

    static public List<Exercise> doSelectAll() {
        List<Exercise> exerciseList = new ArrayList<Exercise>();

        exerciseList.add(new Exercise("Protuir"));
        exerciseList.add(new Exercise("Retruir"));
        exerciseList.add(new Exercise("Caramelo"));
        exerciseList.add(new Exercise("Inflar cachetes"));
        exerciseList.add(new Exercise("Lengua arriba"));
        exerciseList.add(new Exercise("Lengua abajo"));
        exerciseList.add(new Exercise("Lengua a la derecha"));
        exerciseList.add(new Exercise("Lengua a la izquierda"));

        return exerciseList;
    }

    static public Exercise doSelectOne(int i) {
        return Exercise.doSelectAll().get(i);
    }
}
