package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Historia3 extends AppCompatActivity {


    TextView text_historia4;

    String historia,nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia3);
        Intent intent = getIntent();

        nombre=intent.getStringExtra("nombre");
        text_historia4= findViewById(R.id.text_historia4);
        historia="A " +" "+
                nombre +" "+
                "no le daba buena espina esa ave tan orgullosa y pensó que sería mejor explorar el bosque por su cuenta, " +
                "notó que todo el lugar estaba lleno de lindas piedras que daban visos muy llamativos y quiso tocarlas, pero cuando se inclinó para tocar una, " +
                "la tierra se empezó a mover y una gran nube de polvo cubrió todo el lugar. Escuchó una voz fuerte que decía ¿quién eres tú?, ¿por qué quieres " +
                "tomar mi tesoro? " +
                " "+
                nombre +" "+
                "miró por todo el lugar y no vio a nadie, pensó que lo había imaginado. El brillo de las piedras le llamaba mucho la " +
                "atención y de nuevo intentó tocarlas, pero esta vez un viento muy fuerte pasó por su lado con tanta fuerza que dio varias vueltas y cayó al suelo, " +
                "no sabía que había sido eso, pero desde el suelo vio que unas piedras grandes tenían pies, se sorprendió mucho y sintió miedo, se levantó e intentó correr, " +
                "pero todas las piedras se movieron y la rodearon y no tenía salida. En lo alto de un " +
                "árbol había un mono que miraba todo lo que pasaba y quiso ayudar a " +" "+
                nombre +
                ", entonces le arrojó una liana para que ella subiera. ";

        text_historia4.setText(historia);


    }
}