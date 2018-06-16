package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lifeskill extends AppCompatActivity {

    public Button button23;
    public Button button24;
    public Button button25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifeskill);

        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();

            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();

            }
        });


    }
    public void openMain2Activity() {
        Intent intent1 = new Intent(this,Goal.class);
        startActivity(intent1);
    }
    public void openMain3Activity() {
        Intent intent1 = new Intent(this,Attitude.class);
        startActivity(intent1);
    }
    public void openMain4Activity() {
        Intent intent1 = new Intent(this,Emotion.class);
        startActivity(intent1);
    }

}
