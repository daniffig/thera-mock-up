package com.example.daniffig.theramockup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniffig on 19/04/17.
 */

public class ExercisesFragment extends Fragment {

    public ExercisesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_exercises, container, false);

        RecyclerView rvExercises = (RecyclerView) rootView.findViewById(R.id.rvExercises);
        rvExercises.setHasFixedSize(true);;
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvExercises.setLayoutManager(llm);

        List<Exercise> exerciseList = new ArrayList<Exercise>();

        Exercise e1 = new Exercise();
        e1.name = "Exercise 1";
        Exercise e2 = new Exercise();
        e2.name = "Exercise 2";
        Exercise e3 = new Exercise();
        e3.name = "Exercise 3";
        Exercise e4 = new Exercise();
        e4.name = "Exercise 4";

        exerciseList.add(e1);
        exerciseList.add(e2);
        exerciseList.add(e3);
        exerciseList.add(e4);

        rvExercises.setAdapter(new ExerciseAdapter(exerciseList));

        return rootView;
    }
}
