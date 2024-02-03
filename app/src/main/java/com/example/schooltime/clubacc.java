package com.example.schooltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class clubacc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubacc);

        View backbutton = findViewById(R.id.backbuttonc);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(clubacc.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        View button = findViewById(R.id.button);
//        TextView text = findViewById(R.id.textView);
//        View decac = findViewById(R.id.deca);
    }
}