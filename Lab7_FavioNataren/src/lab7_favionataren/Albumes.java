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
public class Albumes extends Lanzamientos {

    private ArrayList<Canciones> canciones;
    private int cantidadCanciones;

    public Albumes(ArrayList<Canciones> canciones, int cantidadCanciones, String tituloLanzamiento, String fechaLanzamiento, int likes) {
        super(tituloLanzamiento, fechaLanzamiento, likes);
        this.canciones = canciones;
        this.cantidadCanciones = cantidadCanciones;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    @Override
    public String toString() {
        return "Albumes{" + "canciones=" + canciones + ", cantidadCanciones=" + cantidadCanciones + '}';
    }

}
