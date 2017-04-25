package com.example.daniffig.theramockup.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniffig.theramockup.R;
import com.example.daniffig.theramockup.model.ExerciseType;

import java.util.List;

/**
 * Created by daniffig on 25/04/17.
 */

public class ExerciseTypeAdapter extends RecyclerView.Adapter<ExerciseTypeAdapter.ExerciseTypeViewHolder> {
    private List<ExerciseType> exerciseTypeList;

    public ExerciseTypeAdapter(List<ExerciseType> exerciseTypeList) {
        this.exerciseTypeList = exerciseTypeList;
    }

    @Override
    public int getItemCount() {
        return exerciseTypeList.size();
    }

    @Override
    public void onBindViewHolder(ExerciseTypeAdapter.ExerciseTypeViewHolder exerciseTypeViewHolder, int i) {
        ExerciseType exerciseType = exerciseTypeList.get(i);

        exerciseTypeViewHolder.tvName.setText(exerciseType.getName());
        exerciseTypeViewHolder.ivImage.setImageResource(exerciseType.getImageId());
    }

    @Override
    public ExerciseTypeAdapter.ExerciseTypeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_exercise_type, viewGroup, false);

        return new ExerciseTypeAdapter.ExerciseTypeViewHolder(itemView);
    }

    public class ExerciseTypeViewHolder extends RecyclerView.ViewHolder {
        protected ImageView ivImage;
        protected TextView tvName;

        public ExerciseTypeViewHolder(View v) {
            super(v);
            tvName = (TextView) v.findViewById(R.id.tvExerciseTypeName);
            ivImage = (ImageView) v.findViewById(R.id.ivExerciseTypeImage);
        }
    }
}
