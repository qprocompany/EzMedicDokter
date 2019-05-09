package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    static final ArrayList<String> settingWaktu = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        spinner = findViewById(R.id.settingWaktu);

        settingWaktu.clear();
        settingWaktu.add("3 Menit");
        settingWaktu.add("5 Menit");
        settingWaktu.add("10 Menit");
        settingWaktu.add("15 Menit");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Settings.this, android.R.layout.simple_spinner_item, settingWaktu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setScrollContainer(true);
        spinner.setOnItemSelectedListener(Settings.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(Settings.this, settingWaktu.get(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
