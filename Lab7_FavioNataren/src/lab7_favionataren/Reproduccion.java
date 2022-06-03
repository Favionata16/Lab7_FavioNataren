/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_favionataren;

import java.util.ArrayList;

/**
 *
 * @author elbal
 */
public class Reproduccion {

    private String nombre;
    private int likes;
    private ArrayList<Canciones> canciones;

    public Reproduccion(String nombre, int likes, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.likes = likes;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Reproduccion{" + "nombre=" + nombre + ", likes=" + likes + ", canciones=" + canciones + '}';
    }

}
