package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class DetailPasien extends AppCompatActivity {

    Button next;
    ImageView popProblem , popAlergi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien);

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien.this, DetailPasien2.class);
                startActivity(intent);
            }
        });

        popProblem = (ImageView) findViewById(R.id.popProblem);
        popProblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien.this, PopProblem.class);
                startActivity(intent);
            }
        });

        popAlergi = (ImageView) findViewById(R.id.popAlergi);
        popAlergi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien.this, PopAlergi.class);
                startActivity(intent);
            }
        });


    }

}
