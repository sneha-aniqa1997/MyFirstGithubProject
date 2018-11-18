package com.example.aniqa.myapplication2;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerTest extends AppCompatActivity {
        TextView mTv;
        Button mbtn;

        Calendar c;
        DatePickerDialog dpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_test);
        mTv=(TextView)findViewById(R.id.textView19);
        mbtn=(Button)findViewById(R.id.buttonPick);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c= Calendar.getInstance();
                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);

                dpd= new DatePickerDialog(DatePickerTest.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        mTv.setText(i2 + "/" + (i1+1) + "/" +i);
                    }
                }, day, month, year);
                dpd.show();
            }
        });

    }
}
