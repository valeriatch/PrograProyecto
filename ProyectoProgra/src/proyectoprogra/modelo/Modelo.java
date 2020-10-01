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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Vuelos> getVuelos() {
        return vuelos;
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
    public boolean verificaUsuario(String nombre, String contrasenna)
    {
        boolean nomb = false;
        boolean contra = false;
        for(int i = 0; i < usuarios.size(); i++)
        {
            Usuario u = usuarios.get(i);
            if(u.getNombreUsuario().equals(nombre))
            {
                if(u.getContrasenna().equals(contrasenna))
                {
                    nomb = true;
                    contra = true;
                    break;
                }
            }
            
        }
        if(nomb && contra)
        {
            return true;
        }
        return false;
    }
    public String buscarCliente(int ID){
        String resultadoCliente = "";
        
        for(int i = 0; i < clientes.size(); i++){
            Cliente clien1 = clientes.get(i);
            if((clien1.getID())==(ID)){
                //System.out.println(clien1.toString());
                resultadoCliente =  clien1.toString();
               
            }
        }
        return resultadoCliente;
    }
        
    public String toStringUsuarios() {
        return "Modelo{" + "usuarios=" + usuarios + '}';
    }
    public String toStringAerolineas() {
        return "Modelo{" + "aerolineas=" + aerolineas + '}';
    }
    public String toStringClientes() {
        return "Modelo{" + "clientes=" + clientes + '}';
    }
    public String toStringVuelos() {
        return "Modelo{" + "vuelos=" + vuelos + '}';
    }
    
    //public Iterator <Vuelos> i = vuelos.iterator();
        
    private ArrayList <Usuario> usuarios;
    private ArrayList <Aerolinea> aerolineas;
    private ArrayList <Cliente> clientes;
    private ArrayList <Vuelos> vuelos;
}
