package com.example.didact.u3_listviewpersonalizadoanime;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 09/02/2018.
 */



public class AdaptadorPersonaje extends ArrayAdapter<Personaje> {

    ArrayList<Personaje> personajes;
    Context c;

    public AdaptadorPersonaje(Context c, ArrayList<Personaje> personajes){
        super(c, R.layout.item_personaje, personajes);
        this.c = c;
        this.personajes = personajes;



    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_personaje, null);

        TextView tv_nombre=(TextView)item.findViewById(R.id.tvNombre);
        tv_nombre.setText(personajes.get(position).getNombre());


        TextView tv_serie=(TextView)item.findViewById(R.id.tvSerie);
        tv_serie.setText(personajes.get(position).getSerie());

        TextView tv_frase=(TextView)item.findViewById(R.id.tvFrase);
        tv_frase.setText(personajes.get(position).getFrase());


        String imagen = personajes.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable",c.getPackageName());
        ImageView iv_imagen = (ImageView)item.findViewById(R.id.ivImagen);
        iv_imagen.setImageResource(idImagen);


        return item;
    }
}
