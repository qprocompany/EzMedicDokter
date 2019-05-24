package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailPasienBatal extends AppCompatActivity {

    LinearLayout jadwalPasien4;
    LinearLayout garisH4;
    TextView namaJadwal4;
    TextView umurJadwal4;
    TextView noJadwal4;
    TextView thnJadwal4;
    TextView kedatangan4;
    TextView rate4;
    ImageView bintang4;
    CircleImageView fotoJadwal4;
    TextView visitTxt4;
    TextView tglJadwal4;
    TextView diagnosaTxt4;
    TextView isiDiagnosa4;
    ImageView genderJadwal4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien_batal);

        visitTxt4 = (TextView) findViewById(R.id.visitTxt4);

        tglJadwal4 = (TextView) findViewById(R.id.tglJadwal4);

        diagnosaTxt4 = (TextView) findViewById(R.id.diagnosaTxt4);

        isiDiagnosa4 = (TextView) findViewById(R.id.isiDiagnosa4);

        genderJadwal4 = (ImageView) findViewById(R.id.genderJadwal4);

        jadwalPasien4 = (LinearLayout) findViewById(R.id.jadwalPasien4);

        garisH4 = (LinearLayout) findViewById(R.id.garisH4);

        namaJadwal4 = (TextView) findViewById(R.id.namaJadwal4);

        umurJadwal4 = (TextView) findViewById(R.id.umurJadwal4);

        noJadwal4 = (TextView) findViewById(R.id.noJadwal4);

        thnJadwal4 = (TextView) findViewById(R.id.thnJadwal4);

        fotoJadwal4 = (CircleImageView) findViewById(R.id.fotoJadwal4);

        kedatangan4 = (TextView) findViewById(R.id.kedatangan4);

        rate4 = (TextView) findViewById(R.id.rate4);

        bintang4 = (ImageView) findViewById(R.id.bintang4);

        fotoJadwal4.setImageResource(R.drawable.foto5);
        namaJadwal4.setText("Supri");
        umurJadwal4.setText("24");
        noJadwal4.setText("081546464896");
        thnJadwal4.setText("Thn");
        visitTxt4.setText("Visit :");
        tglJadwal4.setText("23 Mei 2019 , 16:45");
        diagnosaTxt4.setText("Diagnosa :");
        isiDiagnosa4.setText("Sakit Kepala");
        genderJadwal4.setImageResource(R.drawable.male);
        jadwalPasien4.setBackground(getResources().getDrawable(R.drawable.radiusred));
        garisH4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
        jadwalPasien4.setElevation(5);
        kedatangan4.setText("1");
        rate4.setText("-");
        bintang4.setImageResource(R.drawable.star);

    }
}
