package com.example.daniffig.theramockup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniffig.theramockup.com.example.daniffig.theramockup.model.Exercise;

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

        rvExercises.setAdapter(new ExerciseAdapter(Exercise.doSelectAll()));

        return rootView;
    }
}
