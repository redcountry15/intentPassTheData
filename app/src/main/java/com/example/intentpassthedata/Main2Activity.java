package com.example.intentpassthedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView txt = (TextView) findViewById(R.id.txtData);

        Bundle bundle = getIntent().getExtras();

        String myTxt = bundle.getString("name");

        txt.setText(myTxt);
    }
}
