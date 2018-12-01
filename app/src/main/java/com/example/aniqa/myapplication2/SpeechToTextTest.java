package com.example.aniqa.myapplication2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognitionService;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class SpeechToTextTest extends AppCompatActivity {

    TextView text;
    Button mic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech_test);
        initialization();

        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getVoiceInput();
            }
        });

    }
    private void  initialization() {
        text=findViewById(R.id.text);
        mic=findViewById(R.id.mic);


    }
    private void getVoiceInput(){
        Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Please speak somethimg");

      try{
          startActivityForResult(intent, 100);

      }
      catch (ActivityNotFoundException a)

      {

      }
    }

      @Override
      protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

             switch (requestCode)
             {
              case 100: {
                 if(resultCode== RESULT_OK && null != data)
                 {
                    ArrayList<String> result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text.setText(result.get(0));
                 }
                break;
              }

             }

    }
}