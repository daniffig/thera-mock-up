package com.example.daniffig.theramockup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;

import com.example.daniffig.theramockup.model.Routine;

public class RoutineActivity extends AppCompatActivity {
    private Routine routine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        routine = Routine.doSelectById(getIntent().getLongExtra("ROUTINE_ID", 0));

        setTitle(routine.getName());

        TextView cvRoutineDetailTitle = (TextView) findViewById(R.id.tvRoutineDetailTitle);

        cvRoutineDetailTitle.setText(routine.getName());

        ListView lvRoutineExercises = (ListView) findViewById(R.id.lvRoutineExercises);

        lvRoutineExercises.setAdapter(new RoutineArrayAdapter(this.getApplicationContext(), Routine.doSelectAll()));
    }

}
