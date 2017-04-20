package com.example.daniffig.theramockup;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

/**
 * Created by daniffig on 20/04/17.
 */

public class ExerciseViewHolder extends RecyclerView.ViewHolder {
    protected TextView tvName;

    public ExerciseViewHolder(View v) {
        super(v);
        tvName = (TextView) v.findViewById(R.id.tvExerciseTitle);
    }
}
