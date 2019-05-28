package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MedicalPathway extends AppCompatActivity {

    ImageView editMed1, editMed2, deleteMed1, deleteMed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_pathway);

        editMed1 = (ImageView) findViewById(R.id.editMed1);
        editMed2 = (ImageView) findViewById(R.id.editMed2);
        deleteMed1 = (ImageView) findViewById(R.id.deleteMed1);
        deleteMed2 = (ImageView) findViewById(R.id.deleteMed2);

        editMed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicalPathway.this, PopEditMedicalPathway.class);
                startActivity(intent);
            }
        });

        editMed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicalPathway.this, PopEditMedicalPathway.class);
                startActivity(intent);
            }
        });

        deleteMed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicalPathway.this, PopDelete.class);
                startActivity(intent);
            }
        });

        deleteMed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicalPathway.this, PopDelete.class);
                startActivity(intent);
            }
        });

    }
}
