package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Time extends AppCompatActivity {

    public Button button19;
    public Button button20;
    public Button button21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();

            }
        });


    }
    public void openMain2Activity() {
        Intent intent1 = new Intent(this,Priority.class);
        startActivity(intent1);
    }
    public void openMain3Activity() {
        Intent intent2 = new Intent(this,No.class);
        startActivity(intent2);
    }
    public void openMain4Activity() {
        Intent intent3 = new Intent(this,Plan.class);
        startActivity(intent3);
    }

}
