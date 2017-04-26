package com.example.daniffig.theramockup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.daniffig.theramockup.model.RoutineExercise;

import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class RoutineExerciseArrayAdapter extends ArrayAdapter<RoutineExercise> {
    private final Context context;
    private final List<RoutineExercise> values;


    public RoutineExerciseArrayAdapter(Context context, List<RoutineExercise> values) {
        super(context, R.layout.list_routine_exercise, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        RoutineExercise routineExercise = values.get(position);

        View rowView = inflater.inflate(R.layout.list_routine_exercise, parent, false);
        TextView tvListRoutineName = (TextView) rowView.findViewById(R.id.tvListRoutineName);
        TextView tvListRoutineRepetitions = (TextView) rowView.findViewById(R.id.tvListRoutineRepetitions);
        tvListRoutineName.setText(routineExercise.getExercise().getName());
        tvListRoutineRepetitions.setText(routineExercise.getQuantity());

        return rowView;
    }
}
