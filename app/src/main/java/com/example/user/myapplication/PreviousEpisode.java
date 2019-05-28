package com.example.user.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class PreviousEpisode extends AppCompatActivity {

    Button addEpisodeBtn;
    LinearLayout episode1, episode2;
    ImageView alergi;

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

        episode2 = (LinearLayout) findViewById(R.id.episode2);
        episode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousEpisode.this, DetailPreviousEpisode2.class);
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

        alergi = (ImageView) findViewById(R.id.alergi);
        alergi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviousEpisode.this, AlergiProblem.class);
                startActivity(intent);
            }
        });


    }
}
