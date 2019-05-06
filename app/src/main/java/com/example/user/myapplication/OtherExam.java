package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OtherExam extends AppCompatActivity {

    ImageView editOther1, editOther2, deleteOther1, deleteOther2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_exam);

        editOther1 = (ImageView) findViewById(R.id.editOther1);
        editOther2 = (ImageView) findViewById(R.id.editOther2);
        deleteOther1 = (ImageView) findViewById(R.id.deleteOther1);
        deleteOther2 = (ImageView) findViewById(R.id.deleteOther2);

        editOther1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherExam.this, PopEditOther.class);
                startActivity(intent);
            }
        });

        editOther2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherExam.this, PopEditRadio.class);
                startActivity(intent);
            }
        });

        deleteOther1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherExam.this, PopDelete.class);
                startActivity(intent);
            }
        });

        deleteOther2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherExam.this, PopDelete.class);
                startActivity(intent);
            }
        });

    }
}
