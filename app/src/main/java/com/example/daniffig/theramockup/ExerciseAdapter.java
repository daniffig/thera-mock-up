package com.example.daniffig.theramockup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseViewHolder> {
    private List<Exercise> exerciseList;

    public ExerciseAdapter(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    @Override
    public void onBindViewHolder(ExerciseViewHolder exerciseViewHolder, int i) {
        Exercise exercise = exerciseList.get(i);

        exerciseViewHolder.tvName.setText(exercise.name);
    }

    @Override
    public ExerciseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_exercise, viewGroup, false);

        return new ExerciseViewHolder(itemView);
    }
}
