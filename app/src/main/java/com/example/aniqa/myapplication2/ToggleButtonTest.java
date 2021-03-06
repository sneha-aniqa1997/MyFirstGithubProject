 package com.example.aniqa.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonTest extends AppCompatActivity {
    TextView tv;
    ToggleButton toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_test);
        toggle= findViewById(R.id.toggle);
        tv= findViewById(R.id.textView20);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    tv.setVisibility(View.VISIBLE);
                }
                else
                    {
                    tv.setVisibility(View.INVISIBLE);
                    }
                }
        });
    }

    public void ToggleClick(View view)
    {
        if(toggle.isChecked())
        {
            tv.setText("On");
        }
        else {
            tv.setText("Off");
        }
    }
}
