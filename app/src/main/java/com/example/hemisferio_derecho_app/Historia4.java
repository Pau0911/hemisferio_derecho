package com.example.hemisferio_derecho_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Historia4 extends AppCompatActivity {

    ImageView anterior, home;
    TextView text_historia5;
    String historia,nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia4);
        Intent intent = getIntent();

        nombre=intent.getStringExtra("nombre");

        text_historia5= findViewById(R.id.text_historia5);
        anterior= findViewById(R.id.anterior6);
        home= findViewById(R.id.home_h4);
        historia= nombre + " " +
                "confió en el mono e intentó subir por la liana, pero se rompió y terminó en el suelo y este " +
                "se despedazó, cayendo en una cueva muy oscura, no podía ver nada solo la luz que venía de la superficie, " +
                "pero las piedras preciosas que cayeron con ella tenían luz propia, eran fluorescentes. A " + " "+
                nombre + " "+
                "se le ocurrió" +
                " unir varias piedras para iluminar el lugar, detrás de ella vio una salida, pero era una gruta muy oscura y estrecha, " +
                "tuvo que entrar caminando de lado, mientras avanzaba el camino se hacía más y más amplio, eso le daba mucho alivio y tranquilidad," +
                " no tenía miedo ya que desde niña le gustaba explorar su casa a oscuras. Inesperadamente tropezó con algo, lo iluminó con" +
                " las piedras y descubrió que era un libro de madera muy parecido al que había visto en su casa, pero este no tenía cerradura " +
                "sino una letra, estaba muy sucio, con sus manos trató de quitar la suciedad y al frotar la letra el libro se abrió e iluminó " +
                "todo el lugar y se dio cuenta de que había regresado a su casa.";

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Historia4.this,MainActivity.class);
                startActivity(intent1);

            }
        });

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        text_historia5.setText(historia);
    }
}