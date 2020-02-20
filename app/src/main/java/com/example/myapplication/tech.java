package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tech extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tech);

            Button OneOne = findViewById(R.id.button1);
            Button OneTwo = findViewById(R.id.button2);
            Button OneThree = findViewById(R.id.button3);
            TextView StoryLineTech = findViewById(R.id.textView3);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent b;
                    switch (v.getId()) {
                        case R.id.button1:


                            break;
                        case R.id.button2:

                            break;
                        case R.id.button3:

                            break;
                    }
                }
            };
        }
    }
