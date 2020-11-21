package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Historia2 extends AppCompatActivity {

    String historia,nombre;
    ImageView imageView_anterior,home,librito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia2);
        home = findViewById(R.id.home_h2);
        imageView_anterior=findViewById(R.id.anterior4);
        Intent intent = getIntent();
        nombre=intent.getStringExtra("nombre");

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Historia2.this,MainActivity.class);
                startActivity(intent1);
            }
        });

        imageView_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



    }

}