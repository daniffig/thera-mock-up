package com.example.daniffig.theramockup.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniffig.theramockup.R;
import com.example.daniffig.theramockup.RoutineActivity;
import com.example.daniffig.theramockup.model.Routine;

import java.util.List;

/**
 * Created by daniffig on 20/04/17.
 */

public class RoutineAdapter extends RecyclerView.Adapter<RoutineAdapter.RoutineViewHolder> {
    private RecyclerView rvView;
    private List<Routine> routineList;

    public RoutineAdapter(RecyclerView rvView, List<Routine> routineList) {
        this.rvView = rvView;
        this.routineList = routineList;
    }

    @Override
    public int getItemCount() {
        return routineList.size();
    }

    @Override
    public void onBindViewHolder(RoutineViewHolder routineViewHolder, int i) {
        final Routine routine = routineList.get(i);

        routineViewHolder.tvName.setText(routine.getName());

        routineViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent routineActivityIntent = new Intent(RoutineAdapter.this.rvView.getContext(), RoutineActivity.class);
                routineActivityIntent.putExtra("ROUTINE_ID", routine.getId());
                RoutineAdapter.this.rvView.getContext().startActivity(routineActivityIntent);
            }
        });
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
            tvName = (TextView) v.findViewById(R.id.tvRoutineName);
        }
    }
}
