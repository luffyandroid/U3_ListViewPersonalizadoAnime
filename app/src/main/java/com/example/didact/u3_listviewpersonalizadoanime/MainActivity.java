package com.example.didact.u3_listviewpersonalizadoanime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPersonajes;
    ArrayList<Personaje> listaPersonajes = new ArrayList<>();
    TextView tvNombrefinal, tvSeriefinal, tvFrasefinal;
    ImageView ivImagenfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombrefinal = (TextView)findViewById(R.id.tvNombreFinal);
        tvSeriefinal = (TextView)findViewById(R.id.tvSerieFinal);
        tvFrasefinal = (TextView)findViewById(R.id.tvFraseFinal);
        ivImagenfinal = (ImageView)findViewById(R.id.ivImagenFinal);

        cargarDatos();

        lvPersonajes = (ListView)findViewById(R.id.lvPersonajes);

        AdaptadorPersonaje adaptadorPersonaje=new AdaptadorPersonaje(this,listaPersonajes);

        lvPersonajes.setAdapter(adaptadorPersonaje);

        lvPersonajes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Personaje p =((Personaje)parent.getItemAtPosition(position));
                String frase = p.getFrase();
                Toast.makeText(getApplicationContext(),frase,Toast.LENGTH_LONG).show();
            }
        });

        lvPersonajes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Personaje p =((Personaje)parent.getItemAtPosition(position));
                String nombre = p.getNombre();
                String serie = p.getSerie();
                String frase = p.getFrase();
                String imagen = p.getImagen();
                tvNombrefinal.setText(nombre);
                tvSeriefinal.setText(serie);
                tvFrasefinal.setText(frase);

                int idImagen = getApplicationContext().getResources().getIdentifier(imagen, "drawable",getApplicationContext().getPackageName());
                ivImagenfinal.setImageResource(idImagen);

                return true;
            }
        });


    }

    private void cargarDatos() {
        listaPersonajes.add(new Personaje("Goku","Dragon Ball","KAMEHAME HA!!!","goku"));
        listaPersonajes.add(new Personaje("Naruto","Naruto","RASENGAN!!!","naruto"));
        listaPersonajes.add(new Personaje("Luffy","One Piece","Gomu gomu no GATLINGUN!!!","luffy"));
        listaPersonajes.add(new Personaje("Ichigo","Bleach","BANKAI!!!","ichigo"));
        listaPersonajes.add(new Personaje("Midoriya","Boku no hero academia","FULL CROWL!!!","midoriya"));
        listaPersonajes.add(new Personaje("Saitama","One punch man","NO LLEGUE A LA HORA DE LAS REBAJAS!!!","saitama"));
        listaPersonajes.add(new Personaje("Natsu","Fairy tail","DRAGON BREATH!!!","natsu"));
        listaPersonajes.add(new Personaje("Meliodas","Nanatsu no taizai","PERFECT COUNTER!!!","meliodas"));
    }

}
