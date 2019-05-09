package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class PopReschedule extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    static final ArrayList<String> delaytimeList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popreschedule);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.6));

        spinner = findViewById(R.id.delaytimeList);

        delaytimeList.clear();
        delaytimeList.add("30 Menit");
        delaytimeList.add("60 Menit");
        delaytimeList.add("90 Menit");
        delaytimeList.add("120 Menit");
        delaytimeList.add("Cancel");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(PopReschedule.this, android.R.layout.simple_spinner_item, delaytimeList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setScrollContainer(true);
        spinner.setOnItemSelectedListener(PopReschedule.this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(PopReschedule.this, delaytimeList.get(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
