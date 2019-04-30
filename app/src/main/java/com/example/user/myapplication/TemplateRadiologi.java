package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TemplateRadiologi extends AppCompatActivity {

    ImageView editRadio1, editRadio2, deleteRadio1, deleteRadio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_radiologi);

        editRadio1 = (ImageView) findViewById(R.id.editRadio1);
        editRadio2 = (ImageView) findViewById(R.id.editRadio2);
        deleteRadio1 = (ImageView) findViewById(R.id.deleteRadio1);
        deleteRadio2 = (ImageView) findViewById(R.id.deleteRadio2);

        editRadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateRadiologi.this, PopEditRadio.class);
                startActivity(intent);
            }
        });

        editRadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateRadiologi.this, PopEditRadio.class);
                startActivity(intent);
            }
        });

        deleteRadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateRadiologi.this, PopDelete.class);
                startActivity(intent);
            }
        });

        deleteRadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateRadiologi.this, PopDelete.class);
                startActivity(intent);
            }
        });
    }
}
