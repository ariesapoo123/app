package com.example.apoorva.softskilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Button button1;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        button1 = findViewById(R.id.mainBtn1);
        button = findViewById(R.id.mainBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain1Activity();

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this,job_registration.class);
        startActivity(intent);
    }
    public void openMain1Activity(){
        Intent intent = new Intent(this,FIRSTPAGE.class);
        startActivity(intent);
    }
}
