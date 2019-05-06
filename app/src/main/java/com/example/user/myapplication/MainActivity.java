package com.example.user.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    SearchView search;
    LinearLayout layerPasien, historyTudei, listPasien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar title = getSupportActionBar();
        title.setTitle("List Pasien");

        NavigationView navigationView = (NavigationView)findViewById(R.id.sideMenuHome);
        navigationView.setNavigationItemSelectedListener(this);

        search = (SearchView) findViewById(R.id.search);

        layerPasien = (LinearLayout) findViewById(R.id.layerPasien);
        layerPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailPasien.class);
                startActivity(intent);
            }
        });

        historyTudei = (LinearLayout) findViewById(R.id.historyTudei);
        historyTudei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HistoryPasienTudei.class);
                startActivity(intent);
            }
        });

        listPasien = (LinearLayout) findViewById(R.id.listPasien);
        listPasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
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
            startActivity(new Intent(this, SKP.class));
        }

        return false;
    }
}
