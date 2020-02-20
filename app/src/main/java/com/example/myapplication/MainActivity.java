package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b;
                switch (v.getId()){
                    case R.id.choice1:
                        b = new Intent(MainActivity.this,game.class);
                        startActivity(b);
                        break;
                   case  R.id.choice2:
                        b = new Intent(MainActivity.this,tech.class);
                        startActivity(b);
                        break;
                  case  R.id.choice3:
                        b = new Intent(MainActivity.this,lifehacks.class);
                        startActivity(b);
                        break;
                    case  R.id.choice4:
                        b = new Intent(MainActivity.this,memes.class);
                        startActivity(b);
                        break;
                }

            }
        };

    }
}
