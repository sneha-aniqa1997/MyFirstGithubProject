package com.example.aniqa.myapplication2;

import android.app.ActionBar;
import android.content.Intent;
import android.drm.DrmStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MenuItem;



public class BackPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_press);
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!= null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        //Intent intent=new Intent (Intent.ACTION_MAIN);
        //intent.addCategory(Intent.CATEGORY_HOME);
        //intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        //startActivity(intent);
        Intent intent= new Intent(BackPress.this,OptionMenuIntegrate.class);
        startActivity(intent);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id=item.getItemId();

        if(id==android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
        }
}
