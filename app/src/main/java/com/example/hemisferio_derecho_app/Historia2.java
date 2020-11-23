package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Historia2 extends AppCompatActivity {

    String historia,nombre;
    TextView historia2;
    ImageView imageView_anterior,home,librito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia2);
        home = findViewById(R.id.home_h2);
        imageView_anterior=findViewById(R.id.anterior4);
        Intent intent = getIntent();

        nombre=intent.getStringExtra("nombre");
        Log.d("hola", "onCreate: "+nombre);
        historia2= findViewById(R.id.text_historia2);
        historia="Al introducir la llave en el cerrojo todo el lugar se llenó de una bella luz rosada y en un abrir y cerrar de ojos, estaba rodeada de mucha vegetación y se " +
                "escuchaba mucho alboroto, tanto que pensaba que estaba en el zoológico, miraba todo a su alrededor con sus ojos abiertos, como los de un búho, no sabía lo que estaba pasando. " +
                "De repente de las ramas de los árboles empezaron a salir monos, pájaros, ardillas y todo el lugar cambió de color, las hojas verdes de la vegetación, los troncos de los árboles y el suelo se tornaron de azul, " +
                "el lugar era mágico, al mirar de cerca pudo observar que eso se debía a que todo el lugar estaba lleno de hermosas mariposas azules. Los pájaros llenos de curiosidad volaban alrededor " +
                "de " +
                nombre +" "+
                " tanto que ella sentía las " +
                "plumas rosar su cuerpo, los monos no se quedaban atrás, saltaban a su lado y eran tan atrevidos que le tocaban la ropa y le olían las manos, las ardillas subían por su cuerpo y trepaban hasta su cabeza, pero al cabo de un tiempo todos se apartaron " +
                "de ella para dejar pasar al orgulloso pavo real que salió de en medio de un campo de flores rojas, él se acercó confiado con su cabeza en alto, demostrando que era el rey del lugar y" +
                " en medio de un lindo baile le mostraba el camino que la llevaría a una cascada cristalina que dejaba ver una casa. ";

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
        historia2.setText(historia);


    }

}