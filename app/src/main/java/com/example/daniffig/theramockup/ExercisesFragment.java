package com.example.daniffig.theramockup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniffig.theramockup.adapters.ExerciseTypeAdapter;
import com.example.daniffig.theramockup.model.ExerciseType;

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

        RecyclerView rvExerciseTypes = (RecyclerView) rootView.findViewById(R.id.rvExerciseTypes);
        rvExerciseTypes.setHasFixedSize(true);;
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvExerciseTypes.setLayoutManager(llm);

        rvExerciseTypes.setAdapter(new ExerciseTypeAdapter(rvExerciseTypes, ExerciseType.doSelectAll()));

        return rootView;
    }
}
