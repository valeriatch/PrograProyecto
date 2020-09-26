/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JList;

/**
 *
 * @author XperriX
 */
public class Modelo {
    
    public Modelo (){
        
    usuarios = new ArrayList <Usuario>();
    aerolineas = new ArrayList<Aerolinea>();
    clientes = new ArrayList<Cliente>();
    vuelos = new ArrayList<Vuelos>();
    }
    
    
    public void annadirUusario(Usuario usuario1){
        usuarios.add(usuario1);
    }
    public void annadirAerolinea(Aerolinea aerolinea1){
        aerolineas.add(aerolinea1);
    }
    public void modificarAerolinea(Aerolinea aerolinea2){
        
    }
    public void annadirCliente(Cliente cliente1){
        clientes.add(cliente1);
    }
    public void annadirVuelos(Vuelos vuelo1){
        vuelos.add(vuelo1);
        
    }
    
    
    //public Iterator <Vuelos> i = vuelos.iterator();
        
    private ArrayList <Usuario> usuarios;
    private ArrayList <Aerolinea> aerolineas;
    private ArrayList <Cliente> clientes;
    private ArrayList <Vuelos> vuelos;
}
