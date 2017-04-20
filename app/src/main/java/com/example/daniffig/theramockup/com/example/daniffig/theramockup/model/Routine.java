package com.example.daniffig.theramockup.com.example.daniffig.theramockup.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class Routine {
    public String name;

    public Routine(String name) {
        super();
        this.name = name;
    }

    static public List<Routine> doSelectAll() {
        List<Routine> routineList = new ArrayList<Routine>();

        routineList.add(new Routine("Week 1"));
        routineList.add(new Routine("Week 2"));
        routineList.add(new Routine("Week 3"));
        routineList.add(new Routine("Week 4"));
        routineList.add(new Routine("Week 5"));
        routineList.add(new Routine("Week 6"));
        routineList.add(new Routine("Week 7"));
        routineList.add(new Routine("Week 8"));

        return routineList;
    }

    static public Routine doSelectOne(int i) {
        return Routine.doSelectAll().get(i);
    }
}
