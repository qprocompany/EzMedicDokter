package com.example.user.myapplication;

import android.annotation.SuppressLint;
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
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class JadwalPraktik extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    CalendarView calendarView;
    LinearLayout jadwalPasien1, jadwalPasien2, garisH1, garisH2, garisV1, garisV2;
    TextView namaJadwal1, namaJadwal2, umurJadwal1, umurJadwal2, genderJadwal1, genderJadwal2, noJadwal1, noJadwal2, thnJadwal1, thnJadwal2;
    CircleImageView fotoJadwal1, fotoJadwal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_praktik);

        jadwalPasien1 = (LinearLayout) findViewById(R.id.jadwalPasien1);
        jadwalPasien2 = (LinearLayout) findViewById(R.id.jadwalPasien2);

        garisH1 = (LinearLayout) findViewById(R.id.garisH1);
        garisH2 = (LinearLayout) findViewById(R.id.garisH2);

        garisV1 = (LinearLayout) findViewById(R.id.garisV1);
        garisV2 = (LinearLayout) findViewById(R.id.garisV2);

        namaJadwal1 = (TextView) findViewById(R.id.namaJadwal1);
        namaJadwal2 = (TextView) findViewById(R.id.namaJadwal2);

        umurJadwal1 = (TextView) findViewById(R.id.umurJadwal1);
        umurJadwal2 = (TextView) findViewById(R.id.umurJadwal2);

        genderJadwal1 = (TextView) findViewById(R.id.genderJadwal1);
        genderJadwal2 = (TextView) findViewById(R.id.genderJadwal2);

        noJadwal1 = (TextView) findViewById(R.id.noJadwal1);
        noJadwal2 = (TextView) findViewById(R.id.noJadwal2);

        thnJadwal1 = (TextView) findViewById(R.id.thnJadwal1);
        thnJadwal2 = (TextView) findViewById(R.id.thnJadwal2);

        fotoJadwal1 = (CircleImageView) findViewById(R.id.fotoJadwal1);
        fotoJadwal2 = (CircleImageView) findViewById(R.id.fotoJadwal2);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView)findViewById(R.id.sideMenuHome);
        navigationView.setNavigationItemSelectedListener(this);


        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;

                if(date.equals("4/17/2019")){
                    fotoJadwal1.setImageResource(R.drawable.foto7);
                    namaJadwal1.setText("Andi");
                    umurJadwal1.setText("20");
                    genderJadwal1.setText("Laki-Laki");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);

                    fotoJadwal2.setImageResource(R.drawable.foto3);
                    namaJadwal2.setText("Linda");
                    umurJadwal2.setText("24");
                    genderJadwal2.setText("Perempuan");
                    noJadwal2.setText("081546464896");
                    thnJadwal2.setText("Thn");
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);

                }else if (date.equals("4/20/2019")){
                    fotoJadwal1.setImageResource(R.drawable.foto4);
                    namaJadwal1.setText("Bagus");
                    umurJadwal1.setText("18");
                    genderJadwal1.setText("Laki-laki");
                    noJadwal1.setText("085846962589");
                    thnJadwal1.setText("Thn");
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);

                    fotoJadwal2.setImageResource(R.drawable.test);
                    namaJadwal2.setText("Didi");
                    umurJadwal2.setText("33");
                    genderJadwal2.setText("Laki-laki");
                    noJadwal2.setText("081785715886");
                    thnJadwal2.setText("Thn");
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                }else {
                    fotoJadwal1.setImageResource(R.color.ColorTransparent);
                    namaJadwal1.setText(" ");
                    umurJadwal1.setText(" ");
                    genderJadwal1.setText(" ");
                    noJadwal1.setText(" ");
                    thnJadwal1.setText(" ");
                    jadwalPasien1.setBackground(null);
                    garisH1.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    garisV1.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien1.setElevation(0);

                    fotoJadwal2.setImageResource(R.color.ColorTransparent);
                    namaJadwal2.setText(" ");
                    umurJadwal2.setText(" ");
                    genderJadwal2.setText(" ");
                    noJadwal2.setText(" ");
                    thnJadwal2.setText(" ");
                    jadwalPasien2.setBackground(null);
                    garisH2.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    garisV2.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien2.setElevation(0);
                }
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
