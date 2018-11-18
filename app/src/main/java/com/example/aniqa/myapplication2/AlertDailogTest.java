package com.example.aniqa.myapplication2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class AlertDailogTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dailouge);
    }

    @Override
    public void onBackPressed() {
        alertShow();
}

    private void alertShow()
    {
        final AlertDialog.Builder b= new AlertDialog.Builder(this);
        b.setTitle("Exit");
        b.setMessage("Are You Sure?");
        b.setCancelable(false);

        b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        b.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        b.create().show();

    }
    }


