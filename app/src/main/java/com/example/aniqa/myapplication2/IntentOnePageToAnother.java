package com.example.aniqa.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentOnePageToAnother extends AppCompatActivity {
    EditText edit,edit1,edit2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another);
        button = findViewById(R.id.send);
        edit = findViewById(R.id.editName);
        edit1=findViewById(R.id.editAge);
        edit2=findViewById(R.id.editEmail);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameText = edit.getText().toString();
                String ageText=edit1.getText().toString();
                String emailText=edit2.getText().toString();
                Intent intent=new Intent(IntentOnePageToAnother.this,Welcome.class);
                  intent.putExtra("Name",nameText);
              intent.putExtra("age",ageText);
                intent.putExtra("Email",emailText);
                startActivity(intent);
            }


            });



    }

}

       // button.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   Intent intent =new Intent(IntentOnePageToAnother.this,Linear_Relative.class);
               // startActivity(intent);



