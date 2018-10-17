package com.example.aniqa.myapplication2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;


public class ActivityLifeCycle extends AppCompatActivity {
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        textView=findViewById(R.id.myButton);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                PopupMenu popupMenu= new PopupMenu(ActivityLifeCycle.this,textView);

                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
                {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();

                        if (id == R.id.yellow) {
                            textView.setTextColor(Color.YELLOW);
                        }
                        if (id == R.id.red) {
                            textView.setTextColor(Color.RED);
                        }
                        if (id == R.id.black) {
                            textView.setTextColor(Color.BLACK);
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        Log.i("i am in","i am on onCreate");
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i("i am in","i am on onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i("i am in","i am on onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i("i am in","i am on onPause");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i("i am in","i am on onRestart");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i("i am in","i am on onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i("i am in","i am on onDestroy");
//    }
}

