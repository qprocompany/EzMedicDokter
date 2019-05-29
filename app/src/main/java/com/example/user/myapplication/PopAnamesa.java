package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class PopAnamesa extends Activity {

    Button tambah;

    CheckBox box1, box2, box3, box4, box5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popanamesa);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.7));

        tambah = (Button) findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent =new  Intent(PopAnamesa.this, DetailPasien2.class);
                    intent.putExtra("KEY", "Batuk berdahark sejak ... Hari lalu dan tenggorokan berasa sakit disertai demam");
                    startActivity(intent);
            }
        });

    }
}
