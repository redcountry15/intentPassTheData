package com.example.intentpassthedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = (EditText) findViewById(R.id.editText1);

        Button tombol = (Button) findViewById(R.id.btnExtra);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent niat = new Intent(MainActivity.this,Main2Activity.class);
                niat.putExtra("name",nama.getText().toString());
                startActivity(niat);
            }
        });
    }
}
