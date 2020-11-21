package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Historia extends AppCompatActivity {

    TextView text_historia;
    String historia,nombre;
    ImageView imageView_anterior,home,librito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        Intent intent = getIntent();
        nombre=intent.getStringExtra("nombre");
        historia="Texto";//Texto de la historia
        text_historia= findViewById(R.id.text_historia);
        home = findViewById(R.id.home_h);
        imageView_anterior=findViewById(R.id.anterior3);
        librito= findViewById(R.id.librito);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Historia.this,MainActivity.class);
                startActivity(intent1);
            }
        });

        imageView_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        librito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Historia.this,Historia2.class);
                startActivity(intent1);
            }
        });

    }
}