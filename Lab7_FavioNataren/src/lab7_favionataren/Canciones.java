/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_favionataren;

/**
 *
 * @author elbal
 */
public class Canciones {

    private String titulo;
    private double tiempoDuración;
    private Albumes albumPertence;

    public Canciones(String titulo, double tiempoDuración, Albumes albumPertence) {
        this.titulo = titulo;
        this.tiempoDuración = tiempoDuración;
        this.albumPertence = albumPertence;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTiempoDuración() {
        return tiempoDuración;
    }

    public void setTiempoDuración(double tiempoDuración) {
        this.tiempoDuración = tiempoDuración;
    }

    public Albumes getAlbumPertence() {
        return albumPertence;
    }

    public void setAlbumPertence(Albumes albumPertence) {
        this.albumPertence = albumPertence;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", tiempoDuraci\u00f3n=" + tiempoDuración + ", albumPertence=" + albumPertence + '}';
    }

}
