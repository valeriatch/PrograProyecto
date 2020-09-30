/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.modelo;

/**
 *
 * @author Jeremy
 */
public class Aerolinea {
    private String nombre;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public Aerolinea(){
        nombre = "";
        fecha = "";
    }

    @Override
    public String toString() {
        return "Aerolinea{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
    public Aerolinea(String fecha, String nombre){
        this.fecha = fecha;
        this.nombre = nombre;
    }
}
