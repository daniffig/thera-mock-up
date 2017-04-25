package com.example.daniffig.theramockup.model;

import com.example.daniffig.theramockup.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 25/04/17.
 */

public class ExerciseType {
    private long id;
    private String name;
    private int imageId;

    static private Long CURRENT_ID = 1L;
    static private List<ExerciseType> DATABASE = null;

    public ExerciseType(String name, int imageId) {
        super();
        this.setId(ExerciseType.CURRENT_ID++);
        this.setName(name);
        this.setImageId(imageId);
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    // class methods

    static public List<ExerciseType> doSelectAll() {
        if (DATABASE == null) {
            DATABASE = new ArrayList<ExerciseType>();

            DATABASE.add(new ExerciseType("Tongue exercises", R.mipmap.tongue_exercises));
            DATABASE.add(new ExerciseType("Mouth exercises", R.mipmap.mouth_exercises));
            DATABASE.add(new ExerciseType("Lips exercises", R.mipmap.lips_exercises));
            DATABASE.add(new ExerciseType("Jaw exercises", R.mipmap.jaw_exercises));
        }

        return DATABASE;
    }

    static public ExerciseType doSelectById(long id) {
        for (ExerciseType et : doSelectAll()) {
            if (et.getId() == id) return et;
        }
        return null;
    }
}
