package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    public ImageButton imageButton_inicio;
    public ImageButton imageButton_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton_inicio= findViewById(R.id.imageButton_inicio_sesion);
        imageButton_registro=findViewById(R.id.imageButton_registro);


        imageButton_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,InicioSesionOpciones.class);
                startActivity(intent);
            }
        });

        imageButton_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



}