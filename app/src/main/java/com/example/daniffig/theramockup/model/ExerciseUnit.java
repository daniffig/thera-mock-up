package com.example.daniffig.theramockup.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 26/04/17.
 */

public class ExerciseUnit {
    private Long id;
    private String singular;
    private String plural;
    private String shortSingular;
    private String shortPlural;

    static private Long CURRENT_ID = 1L;
    static private List<ExerciseUnit> DATABASE = null;

    public ExerciseUnit(String singular, String plural, String shortSingular, String shortPlural) {
        super();
        this.setId(CURRENT_ID++);
        this.setSingular(singular);
        this.setPlural(plural);
        this.shortSingular(shortSingular);
        this.shortPlural(shortPlural);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSingular() {
        return singular;
    }

    public void setSingular(String singular) {
        this.singular = singular;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public String getShortSingular() {
        return shortSingular;
    }

    public void setShortSingular(String shortSingular) {
        this.shortSingular = shortSingular;
    }

    public String getShortPlural() {
        return shortPlural;
    }

    public void setShortPlural(String shortPlural) {
        this.shortPlural = shortPlural;
    }

    // class methods

    static public List<ExerciseUnit> doSelectAll() {
        if (DATABASE == null) {
            DATABASE = new ArrayList<ExerciseUnit>();

            DATABASE.add(new ExerciseUnit("Second", "Seconds", "Sec"));
            DATABASE.add(new ExerciseUnit("Time", "Times", "Times"));
        }

        return DATABASE;
    }

    static public ExerciseUnit doSelectById(Long id) {
        for (ExerciseUnit eu : doSelectAll()) {
            if (eu.getId() == id) return eu;
        }
        return null;
    }
}
