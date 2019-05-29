package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailPasien2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button next , clear;

    ImageView popAnamesa;

    Spinner spinnerAnamesa;

    EditText anamesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien2);

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien2.this, DetailPasien3.class);
                startActivity(intent);
            }
        });


        popAnamesa = (ImageView) findViewById(R.id.popAnamesa);
        popAnamesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien2.this, PopAnamesa.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        anamesa =(EditText) findViewById(R.id.anamesa);
        String txt_put =intent.getStringExtra("KEY");
        anamesa.setText(txt_put);

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anamesa.setText(" ");
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
