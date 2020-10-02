/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import javax.swing.JOptionPane;
import proyectoprogra.controlador.Controlador;
import proyectoprogra.modelo.Modelo;
import proyectoprogra.modelo.Usuario;
import proyectoprogra.vista.MainFrame;
//import proyectoprogra.vista.VerPlataforma;
import proyectoprogra.vista.VistaAgregarCliente;
import proyectoprogra.vista.VistaBuscarClientes;
import proyectoprogra.vista.VistaConfiguracion;
import proyectoprogra.vista.VistaLogin;
import proyectoprogra.vista.VistaRegistraAerolinea;
import proyectoprogra.vista.VistaVerVuelos;
import proyectoprogra.vista.VistaVuelos;

/**
 *
 * @author vtrejosc
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        VistaLogin vistalogin = new VistaLogin();
        VistaConfiguracion vistaConfig = new VistaConfiguracion();
        MainFrame mainFrame = new MainFrame();
        VistaRegistraAerolinea vistaRegAero = new VistaRegistraAerolinea();
        VistaVuelos vistaVuelos = new VistaVuelos();
        VistaAgregarCliente  vistaAgregarClientes = new VistaAgregarCliente();
        VistaVerVuelos verVuelos = new VistaVerVuelos();
        VistaBuscarClientes vistaBuscarCliente = new VistaBuscarClientes();
        Usuario usuario;
      //  VerPlataforma plataforma = new VerPlataforma();
        

        Controlador c = new Controlador(modelo, vistalogin, vistaConfig, mainFrame, vistaRegAero, vistaVuelos, vistaAgregarClientes, vistaBuscarCliente/*plataforma*/);


        usuario = new Usuario("Administrador", "admin", "admin");
        modelo.annadirUusario(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado...\nUsuario: admin\nContraseña: admin");
        System.out.println(modelo.toStringUsuarios());
        vistalogin.iniciar();
    
    }
    
}
