/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import proyectoprogra.controlador.Controlador;
import proyectoprogra.modelo.Modelo;
import proyectoprogra.vista.MainFrame;
import proyectoprogra.vista.VistaConfiguracion;
import proyectoprogra.vista.VistaLogin;
import proyectoprogra.vista.VistaRegistraAerolinea;
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
        
        Controlador c = new Controlador(modelo, vistalogin, vistaConfig, mainFrame, vistaRegAero, vistaVuelos);
        vistalogin.iniciar();
    
    }
    
}
