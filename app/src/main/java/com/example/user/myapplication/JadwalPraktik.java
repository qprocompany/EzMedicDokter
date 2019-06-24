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
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class JadwalPraktik extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    CalendarView kalenderJadwal;
    LinearLayout jadwalPasien1, jadwalPasien2, jadwalPasien3, jadwalPasien4;
    LinearLayout garisH1, garisH2, garisH3, garisH4;
    TextView namaJadwal1, namaJadwal2,namaJadwal3, namaJadwal4;
    TextView umurJadwal1, umurJadwal2,umurJadwal3, umurJadwal4;
    TextView noJadwal1, noJadwal2,noJadwal3, noJadwal4;
    TextView thnJadwal1, thnJadwal2, thnJadwal3, thnJadwal4;
    TextView kedatangan1, kedatangan2, kedatangan3, kedatangan4;
    TextView rate1, rate2, rate3, rate4;
    ImageView bintang1, bintang2, bintang3, bintang4;
    CircleImageView fotoJadwal1, fotoJadwal2, fotoJadwal3, fotoJadwal4;
    TextView visitTxt1, visitTxt2, visitTxt3, visitTxt4;
    TextView tglJadwal1, tglJadwal2, tglJadwal3, tglJadwal4;
    TextView diagnosaTxt1, diagnosaTxt2, diagnosaTxt3, diagnosaTxt4;
    TextView isiDiagnosa1, isiDiagnosa2, isiDiagnosa3, isiDiagnosa4;
    ImageView genderJadwal1, genderJadwal2, genderJadwal3, genderJadwal4;
    LinearLayout triboxLayout;


    TextView pasienHadir, pasienBatal, persentase;

    LinearLayout hadir, batal;

    LinearLayout layerKedatangan;

    Button buttonReschedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_praktik);

        triboxLayout = (LinearLayout) findViewById(R.id.triboxLayout);

        visitTxt1 = (TextView) findViewById(R.id.visitTxt1);
        visitTxt2 = (TextView) findViewById(R.id.visitTxt2);
        visitTxt3 = (TextView) findViewById(R.id.visitTxt3);
        visitTxt4 = (TextView) findViewById(R.id.visitTxt4);

        tglJadwal1 = (TextView) findViewById(R.id.tglJadwal1);
        tglJadwal2 = (TextView) findViewById(R.id.tglJadwal2);
        tglJadwal3 = (TextView) findViewById(R.id.tglJadwal3);
        tglJadwal4 = (TextView) findViewById(R.id.tglJadwal4);

        diagnosaTxt1 = (TextView) findViewById(R.id.diagnosaTxt1);
        diagnosaTxt2 = (TextView) findViewById(R.id.diagnosaTxt2);
        diagnosaTxt3 = (TextView) findViewById(R.id.diagnosaTxt3);
        diagnosaTxt4 = (TextView) findViewById(R.id.diagnosaTxt4);

        isiDiagnosa1 = (TextView) findViewById(R.id.isiDiagnosa1);
        isiDiagnosa2 = (TextView) findViewById(R.id.isiDiagnosa2);
        isiDiagnosa3 = (TextView) findViewById(R.id.isiDiagnosa3);
        isiDiagnosa4 = (TextView) findViewById(R.id.isiDiagnosa4);

        genderJadwal1 = (ImageView) findViewById(R.id.genderJadwal1);
        genderJadwal2 = (ImageView) findViewById(R.id.genderJadwal2);
        genderJadwal3 = (ImageView) findViewById(R.id.genderJadwal3);
        genderJadwal4 = (ImageView) findViewById(R.id.genderJadwal4);


        jadwalPasien1 = (LinearLayout) findViewById(R.id.jadwalPasien1);
        jadwalPasien2 = (LinearLayout) findViewById(R.id.jadwalPasien2);
        jadwalPasien3 = (LinearLayout) findViewById(R.id.jadwalPasien3);
        jadwalPasien4 = (LinearLayout) findViewById(R.id.jadwalPasien4);

        garisH1 = (LinearLayout) findViewById(R.id.garisH1);
        garisH2 = (LinearLayout) findViewById(R.id.garisH2);
        garisH3 = (LinearLayout) findViewById(R.id.garisH3);
        garisH4 = (LinearLayout) findViewById(R.id.garisH4);

        namaJadwal1 = (TextView) findViewById(R.id.namaJadwal1);
        namaJadwal2 = (TextView) findViewById(R.id.namaJadwal2);
        namaJadwal3 = (TextView) findViewById(R.id.namaJadwal3);
        namaJadwal4 = (TextView) findViewById(R.id.namaJadwal4);

        umurJadwal1 = (TextView) findViewById(R.id.umurJadwal1);
        umurJadwal2 = (TextView) findViewById(R.id.umurJadwal2);
        umurJadwal3 = (TextView) findViewById(R.id.umurJadwal3);
        umurJadwal4 = (TextView) findViewById(R.id.umurJadwal4);

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

        layerKedatangan = (LinearLayout) findViewById(R.id.layerKedatangan);

        buttonReschedule = (Button) findViewById(R.id.buttonReschedule);
        buttonReschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JadwalPraktik.this, PopReschedule.class);
                startActivity(intent);
            }
        });

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView)findViewById(R.id.sideMenuHome);
        navigationView.setNavigationItemSelectedListener(this);



        kalenderJadwal = (CalendarView) findViewById(R.id.kalenderJadwal);
        kalenderJadwal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, final int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;

                if(date.equals("6/22/2019")){

                    fotoJadwal1.setImageResource(R.drawable.foto7);
                    namaJadwal1.setText("Andi");
                    umurJadwal1.setText("22");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    visitTxt1.setText("Visit :");
                    tglJadwal1.setText("22 Jun 2019 , 15:00");
                    diagnosaTxt1.setText("Diagnosa :");
                    isiDiagnosa1.setText("Sakit Kepala");
                    genderJadwal1.setImageResource(R.drawable.male);
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);
                    kedatangan1.setText("2");
                    rate1.setText("5.0");
                    bintang1.setImageResource(R.drawable.star);


                    fotoJadwal2.setImageResource(R.drawable.foto3);
                    namaJadwal2.setText("Linda");
                    umurJadwal2.setText("24");
                    noJadwal2.setText("081546464896");
                    thnJadwal2.setText("Thn");
                    visitTxt2.setText("Visit :");
                    tglJadwal2.setText("22 Jun 2019 , 15:45");
                    diagnosaTxt2.setText("Diagnosa :");
                    isiDiagnosa2.setText("Sakit Kepala");
                    genderJadwal2.setImageResource(R.drawable.female);
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                    kedatangan2.setText("1");
                    rate2.setText("4.5");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto4);
                    namaJadwal3.setText("Agus");
                    umurJadwal3.setText("24");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    visitTxt3.setText("Visit :");
                    tglJadwal3.setText("22 Jun 2019 , 16:15");
                    diagnosaTxt3.setText("Diagnosa :");
                    isiDiagnosa3.setText("Sakit Kepala");
                    genderJadwal3.setImageResource(R.drawable.male);
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("4.5");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto5);
                    namaJadwal4.setText("Supri");
                    umurJadwal4.setText("24");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    visitTxt4.setText("Visit :");
                    tglJadwal4.setText("22 Jun 2019 , 16:45");
                    diagnosaTxt4.setText("Diagnosa :");
                    isiDiagnosa4.setText("Sakit Kepala");
                    genderJadwal4.setImageResource(R.drawable.male);
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiusred));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("-");
                    bintang4.setImageResource(R.drawable.star);

                    pasienHadir.setText("3");
                    pasienBatal.setText("1");
                    persentase.setText("75%");

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

                    layerKedatangan.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(JadwalPraktik.this, DetailKedatanganPasien.class);
                            startActivity(intent);
                        }
                    });

                    triboxLayout.setVisibility(View.VISIBLE);
                    buttonReschedule.setVisibility(View.INVISIBLE);


                } else if (date.equals("6/23/2019")){
                    fotoJadwal1.setImageResource(R.drawable.foto4);
                    namaJadwal1.setText("Bagus");
                    umurJadwal1.setText("20");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    visitTxt1.setText("Visit :");
                    tglJadwal1.setText("23 Jun 2019 , 18:00");
                    diagnosaTxt1.setText("Diagnosa :");
                    isiDiagnosa1.setText("-");
                    genderJadwal1.setImageResource(R.drawable.male);
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);
                    kedatangan1.setText("2");
                    rate1.setText("5.0");
                    bintang1.setImageResource(R.drawable.star);

                    fotoJadwal2.setImageResource(R.drawable.test);
                    namaJadwal2.setText("Didi");
                    umurJadwal2.setText("33");
                    noJadwal2.setText("081785715886");
                    thnJadwal2.setText("Thn");
                    visitTxt2.setText("Visit :");
                    tglJadwal2.setText("23 Jun 2019 , 18:30");
                    diagnosaTxt2.setText("Diagnosa :");
                    isiDiagnosa2.setText("-");
                    genderJadwal2.setImageResource(R.drawable.male);
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                    kedatangan2.setText("2");
                    rate2.setText("5.0");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto5);
                    namaJadwal3.setText("Supri");
                    umurJadwal3.setText("24");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    visitTxt3.setText("Visit :");
                    tglJadwal3.setText("23 Jun 2019 , 19:00");
                    diagnosaTxt3.setText("Diagnosa :");
                    isiDiagnosa3.setText("-");
                    genderJadwal3.setImageResource(R.drawable.male);
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("5.0");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto4);
                    namaJadwal4.setText("Agus");
                    umurJadwal4.setText("24");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    visitTxt4.setText("Visit :");
                    tglJadwal4.setText("23 Jun 2019 , 19:30");
                    diagnosaTxt4.setText("Diagnosa :");
                    isiDiagnosa4.setText("-");
                    genderJadwal4.setImageResource(R.drawable.male);
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("5.0");
                    bintang4.setImageResource(R.drawable.star);


                    pasienHadir.setText("4");
                    pasienBatal.setText("0");
                    persentase.setText("100%");

                    triboxLayout.setVisibility(View.VISIBLE);
                    buttonReschedule.setVisibility(View.INVISIBLE);

                }else if(date.equals("6/25/2019")){
                    fotoJadwal1.setImageResource(R.drawable.foto7);
                    namaJadwal1.setText("Andi");
                    umurJadwal1.setText("20");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    visitTxt1.setText("Visit :");
                    tglJadwal1.setText("25 Jun 2019 , 15:45");
                    diagnosaTxt1.setText("Diagnosa :");
                    isiDiagnosa1.setText("-");
                    genderJadwal1.setImageResource(R.drawable.male);
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);
                    kedatangan1.setText("2");
                    rate1.setText("-");
                    bintang1.setImageResource(R.drawable.star);

                    fotoJadwal2.setImageResource(R.drawable.foto3);
                    namaJadwal2.setText("Linda");
                    umurJadwal2.setText("24");
                    noJadwal2.setText("081546464896");
                    thnJadwal2.setText("Thn");
                    visitTxt2.setText("Visit :");
                    tglJadwal2.setText("25 Jun 2019 , 16:45");
                    diagnosaTxt2.setText("Diagnosa :");
                    isiDiagnosa2.setText("-");
                    genderJadwal2.setImageResource(R.drawable.female);
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                    kedatangan2.setText("1");
                    rate2.setText("-");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto4);
                    namaJadwal3.setText("Agus");
                    umurJadwal3.setText("24");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    visitTxt3.setText("Visit :");
                    tglJadwal3.setText("25 Jun 2019 , 17:00");
                    diagnosaTxt3.setText("Diagnosa :");
                    isiDiagnosa3.setText("-");
                    genderJadwal3.setImageResource(R.drawable.male);
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("-");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto5);
                    namaJadwal4.setText("Supri");
                    umurJadwal4.setText("24");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    visitTxt4.setText("Visit :");
                    tglJadwal4.setText("25 Jun 2019 , 17:45");
                    diagnosaTxt4.setText("Diagnosa :");
                    isiDiagnosa4.setText("-");
                    genderJadwal4.setImageResource(R.drawable.male);
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("-");
                    bintang4.setImageResource(R.drawable.star);

                    triboxLayout.setVisibility(View.INVISIBLE);
                    buttonReschedule.setVisibility(View.VISIBLE);

                }else if (date.equals("6/26/2019")){
                    fotoJadwal1.setImageResource(R.drawable.test);
                    namaJadwal1.setText("Nando");
                    umurJadwal1.setText("20");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    visitTxt1.setText("Visit :");
                    tglJadwal1.setText("26 Jun 2019 , 17:00");
                    diagnosaTxt1.setText("Diagnosa :");
                    isiDiagnosa1.setText("-");
                    genderJadwal1.setImageResource(R.drawable.male);
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);
                    kedatangan1.setText("2");
                    rate1.setText("-");
                    bintang1.setImageResource(R.drawable.star);

                    fotoJadwal2.setImageResource(R.drawable.foto7);
                    namaJadwal2.setText("Dilan");
                    umurJadwal2.setText("33");
                    noJadwal2.setText("081785715886");
                    thnJadwal2.setText("Thn");
                    visitTxt2.setText("Visit :");
                    tglJadwal2.setText("26 Jun 2019 , 17:15");
                    diagnosaTxt2.setText("Diagnosa :");
                    isiDiagnosa2.setText("-");
                    genderJadwal2.setImageResource(R.drawable.male);
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                    kedatangan2.setText("1");
                    rate2.setText("-");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto8);
                    namaJadwal3.setText("Supri");
                    umurJadwal3.setText("24");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    visitTxt3.setText("Visit :");
                    tglJadwal3.setText("26 Jun 2019 , 17:30");
                    diagnosaTxt3.setText("Diagnosa :");
                    isiDiagnosa3.setText("-");
                    genderJadwal3.setImageResource(R.drawable.male);
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("-");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto9);
                    namaJadwal4.setText("Biyon");
                    umurJadwal4.setText("24");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    visitTxt4.setText("Visit :");
                    tglJadwal4.setText("26 Jun 2019 , 17:45");
                    diagnosaTxt4.setText("Diagnosa :");
                    isiDiagnosa4.setText("-");
                    genderJadwal4.setImageResource(R.drawable.male);
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("-");
                    bintang4.setImageResource(R.drawable.star);

                    triboxLayout.setVisibility(View.INVISIBLE);
                    buttonReschedule.setVisibility(View.VISIBLE);

                }else if (date.equals("6/27/2019")){
                    fotoJadwal1.setImageResource(R.drawable.foto7);
                    namaJadwal1.setText("Andi");
                    umurJadwal1.setText("20");
                    noJadwal1.setText("081212121212");
                    thnJadwal1.setText("Thn");
                    visitTxt1.setText("Visit :");
                    tglJadwal1.setText("27 Jun 2019 , 17:15");
                    diagnosaTxt1.setText("Diagnosa :");
                    isiDiagnosa1.setText("-");
                    genderJadwal1.setImageResource(R.drawable.male);
                    jadwalPasien1.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien1.setElevation(5);
                    kedatangan1.setText("2");
                    rate1.setText("-");
                    bintang1.setImageResource(R.drawable.star);

                    fotoJadwal2.setImageResource(R.drawable.foto11);
                    namaJadwal2.setText("Siti");
                    umurJadwal2.setText("17");
                    noJadwal2.setText("081785715886");
                    thnJadwal2.setText("Thn");
                    visitTxt2.setText("Visit :");
                    tglJadwal2.setText("27 Jun 2019 , 17:30");
                    diagnosaTxt2.setText("Diagnosa :");
                    isiDiagnosa2.setText("-");
                    genderJadwal2.setImageResource(R.drawable.female);
                    jadwalPasien2.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien2.setElevation(5);
                    kedatangan2.setText("2");
                    rate2.setText("-");
                    bintang2.setImageResource(R.drawable.star);

                    fotoJadwal3.setImageResource(R.drawable.foto12);
                    namaJadwal3.setText("Jessica");
                    umurJadwal3.setText("24");
                    noJadwal3.setText("081546464896");
                    thnJadwal3.setText("Thn");
                    visitTxt3.setText("Visit :");
                    tglJadwal3.setText("27 Jun 2019 , 17:45");
                    diagnosaTxt3.setText("Diagnosa :");
                    isiDiagnosa3.setText("-");
                    genderJadwal3.setImageResource(R.drawable.female);
                    jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien3.setElevation(5);
                    kedatangan3.setText("1");
                    rate3.setText("-");
                    bintang3.setImageResource(R.drawable.star);

                    fotoJadwal4.setImageResource(R.drawable.foto4);
                    namaJadwal4.setText("Agus");
                    umurJadwal4.setText("24");
                    noJadwal4.setText("081546464896");
                    thnJadwal4.setText("Thn");
                    visitTxt4.setText("Visit :");
                    tglJadwal4.setText("27 Jun 2019 , 18:00");
                    diagnosaTxt4.setText("Diagnosa :");
                    isiDiagnosa4.setText("-");
                    genderJadwal4.setImageResource(R.drawable.male);
                    jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
                    garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                    jadwalPasien4.setElevation(5);
                    kedatangan4.setText("1");
                    rate4.setText("-");
                    bintang4.setImageResource(R.drawable.star);

                    triboxLayout.setVisibility(View.INVISIBLE);
                    buttonReschedule.setVisibility(View.VISIBLE);
                }else {
                    fotoJadwal1.setImageResource(R.color.ColorTransparent);
                    namaJadwal1.setText(" ");
                    umurJadwal1.setText(" ");
                    noJadwal1.setText(" ");
                    thnJadwal1.setText(" ");
                    visitTxt1.setText(" ");
                    tglJadwal1.setText(" ");
                    diagnosaTxt1.setText(" ");
                    isiDiagnosa1.setText(" ");
                    genderJadwal1.setImageResource(R.color.ColorTransparent);
                    jadwalPasien1.setBackground(null);
                    garisH1.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien1.setElevation(0);
                    kedatangan1.setText(" ");
                    rate1.setText(" ");
                    bintang1.setImageResource(R.color.ColorTransparent);

                    fotoJadwal2.setImageResource(R.color.ColorTransparent);
                    namaJadwal2.setText(" ");
                    umurJadwal2.setText(" ");
                    noJadwal2.setText(" ");
                    thnJadwal2.setText(" ");
                    visitTxt2.setText(" ");
                    tglJadwal2.setText(" ");
                    diagnosaTxt2.setText(" ");
                    isiDiagnosa2.setText(" ");
                    genderJadwal2.setImageResource(R.color.ColorTransparent);
                    jadwalPasien2.setBackground(null);
                    garisH2.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien2.setElevation(0);
                    kedatangan2.setText(" ");
                    rate2.setText(" ");
                    bintang2.setImageResource(R.color.ColorTransparent);

                    fotoJadwal3.setImageResource(R.color.ColorTransparent);
                    namaJadwal3.setText(" ");
                    umurJadwal3.setText(" ");
                    noJadwal3.setText(" ");
                    thnJadwal3.setText(" ");
                    visitTxt3.setText(" ");
                    tglJadwal3.setText(" ");
                    diagnosaTxt3.setText(" ");
                    isiDiagnosa3.setText(" ");
                    genderJadwal3.setImageResource(R.color.ColorTransparent);
                    jadwalPasien3.setBackground(null);
                    garisH3.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien3.setElevation(0);
                    kedatangan3.setText(" ");
                    rate3.setText(" ");
                    bintang3.setImageResource(R.color.ColorTransparent);

                    fotoJadwal4.setImageResource(R.color.ColorTransparent);
                    namaJadwal4.setText(" ");
                    umurJadwal4.setText(" ");
                    noJadwal4.setText(" ");
                    thnJadwal4.setText(" ");
                    visitTxt4.setText(" ");
                    tglJadwal4.setText(" ");
                    diagnosaTxt4.setText(" ");
                    isiDiagnosa4.setText(" ");
                    genderJadwal4.setImageResource(R.color.ColorTransparent);
                    jadwalPasien4.setBackground(null);
                    garisH4.setBackgroundColor(getResources().getColor(R.color.ColorTransparent));
                    jadwalPasien4.setElevation(0);
                    kedatangan4.setText(" ");
                    rate4.setText(" ");
                    bintang4.setImageResource(R.color.ColorTransparent);

                    triboxLayout.setVisibility(View.INVISIBLE);
                    buttonReschedule.setVisibility(View.INVISIBLE);

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act_bar2,menu);
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

            case R.id.kalenderBtn:
                if (kalenderJadwal.getVisibility() == View.VISIBLE){
                    kalenderJadwal.setVisibility(View.GONE);
                }else {kalenderJadwal.setVisibility(View.VISIBLE);
                }
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