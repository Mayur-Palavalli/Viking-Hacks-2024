package com.example.schooltime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import java.util.HashMap;
import java.lang.Integer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import com.example.school.R;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView clubid = findViewById(R.id.id);
        TextView invalid = findViewById(R.id.invalid);
        View submit = findViewById(R.id.submit);

        HashMap<Integer, String> clubids = new HashMap<Integer, String>();
        clubids.put(1, "DECA");
        clubids.put(2, "Debate");
        clubids.put(3, "Indopak");
        clubids.put(4, "FBLA");
        clubids.put(5, "Math");
        clubids.put(6,"Chess");
        clubids.put(7, "Model UN");
        clubids.put(8, "Comp Sci");


        View backbutton = findViewById(R.id.backlogin);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                invalid.setText("");
                try {
                    if (clubids.containsKey(Integer.parseInt(clubid.getText().toString()))) {
                        String club = clubids.get(Integer.parseInt(clubid.getText().toString()));
                        if (club.equalsIgnoreCase("DECA")) {
                            startActivity(new Intent(login.this, unfinished.class));
                        }
                    } else {
                        invalid.setText("Invalid ID");
                    }
                } catch (NumberFormatException convert) {
                    invalid.setText("Invalid ID");
                }

            }
        });



        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });





    }
}