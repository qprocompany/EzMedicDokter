package com.example.user.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LogBook extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    Button addRanahBtn1;
    TextView judulTable1;
    LinearLayout ranahPembelajaran, ranahProfesional, ranahPengabdian, ranahPengembangan, ranahPublikasi, addRanah1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_book);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView)findViewById(R.id.sideMenuHome);
        navigationView.setNavigationItemSelectedListener(this);

        addRanahBtn1 = (Button) findViewById(R.id.addRanahBtn1);

        judulTable1 = (TextView) findViewById(R.id.judulTable1);

        addRanah1 = (LinearLayout) findViewById(R.id.addRanah1);

        ranahPembelajaran = (LinearLayout) findViewById(R.id.ranahPembelajaran);
        ranahPembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judulTable1.setText("Ranah Pembelajaran");
                addRanahBtn1.setText("Input Ranah Pembelajaran");
                addRanah1.setVisibility(view.VISIBLE);
            }
        });

        ranahProfesional = (LinearLayout) findViewById(R.id.ranahProfesional);
        ranahProfesional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judulTable1.setText("Ranah Profesional");
                addRanah1.setVisibility(view.INVISIBLE);
            }
        });

        ranahPengabdian = (LinearLayout) findViewById(R.id.ranahPengabdian);
        ranahPengabdian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judulTable1.setText("Ranah Pengabdian Masyarakat");
                addRanahBtn1.setText("Input Ranah Pengabdian Masyarakat");
                addRanah1.setVisibility(view.VISIBLE);
            }
        });

        ranahPengembangan = (LinearLayout) findViewById(R.id.ranahPengembangan);
        ranahPengembangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judulTable1.setText("Ranah Pengembangan Ilmu");
                addRanahBtn1.setText("Input Ranah Pengembangan Ilmu");
                addRanah1.setVisibility(view.VISIBLE);
            }
        });

        ranahPublikasi = (LinearLayout) findViewById(R.id.ranahPublikasi);
        ranahPublikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judulTable1.setText("Ranah Publikasi Ilmiah");
                addRanahBtn1.setText("Input Ranah Publikasi Ilmiah");
                addRanah1.setVisibility(view.VISIBLE);
            }
        });

        addRanahBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogBook.this , PopTable.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_act_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        switch (item.getItemId()){
            case R.id.profileBtn:
                startActivity(new Intent(this, Profile.class));
                return true;
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.list){
            startActivity(new Intent(this, MainActivity.class));
        }
        if (id == R.id.jadwal){
            startActivity(new Intent(this, JadwalPraktik.class));
        }
        if (id == R.id.logbook){
            startActivity(new Intent(this, LogBook.class));
        }

        return false;
    }
}
