package com.example.pconverterbydip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertAtoK = (Button) findViewById(R.id.convertAtoK);
        convertAtoK.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                EditText textBoxAcres = (EditText) findViewById(R.id.editText);
                EditText textBoxKatha = (EditText) findViewById(R.id.editText2);
                double vAcres = Double.valueOf(textBoxAcres.getText().toString());
                double vKatha = vAcres / 0.016528926;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKatha.setText(formatVal.format(vKatha));
            }

        });
        Button convertKtoA = (Button) findViewById(R.id.convertKtoA);
        convertKtoA.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                EditText textBoxAcres = (EditText) findViewById(R.id.editText);
                EditText textBoxKatha = (EditText) findViewById(R.id.editText2);
                double vKatha = Double.valueOf(textBoxKatha.getText().toString());
                double vAcres = vKatha * 0.016528926;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxAcres.setText(formatVal.format(vAcres));
            }
        });
    }
}
