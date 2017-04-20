package com.example.daniffig.theramockup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class RoutineAdapter extends RecyclerView.Adapter<RoutineAdapter.RoutineViewHolder> {
    private List<Routine> routineList;

    public RoutineAdapter(List<Routine> routineList) {
        this.routineList = routineList;
    }

    @Override
    public int getItemCount() {
        return routineList.size();
    }

    @Override
    public void onBindViewHolder(RoutineViewHolder routineViewHolder, int i) {
        Routine routine = routineList.get(i);

        routineViewHolder.tvName.setText(routine.name);
    }

    @Override
    public RoutineViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_routine, viewGroup, false);

        return new RoutineViewHolder(itemView);
    }

    public class RoutineViewHolder extends RecyclerView.ViewHolder {
        protected TextView tvName;

        public RoutineViewHolder(View v) {
            super(v);
            tvName = (TextView) v.findViewById(R.id.tvRoutineTitle);
        }
    }
}
