package com.example.samueldzibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnViewInformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnViewInformation = (Button)findViewById(R.id.btnViewMessage);
        btnViewInformation.setOnClickListener(viewInformation);
    }


    private View.OnClickListener viewInformation = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"Programa para la clase de TENDENCIAS DE MOVILIDAD Y COLABORACIÓN",Toast.LENGTH_LONG).show();
        }
    };
}
