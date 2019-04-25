package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TemplateResep extends AppCompatActivity {

    ImageView editResep1, editResep2, deleteResep1, deleteResep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_resep);

        editResep1 = (ImageView) findViewById(R.id.editResep1);
        editResep2 = (ImageView) findViewById(R.id.editResep1);
        deleteResep1 = (ImageView) findViewById(R.id.deleteResep1);
        deleteResep2 = (ImageView) findViewById(R.id.deleteResep2);

        editResep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateResep.this, PopEditResep.class);
                startActivity(intent);
            }
        });

        editResep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateResep.this, PopEditResep.class);
                startActivity(intent);
            }
        });

        deleteResep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateResep.this, PopDelete.class);
                startActivity(intent);
            }
        });

        deleteResep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TemplateResep.this, PopDelete.class);
                startActivity(intent);
            }
        });

    }
}
