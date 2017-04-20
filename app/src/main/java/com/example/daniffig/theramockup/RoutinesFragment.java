package com.example.daniffig.theramockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by daniffig on 19/04/17.
 */

public class RoutinesFragment extends Fragment {

    static final String[] ROUTINES = new String[] { "Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7", "Week 8" };

    public RoutinesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_routines, container, false);

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*
        ListView listViewRoutines = (ListView) rootView.findViewById(R.id.listViewRoutines);

        listViewRoutines.setAdapter(new RoutineArrayAdapter(this.getContext(), ROUTINES));
        listViewRoutines.setTextFilterEnabled(true);

        listViewRoutines.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Intent routineActivityIntent = new Intent(RoutinesFragment.this.getActivity(), RoutineActivity.class);
                routineActivityIntent.putExtra("ACTIVITY_NAME", RoutinesFragment.ROUTINES[position]);
                startActivity(routineActivityIntent);
            }
        });
        */

        RecyclerView rvRoutines = (RecyclerView) rootView.findViewById(R.id.rvRoutines);
        rvRoutines.setHasFixedSize(true);;
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvRoutines.setLayoutManager(llm);

        rvRoutines.setAdapter(new RoutineAdapter(Routine.doSelectAll()));

        return rootView;
    }
}
