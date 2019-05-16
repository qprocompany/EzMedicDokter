package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class PreviousEpisode extends AppCompatActivity {

    Button addEpisodeBtn;
    LinearLayout episode1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_episode);

        episode1 = (LinearLayout) findViewById(R.id.episode1);
        episode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousEpisode.this, DetailPreviousEpisode.class);
                startActivity(intent);
            }
        });

        addEpisodeBtn = (Button) findViewById(R.id.addEpisodeBtn);
        addEpisodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousEpisode.this, DetailPasien.class);
                startActivity(intent);
            }
        });


    }
}
