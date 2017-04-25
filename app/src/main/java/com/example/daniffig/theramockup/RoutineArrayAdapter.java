package com.example.daniffig.theramockup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.daniffig.theramockup.model.Routine;

import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class RoutineArrayAdapter extends ArrayAdapter<Routine> {
    private final Context context;
    private final List<Routine> values;


    public RoutineArrayAdapter(Context context, List<Routine> values) {
        super(context, R.layout.list_routine, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_routine, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.tvRoutinelabel);

        textView.setText(values.get(position).name);

        return rowView;
    }
}
