package com.example.apoorva.softskilldevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tips extends AppCompatActivity {

    public TextView textView5;
    public TextView textView6;
    public TextView textView7;

    public TextView textView9;
    public TextView textView10;
    public TextView textView11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);

        textView9 = (TextView) findViewById(R.id.textView13);
        textView10 = (TextView) findViewById(R.id.textView14);
        textView11 = (TextView) findViewById(R.id.textView15);





    }
}
