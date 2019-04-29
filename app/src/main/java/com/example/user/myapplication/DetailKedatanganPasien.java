package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DetailKedatanganPasien extends AppCompatActivity {

    LinearLayout rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kedatangan_pasien);

        rating = (LinearLayout) findViewById(R.id.rating);

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailKedatanganPasien.this , PopRating.class);
                startActivity(intent);
            }
        });

    }
}
