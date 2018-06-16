package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personality extends AppCompatActivity {

    public Button button28;
    public Button button29;
    public Button button30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        button28 = findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        button29 = findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();
            }
        });
        button30 = findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();
            }
        });
    }
    public void openMain2Activity(){
        Intent intent1 = new Intent(this,Leadership.class);
        startActivity(intent1);
    }
    public void openMain3Activity(){
        Intent intent2 = new Intent(this,Career.class);
        startActivity(intent2);
    }
    public void openMain4Activity(){
        Intent intent3 = new Intent(this,Job_cut.class);
        startActivity(intent3);
    }
}
