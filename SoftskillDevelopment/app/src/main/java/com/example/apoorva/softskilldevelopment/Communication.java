package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Communication extends AppCompatActivity {

    public Button button;
    public Button button2;
    public Button button5;
    public Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunication);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain5Activity();

            }
        });

    }
    public void openMain2Activity() {
        Intent intent1 = new Intent(this,Listening.class);
        startActivity(intent1);
    }
    public void openMain3Activity() {
        Intent intent2 = new Intent(this,Non_verbal.class);
        startActivity(intent2);
    }
    public void openMain4Activity() {
        Intent intent2 = new Intent(this,Stress.class);
        startActivity(intent2);
    }
    public void openMain5Activity() {
        Intent intent2 = new Intent(this,Assert.class);
        startActivity(intent2);
    }
}
