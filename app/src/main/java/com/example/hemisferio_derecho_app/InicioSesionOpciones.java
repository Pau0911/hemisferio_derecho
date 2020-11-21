package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class InicioSesionOpciones extends AppCompatActivity {

    String usuarioPadre,usuarioPeque, contrasena;
    EditText edit_padre, edit_peque,edit_contrasena;
    ImageButton anterior_img,siguiente_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion_opciones);

        edit_padre= findViewById(R.id.edit_padre);
        edit_contrasena=findViewById(R.id.edit_contrasena);
        edit_peque=findViewById(R.id.edit_peque);
        anterior_img= findViewById(R.id.anterior);
        siguiente_img=findViewById(R.id.siguiente);

        anterior_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        getInformation();
    }

    public void getInformation(){
        usuarioPadre= edit_padre.getText().toString();
        usuarioPeque= edit_peque.getText().toString();
        contrasena=edit_contrasena.getText().toString();

    }

}