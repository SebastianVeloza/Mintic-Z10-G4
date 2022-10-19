package com.example.z10_g4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registro;
    Button ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreso=(Button) findViewById(R.id.btn_Ingreso);
        registro=(Button) findViewById(R.id.btn_registro);

        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapa=new Intent( MainActivity.this , Mapa.class);
                startActivity(mapa);
            }
        });

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registro= new Intent(MainActivity.this , registro.class);
                startActivity(registro);


            }
        });
    }
}