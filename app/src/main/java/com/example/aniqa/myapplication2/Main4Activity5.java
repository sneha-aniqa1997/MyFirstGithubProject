package com.example.aniqa.myapplication2;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity5 extends AppCompatActivity {
    Button button1,button2, button3, button4, button5, button6;
    ImageView imageViewA,imageViewB,imageViewC,imageViewD,imageViewE,imageViewF;




    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button1=findViewById(R.id.changeButton3);
        imageViewA=findViewById(R.id.imageView2);
        button2=findViewById(R.id.changeButton4);
        imageViewB=findViewById(R.id.imageView3);
        button3=findViewById(R.id.changeButton5);
        imageViewC=findViewById(R.id.imageView4);
        button4=findViewById(R.id.changeButton6);
        imageViewD=findViewById(R.id.imageView5);
        button5=findViewById(R.id.changeButton7);
        imageViewE=findViewById(R.id.imageView6);
        button6=findViewById(R.id.changeButton8);
        imageViewF=findViewById(R.id.imageView7);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewA.setImageDrawable(getDrawable(R.drawable.flower));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewB.setImageDrawable(getDrawable(R.drawable.mommy));
            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View view) {
             imageViewC.setImageDrawable(getDrawable(R.drawable.youngman));
         }
     });



       button4.setOnClickListener(new View.OnClickListener() {
         @Override
           public void onClick(View view) {
             imageViewD.setImageDrawable(getDrawable(R.drawable.lilboy));
         }
      });

       button5.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               imageViewE.setImageDrawable(getDrawable(R.drawable.buddha));
          }
      });


      button6.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View view) {
               imageViewF.setImageDrawable(getDrawable(R.drawable.girl));
           }
       });




    }

}
