package com.example.aniqa.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Welcome extends AppCompatActivity {
    TextView textView2,textView3, textView4;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);


        Intent intent=getIntent();
        String recievedName=intent.getStringExtra("Name");
        String recievedAge=intent.getStringExtra("age");
        String recievedEmail=intent.getStringExtra("Email");
        textView2.setText("your name is: "+recievedName);
        textView3.setText("your age is: "+recievedAge);
        textView4.setText("your email is: "+recievedEmail);


        // String recievedName= getIntent().getExtras().getString("Name");
        //String recievedAge= getIntent().getExtras().getString("age");
        // String recievedEmail= getIntent().getExtras().getString("Email");




    }


}
