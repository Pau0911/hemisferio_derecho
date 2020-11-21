package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AdondeQuieresIr extends AppCompatActivity {

    TextView text_adonde_quieres_ir;
    String text;
    String nombre;
    ImageView imageView_pavo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adonde_quieres_ir);
        Intent intent = getIntent();

        nombre=intent.getStringExtra("nombre");
        text_adonde_quieres_ir= findViewById(R.id.text_adonde_quieres_ir);
        text= nombre+","+" ";
        text= text+ "¿A dónde quieres ir hoy?";
        text_adonde_quieres_ir.setText(text);
        imageView_pavo= findViewById(R.id.pavo);

        imageView_pavo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(AdondeQuieresIr.this, Historia.class);
                intent1.putExtra("nombre",nombre);
                startActivity(intent1);


            }
        });


    }

}