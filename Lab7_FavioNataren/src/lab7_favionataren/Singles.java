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
public class Singles extends Lanzamientos {

    private Canciones cancion;

    public Singles(Canciones cancion, String tituloLanzamiento, String fechaLanzamiento, int likes) {
        super(tituloLanzamiento, fechaLanzamiento, likes);
        this.cancion = cancion;
    }

    public Canciones getCancion() {
        return cancion;
    }

    public void setCancion(Canciones cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Singles{" + "cancion=" + cancion + '}';
    }

}
