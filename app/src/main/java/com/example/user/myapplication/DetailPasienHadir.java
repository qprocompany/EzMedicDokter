package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailPasienHadir extends AppCompatActivity {

    LinearLayout jadwalPasien1, jadwalPasien2, jadwalPasien3;
    LinearLayout garisH1, garisH2, garisH3;
    TextView namaJadwal1, namaJadwal2,namaJadwal3;
    TextView umurJadwal1, umurJadwal2,umurJadwal3;
    TextView noJadwal1, noJadwal2,noJadwal3;
    TextView thnJadwal1, thnJadwal2, thnJadwal3;
    TextView kedatangan1, kedatangan2, kedatangan3;
    TextView rate1, rate2, rate3;
    ImageView bintang1, bintang2, bintang3;
    CircleImageView fotoJadwal1, fotoJadwal2, fotoJadwal3;
    TextView visitTxt1, visitTxt2, visitTxt3;
    TextView tglJadwal1, tglJadwal2, tglJadwal3;
    TextView diagnosaTxt1, diagnosaTxt2, diagnosaTxt3;
    TextView isiDiagnosa1, isiDiagnosa2, isiDiagnosa3;
    ImageView genderJadwal1, genderJadwal2, genderJadwal3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien_hadir);

        visitTxt1 = (TextView) findViewById(R.id.visitTxt1);
        visitTxt2 = (TextView) findViewById(R.id.visitTxt2);
        visitTxt3 = (TextView) findViewById(R.id.visitTxt3);

        tglJadwal1 = (TextView) findViewById(R.id.tglJadwal1);
        tglJadwal2 = (TextView) findViewById(R.id.tglJadwal2);
        tglJadwal3 = (TextView) findViewById(R.id.tglJadwal3);

        diagnosaTxt1 = (TextView) findViewById(R.id.diagnosaTxt1);
        diagnosaTxt2 = (TextView) findViewById(R.id.diagnosaTxt2);
        diagnosaTxt3 = (TextView) findViewById(R.id.diagnosaTxt3);

        isiDiagnosa1 = (TextView) findViewById(R.id.isiDiagnosa1);
        isiDiagnosa2 = (TextView) findViewById(R.id.isiDiagnosa2);
        isiDiagnosa3 = (TextView) findViewById(R.id.isiDiagnosa3);

        genderJadwal1 = (ImageView) findViewById(R.id.genderJadwal1);
        genderJadwal2 = (ImageView) findViewById(R.id.genderJadwal2);
        genderJadwal3 = (ImageView) findViewById(R.id.genderJadwal3);


        jadwalPasien1 = (LinearLayout) findViewById(R.id.jadwalPasien1);
        jadwalPasien2 = (LinearLayout) findViewById(R.id.jadwalPasien2);
        jadwalPasien3 = (LinearLayout) findViewById(R.id.jadwalPasien3);

        garisH1 = (LinearLayout) findViewById(R.id.garisH1);
        garisH2 = (LinearLayout) findViewById(R.id.garisH2);
        garisH3 = (LinearLayout) findViewById(R.id.garisH3);

        namaJadwal1 = (TextView) findViewById(R.id.namaJadwal1);
        namaJadwal2 = (TextView) findViewById(R.id.namaJadwal2);
        namaJadwal3 = (TextView) findViewById(R.id.namaJadwal3);

        umurJadwal1 = (TextView) findViewById(R.id.umurJadwal1);
        umurJadwal2 = (TextView) findViewById(R.id.umurJadwal2);
        umurJadwal3 = (TextView) findViewById(R.id.umurJadwal3);

        noJadwal1 = (TextView) findViewById(R.id.noJadwal1);
        noJadwal2 = (TextView) findViewById(R.id.noJadwal2);
        noJadwal3 = (TextView) findViewById(R.id.noJadwal3);

        thnJadwal1 = (TextView) findViewById(R.id.thnJadwal1);
        thnJadwal2 = (TextView) findViewById(R.id.thnJadwal2);
        thnJadwal3 = (TextView) findViewById(R.id.thnJadwal3);

        fotoJadwal1 = (CircleImageView) findViewById(R.id.fotoJadwal1);
        fotoJadwal2 = (CircleImageView) findViewById(R.id.fotoJadwal2);
        fotoJadwal3 = (CircleImageView) findViewById(R.id.fotoJadwal3);

        kedatangan1 = (TextView) findViewById(R.id.kedatangan1);
        kedatangan2 = (TextView) findViewById(R.id.kedatangan2);
        kedatangan3 = (TextView) findViewById(R.id.kedatangan3);

        rate1 = (TextView) findViewById(R.id.rate1);
        rate2 = (TextView) findViewById(R.id.rate2);
        rate3 = (TextView) findViewById(R.id.rate3);

        bintang1 = (ImageView) findViewById(R.id.bintang1);
        bintang2 = (ImageView) findViewById(R.id.bintang2);
        bintang3 = (ImageView) findViewById(R.id.bintang3);

        fotoJadwal1.setImageResource(R.drawable.foto7);
        namaJadwal1.setText("Andi");
        umurJadwal1.setText("22");
        noJadwal1.setText("081212121212");
        thnJadwal1.setText("Thn");
        visitTxt1.setText("Visit :");
        tglJadwal1.setText("23 Mei 2019 , 15:00");
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
        tglJadwal2.setText("23 Mei 2019 , 15:45");
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
        tglJadwal3.setText("23 Mei 2019 , 16:15");
        diagnosaTxt3.setText("Diagnosa :");
        isiDiagnosa3.setText("Sakit Kepala");
        genderJadwal3.setImageResource(R.drawable.male);
        jadwalPasien3.setBackground(getResources().getDrawable(R.drawable.radiuswhite));
        garisH3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
        jadwalPasien3.setElevation(5);
        kedatangan3.setText("1");
        rate3.setText("4.5");
        bintang3.setImageResource(R.drawable.star);

    }
}
