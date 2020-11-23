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
        historia="Eran las 8 de la mañana y" +" "+nombre+" "+
                "como de costumbre se encontraba jugando en el ático. " +
                "De repente encontró una llave misteriosa que nunca había visto, de color dorado y forma de colibrí, " +
                "no dudó ni por un instante y comenzó a buscar qué abría, intentó usarla en varias cerraduras, en la puerta " +
                "de un viejo armario, en el baúl del abuelo, investigo por todo el lugar y vio una puerta de madera con visos dorados y se acercó a " +
                "ella saltando como un grillo, pensando que la había encontrado, pero cuando intentó abrirla, la llave no entró en la cerradura. " +" "+
                nombre +" "+
                "se sentía un poco desilusionada y estaba pensando en rendirse, se sentó en encima de una caja de carton llena de revistas viejas, " +
                "y desde ahí vio un libro con una pasta de madera tallada con figuras de animales salvajes donde sobresalía un hermoso colibrí que señalaba " +
                "un cerrojo dorado que impedía abrir el libro.";
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
                intent1.putExtra("nombre",nombre);
                startActivity(intent1);
            }
        });

        text_historia.setText(historia);
    }

}