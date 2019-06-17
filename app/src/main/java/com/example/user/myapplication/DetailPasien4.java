package com.example.user.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailPasien4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button next, tambah;

    ImageView popDiagnosa, popProsedur;

    Spinner spinnerRefer;

    CalendarView calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien4);

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien4.this, PopConfirm.class);
                startActivity(intent);
            }
        });


        popDiagnosa= (ImageView) findViewById(R.id.popDiagnosa);
        popDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien4.this, PopDiagnosa.class);
                startActivity(intent);
            }
        });

        popProsedur= (ImageView) findViewById(R.id.popProsedur);
        popProsedur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPasien4.this, PopProsedur.class);
                startActivity(intent);
            }
        });

        spinnerRefer = (Spinner) findViewById(R.id.spinnerRefer);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.refer, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRefer.setAdapter(adapter);

        tambah = (Button) findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (calender.getVisibility() == View.VISIBLE){
                calender.setVisibility(View.GONE);
                }else {calender.setVisibility(View.VISIBLE);}
            }
        });

        calender = (CalendarView) findViewById(R.id.calender);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, final int i, int i1, int i2) {
                try {
                    String date = (i1 + 1) + "/" + i2 + "/" + i;
                    DateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
                    DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");
                    Date inputDateStr = inputFormat.parse(date);
                    String outputDateStr = outputFormat.format(inputDateStr);
                    tambah.setText(outputDateStr);
                    calender.setVisibility(View.GONE);
                }catch (Exception e){}
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
