package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TemplateLab extends AppCompatActivity {

    ImageView editLab1, editLab2, deleteLab1, deleteLab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_lab);

        editLab1 = (ImageView) findViewById(R.id.editLab1);
        editLab2 = (ImageView) findViewById(R.id.editLab2);
        deleteLab1 = (ImageView) findViewById(R.id.deleteLab1);
        deleteLab2 = (ImageView) findViewById(R.id.deleteLab2);

        editLab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateLab.this, PopEditLab.class);
                startActivity(intent);
            }
        });

        editLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateLab.this, PopEditLab.class);
                startActivity(intent);
            }
        });

        deleteLab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateLab.this, PopDelete.class);
                startActivity(intent);
            }
        });

        deleteLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateLab.this, PopDelete.class);
                startActivity(intent);
            }
        });

    }
}
