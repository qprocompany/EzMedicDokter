package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DetailPasien3 extends AppCompatActivity {
    Button next;

    ImageView popObat, popLab, popRad, popOther, popMedical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien3);

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, DetailPasien4.class);
                startActivity(intent);
            }
        });

        popObat = (ImageView) findViewById(R.id.popObat);
        popObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, PopObat.class);
                startActivity(intent);
            }
        });

        popLab = (ImageView) findViewById(R.id.popLab);
        popLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, PopLab.class);
                startActivity(intent);
            }
        });

        popRad = (ImageView) findViewById(R.id.popRad);
        popRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, PopRadiologi.class);
                startActivity(intent);
            }
        });


        popOther= (ImageView) findViewById(R.id.popOther);
        popOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, PopOtherExam.class);
                startActivity(intent);
            }
        });

        popMedical= (ImageView) findViewById(R.id.popMedical);
        popMedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien3.this, PopMedicalPathway.class);
                startActivity(intent);
            }
        });

    }
}
