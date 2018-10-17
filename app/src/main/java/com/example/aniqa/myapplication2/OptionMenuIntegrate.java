package com.example.aniqa.myapplication2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionMenuIntegrate extends AppCompatActivity {
    RelativeLayout relative;
    ImageView image10,image11,image12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_integrate);
        relative=findViewById(R.id.relative);
        image10= findViewById(R.id.image10);
        image11=findViewById(R.id.image11);
        image12=findViewById(R.id.image12);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.yellow)
        {
            relative.setBackgroundColor(Color.YELLOW);
        }
        if(id==R.id.red)
        {
            relative.setBackgroundColor(Color.RED);
        }
        if(id==R.id.black)
        {
            relative.setBackgroundColor(Color.BLACK);
        }
        if(id==R.id.logout)
        {
            Toast.makeText(this, "logging out", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.rose)
        {
            relative.setBackgroundResource(R.drawable.rose);
        }
        if(id==R.id.car)
        {
            relative.setBackgroundResource(R.drawable.car);
        }
       if(id==R.id.dolly)
       {
           relative.setBackgroundResource(R.drawable.dolly);
       }


        return super.onOptionsItemSelected(item);
    }
}
