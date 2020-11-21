package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    public String nombre;
    TextView textView_bienvenida;
    String texto_inicial;
    ImageView imageView_siguiente, imageView_anterior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        Intent intent = getIntent();
        nombre=intent.getStringExtra("nombre");
        imageView_siguiente= findViewById(R.id.siguiente2);
        imageView_anterior= findViewById(R.id.anterior2);
        texto_inicial= "Hola"+" ";
        texto_inicial= texto_inicial+nombre+",";
        texto_inicial=texto_inicial+"te damos una calurosa bienvenida";
        textView_bienvenida= findViewById(R.id.text_bienvenida);
        textView_bienvenida.setText(texto_inicial);

        imageView_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        imageView_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Bienvenida.this, AdondeQuieresIr.class);
                intent1.putExtra("nombre",nombre);
                startActivity(intent1);

            }
        });
    }


}