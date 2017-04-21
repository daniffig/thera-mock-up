package com.example.daniffig.theramockup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.daniffig.theramockup.com.example.daniffig.theramockup.model.Routine;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class RoutineActivity extends AppCompatActivity {

    private Routine routine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        routine = Routine.doSelectOne(getIntent().getIntExtra("ROUTINE_ID", 0));

        setTitle(routine.name);

        TextView cvRoutineDetailTitle = (TextView) findViewById(R.id.tvRoutineDetailTitle);

        cvRoutineDetailTitle.setText(routine.name);

        ListView lvRoutineExercises = (ListView) findViewById(R.id.lvRoutineExercises);

        lvRoutineExercises.setAdapter(new RoutineArrayAdapter(this.getApplicationContext(), Routine.doSelectAll()));
    }

}
