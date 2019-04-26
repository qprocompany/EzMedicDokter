package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailPasienBatal extends AppCompatActivity {

    LinearLayout jadwalPasien1, jadwalPasien2,jadwalPasien3, jadwalPasien4, garisH1, garisH2,garisH3, garisH4, garisV1, garisV2, garisV3, garisV4;
    TextView namaJadwal1, namaJadwal2,namaJadwal3, namaJadwal4, umurJadwal1, umurJadwal2,umurJadwal3, umurJadwal4, genderJadwal1, genderJadwal2,genderJadwal3, genderJadwal4, noJadwal1, noJadwal2,noJadwal3, noJadwal4, thnJadwal1, thnJadwal2, thnJadwal3, thnJadwal4;
    TextView kedatangan1, kedatangan2,kedatangan3, kedatangan4, rate1, rate2, rate3, rate4;
    ImageView bintang1, bintang2,bintang3, bintang4;
    CircleImageView fotoJadwal1, fotoJadwal2, fotoJadwal3, fotoJadwal4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien_batal);

        jadwalPasien4 = (LinearLayout) findViewById(R.id.jadwalPasien4);

        garisH4 = (LinearLayout) findViewById(R.id.garisH4);

        garisV4 = (LinearLayout) findViewById(R.id.garisV4);

        namaJadwal4 = (TextView) findViewById(R.id.namaJadwal4);

        umurJadwal4 = (TextView) findViewById(R.id.umurJadwal4);

        genderJadwal4 = (TextView) findViewById(R.id.genderJadwal4);

        noJadwal4 = (TextView) findViewById(R.id.noJadwal4);

        thnJadwal4 = (TextView) findViewById(R.id.thnJadwal4);

        fotoJadwal4 = (CircleImageView) findViewById(R.id.fotoJadwal4);

        kedatangan4 = (TextView) findViewById(R.id.kedatangan4);

        rate4 = (TextView) findViewById(R.id.rate4);

        bintang4 = (ImageView) findViewById(R.id.bintang4);

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
        rate4.setText(" ");
        bintang4.setImageResource(R.color.ColorTransparent);


    }
}
