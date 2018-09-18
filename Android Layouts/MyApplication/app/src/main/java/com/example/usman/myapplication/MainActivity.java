package com.example.usman.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonOne;
    Button buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonOne = (Button)findViewById(R.id.relativeLayout);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, RelativeLayout.class));

            }
        });

        buttonTwo = (Button)findViewById(R.id.constrainLayout);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, ConstrainLayout.class));

            }
        });

    }



}
