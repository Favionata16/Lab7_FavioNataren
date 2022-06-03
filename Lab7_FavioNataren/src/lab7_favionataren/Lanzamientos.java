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
public class Lanzamientos {

    private String tituloLanzamiento;
    private String fechaLanzamiento;
    private int likes;

    public Lanzamientos(String tituloLanzamiento, String fechaLanzamiento, int likes) {
        this.tituloLanzamiento = tituloLanzamiento;
        this.fechaLanzamiento = fechaLanzamiento;
        this.likes = likes;
    }

    public String getTituloLanzamiento() {
        return tituloLanzamiento;
    }

    public void setTituloLanzamiento(String tituloLanzamiento) {
        this.tituloLanzamiento = tituloLanzamiento;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamientos[" + "tituloLanzamiento=" + tituloLanzamiento + ", fechaLanzamiento=" + fechaLanzamiento + ", likes=" + likes + ']';
    }

}
