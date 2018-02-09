package com.example.didact.u3_listviewpersonalizadoanime;

/**
 * Created by DIDACT on 09/02/2018.
 */

public class Personaje {
    String nombre;
    String serie;
    String frase;
    String imagen;

    public Personaje(String nombre, String serie, String frase, String imagen) {
        this.nombre = nombre;
        this.serie = serie;
        this.frase = frase;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
