package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView layerNama, layerEmail, layerNo;
    ImageView edit1, edit2, edit3, edit4, edit5, delete1, delete2, updateProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ActionBar asd = getSupportActionBar();
        asd.setTitle("Profile");

        layerNama = (TextView) findViewById(R.id.layerNama);
        layerEmail = (TextView) findViewById(R.id.layerEmail);
        layerNo = (TextView) findViewById(R.id.layerNo);

        layerNama.setText("Dr. Bagasian Sp.B");
        layerEmail.setText("bagasiandp@gmail.com");
        layerNo.setText("0812123456789");

        updateProfile = (ImageView) findViewById(R.id.updateProfile);
        updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, UpdateProfile.class);
                startActivity(intent);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.medPath:
                startActivity(new Intent(this, MedicalPathway.class));
                return true;

            case R.id.resepNav:
                startActivity(new Intent(this, TemplateResep.class));
                return true;

            case R.id.labNav:
                startActivity(new Intent(this, TemplateLab.class));
                return true;

            case R.id.radNav:
                startActivity(new Intent(this, TemplateRadiologi.class));
                return true;

            case R.id.settingsNav:
                startActivity(new Intent(this, Settings.class));
                return true;

            case R.id.otherNav:
                startActivity(new Intent(this, OtherExam.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
