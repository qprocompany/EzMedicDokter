package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class JadwalPraktik extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    CalendarView calendarView;
    LinearLayout jadwalPasien1, jadwalPasien2,jadwalPasien3, jadwalPasien4, garisH1, garisH2,garisH3, garisH4, garisV1, garisV2, garisV3, garisV4;
    TextView namaJadwal1, namaJadwal2,namaJadwal3, namaJadwal4, umurJadwal1, umurJadwal2,umurJadwal3, umurJadwal4, genderJadwal1, genderJadwal2,genderJadwal3, genderJadwal4, noJadwal1, noJadwal2,noJadwal3, noJadwal4, thnJadwal1, thnJadwal2, thnJadwal3, thnJadwal4;
    TextView kedatangan1, kedatangan2,kedatangan3, kedatangan4, rate1, rate2, rate3, rate4;
    ImageView bintang1, bintang2,bintang3, bintang4;
    CircleImageView fotoJadwal1, fotoJadwal2, fotoJadwal3, fotoJadwal4;

    TextView pasienHadir, pasienBatal, persentase;

    LinearLayout hadir, batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_praktik);

        jadwalPasien1 = (LinearLayout) findViewById(R.id.jadwalPasien1);
        jadwalPasien2 = (LinearLayout) findViewById(R.id.jadwalPasien2);
        jadwalPasien3 = (LinearLayout) findViewById(R.id.jadwalPasien3);
        jadwalPasien4 = (LinearLayout) findViewById(R.id.jadwalPasien4);

        garisH1 = (LinearLayout) findViewById(R.id.garisH1);
        garisH2 = (LinearLayout) findViewById(R.id.garisH2);
        garisH3 = (LinearLayout) findViewById(R.id.garisH3);
        garisH4 = (LinearLayout) findViewById(R.id.garisH4);

        garisV1 = (LinearLayout) findViewById(R.id.garisV1);
        garisV2 = (LinearLayout) findViewById(R.id.garisV2);
        garisV3 = (LinearLayout) findViewById(R.id.garisV3);
        garisV4 = (LinearLayout) findViewById(R.id.garisV4);

        namaJadwal1 = (TextView) findViewById(R.id.namaJadwal1);
        namaJadwal2 = (TextView) findViewById(R.id.namaJadwal2);
        namaJadwal3 = (TextView) findViewById(R.id.namaJadwal3);
        namaJadwal4 = (TextView) findViewById(R.id.namaJadwal4);

        umurJadwal1 = (TextView) findViewById(R.id.umurJadwal1);
        umurJadwal2 = (TextView) findViewById(R.id.umurJadwal2);
        umurJadwal3 = (TextView) findViewById(R.id.umurJadwal3);
        umurJadwal4 = (TextView) findViewById(R.id.umurJadwal4);

        genderJadwal1 = (TextView) findViewById(R.id.genderJadwal1);
        genderJadwal2 = (TextView) findViewById(R.id.genderJadwal2);
        genderJadwal3 = (TextView) findViewById(R.id.genderJadwal3);
        genderJadwal4 = (TextView) findViewById(R.id.genderJadwal4);

        noJadwal1 = (TextView) findViewById(R.id.noJadwal1);
        noJadwal2 = (TextView) findViewById(R.id.noJadwal2);
        noJadwal3 = (TextView) findViewById(R.id.noJadwal3);
        noJadwal4 = (TextView) findViewById(R.id.noJadwal4);

        thnJadwal1 = (TextView) findViewById(R.id.thnJadwal1);
        thnJadwal2 = (TextView) findViewById(R.id.thnJadwal2);
        thnJadwal3 = (TextView) findViewById(R.id.thnJadwal3);
        thnJadwal4 = (TextView) findViewById(R.id.thnJadwal4);

        fotoJadwal1 = (CircleImageView) findViewById(R.id.fotoJadwal1);
        fotoJadwal2 = (CircleImageView) findViewById(R.id.fotoJadwal2);
        fotoJadwal3 = (CircleImageView) findViewById(R.id.fotoJadwal3);
        fotoJadwal4 = (CircleImageView) findViewById(R.id.fotoJadwal4);

        kedatangan1 = (TextView) findViewById(R.id.kedatangan1);
        kedatangan2 = (TextView) findViewById(R.id.kedatangan2);
        kedatangan3 = (TextView) findViewById(R.id.kedatangan3);
        kedatangan4 = (TextView) findViewById(R.id.kedatangan4);

        rate1 = (TextView) findViewById(R.id.rate1);
        rate2 = (TextView) findViewById(R.id.rate2);
        rate3 = (TextView) findViewById(R.id.rate3);
        rate4 = (TextView) findViewById(R.id.rate4);

        bintang1 = (ImageView) findViewById(R.id.bintang1);
        bintang2 = (ImageView) findViewById(R.id.bintang2);
        bintang3 = (ImageView) findViewById(R.id.bintang3);
        bintang4 = (ImageView) findViewById(R.id.bintang4);

        pasienHadir = (TextView) findViewById(R.id.pasienHadir);
        pasienBatal = (TextView) findViewById(R.id.pasienBatal);
        persentase = (TextView) findViewById(R.id.persentase);

        batal = (LinearLayout) findViewById(R.id.batal);
        hadir = (LinearLayout) findViewById(R.id.hadir);

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
            public void onSelectedDayChange(@NonNull CalendarView calendarView, final int i, int i1, int i2) {
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
                    kedatangan1.setText("2");
                    rate1.setText("5.0");
                    bintang1.setImageResource(R.drawable.star);

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
                    kedatangan2.setText("1");
                    rate2.setText("4.8");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto4);
                    namaJadwal3.setText("Agus");
                    umurJadwal3.setText("24");
                    genderJadwal3.setText("Laki-laki");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("4.8");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto5);
                    namaJadwal4.setText("Supri");
                    umurJadwal4.setText("24");
                    genderJadwal4.setText("Laki-laki");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("4.8");
                    bintang4.setImageResource(R.drawable.star);

                    pasienHadir.setText("3");
                    pasienBatal.setText("1");
                    persentase.setText("33,3%");

                    hadir.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(JadwalPraktik.this, DetailPasienHadir.class);
                            startActivity(intent);
                        }
                    });

                    batal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(JadwalPraktik.this, DetailPasienBatal.class);
                            startActivity(intent);

                        }
                    });

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
                    kedatangan1.setText("2");
                    rate1.setText("5.0");
                    bintang1.setImageResource(R.drawable.star);

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
                    kedatangan2.setText("2");
                    rate2.setText("4.0");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto5);
                    namaJadwal3.setText("Supri");
                    umurJadwal3.setText("24");
                    genderJadwal3.setText("Laki-laki");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("4.8");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto4);
                    namaJadwal4.setText("Agus");
                    umurJadwal4.setText("24");
                    genderJadwal4.setText("Laki-laki");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    garisV4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("4.8");
                    bintang4.setImageResource(R.drawable.star);

                    pasienHadir.setText("2");
                    pasienBatal.setText("2");
                    persentase.setText("50%");

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
                    kedatangan1.setText(" ");
                    rate1.setText(" ");
                    bintang1.setImageResource(R.color.ColorTransparent);

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
                    kedatangan2.setText(" ");
                    rate2.setText(" ");
                    bintang2.setImageResource(R.color.ColorTransparent);

                    fotoJadwal3.setImageResource(R.color.ColorTransparent);
                    namaJadwal3.setText(" ");
                    umurJadwal3.setText(" ");
                    genderJadwal3.setText(" ");
                    noJadwal3.setText(" ");
                    thnJadwal3.setText(" ");
                    jadwalPasien3.setBackground(null);
                    garisH3.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    garisV3.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien3.setElevation(0);
                    kedatangan3.setText(" ");
                    rate3.setText(" ");
                    bintang3.setImageResource(R.color.ColorTransparent);

                    fotoJadwal4.setImageResource(R.color.ColorTransparent);
                    namaJadwal4.setText(" ");
                    umurJadwal4.setText(" ");
                    genderJadwal4.setText(" ");
                    noJadwal4.setText(" ");
                    thnJadwal4.setText(" ");
                    jadwalPasien4.setBackground(null);
                    garisH4.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    garisV4.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien4.setElevation(0);
                    kedatangan4.setText(" ");
                    rate4.setText(" ");
                    bintang4.setImageResource(R.color.ColorTransparent);

                    pasienHadir.setText(" ");
                    pasienBatal.setText(" ");
                    persentase.setText(" ");

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
