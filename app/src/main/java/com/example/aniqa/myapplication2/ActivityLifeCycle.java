package com.example.aniqa.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.i("i am in","i am on onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("i am in","i am on onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("i am in","i am on onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("i am in","i am on onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("i am in","i am on onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("i am in","i am on onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("i am in","i am on onDestroy");
    }
}

