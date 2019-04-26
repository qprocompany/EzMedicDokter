package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailPasienHadir extends AppCompatActivity {

    LinearLayout jadwalPasien1, jadwalPasien2,jadwalPasien3, garisH1, garisH2,garisH3, garisV1, garisV2, garisV3;
    TextView namaJadwal1, namaJadwal2,namaJadwal3, umurJadwal1, umurJadwal2,umurJadwal3, genderJadwal1, genderJadwal2,genderJadwal3, noJadwal1, noJadwal2,noJadwal3, thnJadwal1, thnJadwal2, thnJadwal3;
    TextView kedatangan1, kedatangan2,kedatangan3, rate1, rate2, rate3;
    ImageView bintang1, bintang2,bintang3;
    CircleImageView fotoJadwal1, fotoJadwal2, fotoJadwal3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien_hadir);

        jadwalPasien1 = (LinearLayout) findViewById(R.id.jadwalPasien1);
        jadwalPasien2 = (LinearLayout) findViewById(R.id.jadwalPasien2);
        jadwalPasien3 = (LinearLayout) findViewById(R.id.jadwalPasien3);

        garisH1 = (LinearLayout) findViewById(R.id.garisH1);
        garisH2 = (LinearLayout) findViewById(R.id.garisH2);
        garisH3 = (LinearLayout) findViewById(R.id.garisH3);

        garisV1 = (LinearLayout) findViewById(R.id.garisV1);
        garisV2 = (LinearLayout) findViewById(R.id.garisV2);
        garisV3 = (LinearLayout) findViewById(R.id.garisV3);

        namaJadwal1 = (TextView) findViewById(R.id.namaJadwal1);
        namaJadwal2 = (TextView) findViewById(R.id.namaJadwal2);
        namaJadwal3 = (TextView) findViewById(R.id.namaJadwal3);

        umurJadwal1 = (TextView) findViewById(R.id.umurJadwal1);
        umurJadwal2 = (TextView) findViewById(R.id.umurJadwal2);
        umurJadwal3 = (TextView) findViewById(R.id.umurJadwal3);

        genderJadwal1 = (TextView) findViewById(R.id.genderJadwal1);
        genderJadwal2 = (TextView) findViewById(R.id.genderJadwal2);
        genderJadwal3 = (TextView) findViewById(R.id.genderJadwal3);

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



    }
}
