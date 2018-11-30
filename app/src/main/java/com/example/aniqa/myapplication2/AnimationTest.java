package com.example.aniqa.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class AnimationTest extends AppCompatActivity {
    TextView textView;
    Button zoomin, zoomout, blink, fadein, fadeout;

    Animation aZoomIn, aZoomOut, aBlink, aFadeIn, aFadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);
        textView=findViewById(R.id.textView);
        zoomin=findViewById(R.id.button2);
        zoomout=findViewById(R.id.button3);
        blink=findViewById(R.id.button4);
        fadein=findViewById(R.id.button5);
        fadeout=findViewById(R.id.button6);


        aZoomIn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        aZoomOut= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        aBlink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        aFadeIn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aFadeOut= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);
                textView.startAnimation(aZoomIn);

            }
        });

        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);
                textView.startAnimation(aZoomOut);

            }
        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);
                textView.startAnimation(aBlink);
            }
        });

        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);
                textView.startAnimation(aFadeIn);
            }
        });
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(view.VISIBLE);
                textView.startAnimation(aFadeOut);
            }
        });


    }
}
