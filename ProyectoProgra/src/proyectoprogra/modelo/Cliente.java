/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.modelo;

/**
 *
 * @author vtrejosc
 */
public class Cliente {
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumeroAcompannantes() {
        return numeroAcompannantes;
    }

    public void setNumeroAcompannantes(int numeroAcompannantes) {
        this.numeroAcompannantes = numeroAcompannantes;
    }
    
    private String nombre; 
    private String apellido; 
    private int ID;
    private int numeroAcompannantes;
    
    
}
