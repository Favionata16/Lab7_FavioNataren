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
public class Clientes extends Usuarios {

    private ArrayList<Canciones> CancionesFavoritas;
    private ArrayList<Reproduccion> listaCreada;
    private ArrayList<Reproduccion> listaLikes;

    public Clientes(ArrayList<Canciones> CancionesFavoritas, ArrayList<Reproduccion> listaCreada, ArrayList<Reproduccion> listaLikes, String usuario, String contrasena, int edad) {
        super(usuario, contrasena, edad);
        this.CancionesFavoritas = CancionesFavoritas;
        this.listaCreada = listaCreada;
        this.listaLikes = listaLikes;
    }

    public ArrayList<Canciones> getCancionesFavoritas() {
        return CancionesFavoritas;
    }

    public void setCancionesFavoritas(ArrayList<Canciones> CancionesFavoritas) {
        this.CancionesFavoritas = CancionesFavoritas;
    }

    public ArrayList<Reproduccion> getListaCreada() {
        return listaCreada;
    }

    public void setListaCreada(ArrayList<Reproduccion> listaCreada) {
        this.listaCreada = listaCreada;
    }

    public ArrayList<Reproduccion> getListaLikes() {
        return listaLikes;
    }

    public void setListaLikes(ArrayList<Reproduccion> listaLikes) {
        this.listaLikes = listaLikes;
    }

    @Override
    public String toString() {
        return "Clientes{" + "CancionesFavoritas=" + CancionesFavoritas + ", listaCreada=" + listaCreada + ", listaLikes=" + listaLikes + '}';
    }

}
