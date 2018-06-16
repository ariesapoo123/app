package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FIRSTPAGE extends AppCompatActivity {
    public Button button;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        button = findViewById(R.id.english);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        button1 = findViewById(R.id.communication);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();
            }
        });
        button2 = findViewById(R.id.energy);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain5Activity();
            }
        });
        button3 = findViewById(R.id.time);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain1Activity();
            }
        });


    }
    public void openMain2Activity(){
        Intent intent1 = new Intent(this,Communication.class);
        startActivity(intent1);
    }
    public void openMain4Activity(){
        Intent intent2 = new Intent(this,Tips.class);
        startActivity(intent2);
    }
    public void openMain5Activity(){
        Intent intent3 = new Intent(this,Lifeskill.class);
        startActivity(intent3);
    }
    public void openMain3Activity(){
        Intent intent4 = new Intent(this,Time.class);
        startActivity(intent4);
    }
    public void openMain1Activity(){
        Intent intent4 = new Intent(this,Personality.class);
        startActivity(intent4);
    }

}

