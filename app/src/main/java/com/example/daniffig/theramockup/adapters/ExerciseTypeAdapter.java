package com.example.daniffig.theramockup.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniffig.theramockup.ExerciseTypeActivity;
import com.example.daniffig.theramockup.R;
import com.example.daniffig.theramockup.model.ExerciseType;

import java.util.List;

/**
 * Created by daniffig on 25/04/17.
 */

public class ExerciseTypeAdapter extends RecyclerView.Adapter<ExerciseTypeAdapter.ExerciseTypeViewHolder> {
    private RecyclerView rvView;
    private List<ExerciseType> exerciseTypeList;

    public ExerciseTypeAdapter(RecyclerView rvView, List<ExerciseType> exerciseTypeList) {
        this.rvView = rvView;
        this.exerciseTypeList = exerciseTypeList;
    }

    @Override
    public int getItemCount() {
        return exerciseTypeList.size();
    }

    @Override
    public void onBindViewHolder(ExerciseTypeAdapter.ExerciseTypeViewHolder exerciseTypeViewHolder, int i) {
        final ExerciseType exerciseType = exerciseTypeList.get(i);

        exerciseTypeViewHolder.tvName.setText(exerciseType.getName());
        exerciseTypeViewHolder.ivImage.setImageResource(exerciseType.getImageId());

        exerciseTypeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercisesTypeActivityIntent = new Intent(ExerciseTypeAdapter.this.rvView.getContext(), ExerciseTypeActivity.class);
                exercisesTypeActivityIntent.putExtra("EXERCISE_TYPE_ID", exerciseType.getId());
                ExerciseTypeAdapter.this.rvView.getContext().startActivity(exercisesTypeActivityIntent);
            }
        });
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
