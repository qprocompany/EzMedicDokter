package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DetailPasien extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerDiagnosa;
    Spinner spinnerObat;
    Button buttonPrevious, confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien);

        spinnerDiagnosa = (Spinner) findViewById(R.id.spinnerDiagnosa);
        ArrayAdapter<CharSequence> adapterDiagnosa = ArrayAdapter.createFromResource(this,R.array.diagnosa , android.R.layout.simple_spinner_item);
        adapterDiagnosa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDiagnosa.setAdapter(adapterDiagnosa);
        spinnerDiagnosa.setOnItemSelectedListener(this);

        spinnerObat = (Spinner) findViewById(R.id.spinnerObat);
        ArrayAdapter<CharSequence> adapterObat = ArrayAdapter.createFromResource(this,R.array.obat , android.R.layout.simple_spinner_item);
        adapterObat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerObat.setAdapter(adapterObat);
        spinnerObat.setOnItemSelectedListener(this);

        buttonPrevious = (Button)findViewById(R.id.buttonPrevious);
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien.this, PreviousEpisode.class);
                startActivity(intent);
            }
        });

        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien.this, PopConfirm.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
//        String text = parent.getItemAtPosition(position).toString();
//        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
