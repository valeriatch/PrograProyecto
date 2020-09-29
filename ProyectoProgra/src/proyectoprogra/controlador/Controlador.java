/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyectoprogra.modelo.Aerolinea;
import proyectoprogra.modelo.Modelo;
import proyectoprogra.modelo.Usuario;
import proyectoprogra.modelo.Cliente;
import proyectoprogra.modelo.Vuelos;
import proyectoprogra.vista.MainFrame;
import proyectoprogra.vista.VistaConfiguracion;
import proyectoprogra.vista.VistaLogin;
import proyectoprogra.vista.VistaRegistraAerolinea;
import proyectoprogra.vista.VistaVuelos;

/**
 *
 * @author XperriX
 */
public class Controlador implements ActionListener{
    
    private Modelo m;
    private VistaLogin vistaLogin;
    private VistaConfiguracion vistaConfiguracion;
    private MainFrame mainFrame;
    private VistaRegistraAerolinea vistaRegAero;
    private VistaVuelos vistaVuelos;
    private Usuario usuario;
    
    public Controlador(Modelo m, VistaLogin vistaLogin, VistaConfiguracion vistaConfiguracion, MainFrame mainFrame, VistaRegistraAerolinea vistaRegAero, VistaVuelos vistaVuelos){
        this.m = m;
        this.vistaLogin = vistaLogin;
        this.vistaConfiguracion = vistaConfiguracion;
        this.mainFrame = mainFrame;
        this.vistaRegAero = vistaRegAero;
        this.vistaVuelos = vistaVuelos;
        
        this.vistaLogin.getCreaCuenta().addActionListener(this);
        this.vistaLogin.getIniciaSesion().addActionListener(this);
        
        this.mainFrame.getAerolíneas().addActionListener(this);
        this.mainFrame.getConfiguracion().addActionListener(this);
        this.mainFrame.getVuelos().addActionListener(this);
        this.mainFrame.getVolverBtn().addActionListener(this);
        
        this.vistaVuelos.getVolverbtn().addActionListener(this);
        
        this.vistaConfiguracion.getVolverBtn().addActionListener(this);
        this.vistaConfiguracion.getAceptarBttn().addActionListener(this);
        
        this.vistaRegAero.getVolverBtn().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(vistaLogin.getCreaCuenta()))
        {
            vistaLogin.setVisible(false);
            vistaConfiguracion.iniciar();
            
        }
        if(ae.getSource().equals(vistaLogin.getIniciaSesion()))
        {
            vistaLogin.setVisible(false);
            mainFrame.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getVolverBtn()))
        {
            mainFrame.setVisible(false);
            vistaLogin.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getAerolíneas()))
        {
            mainFrame.setVisible(false);
            vistaRegAero.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getConfiguracion()))
        {
            mainFrame.setVisible(false);
            vistaConfiguracion.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getVuelos()))
        {
            mainFrame.setVisible(false);
            vistaVuelos.iniciar();
            
        }
        if(ae.getSource().equals(vistaVuelos.getVolverbtn()))
        {
            vistaVuelos.setVisible(false);
            mainFrame.iniciar();
            
        }
        if(ae.getSource().equals(vistaConfiguracion.getVolverBtn()))
        {
            vistaConfiguracion.setVisible(false);
            mainFrame.iniciar();
            
        }
        if(ae.getSource().equals(vistaRegAero.getVolverBtn()))
        {
            vistaRegAero.setVisible(false);
            mainFrame.iniciar();
            
        }
        if(ae.getSource().equals(vistaConfiguracion.getAceptarBttn()))
        {
            if(vistaConfiguracion.getContrasenna().getText().equals(vistaConfiguracion.getConfirmContrasenna().getText()))
            {
                String nombre = "";
                String contrasenna = "";
                String rol = "";
                nombre = vistaConfiguracion.getNombreUsuario().getText();
                contrasenna = vistaConfiguracion.getContrasenna().getText();
                if(vistaConfiguracion.getAdministradorCheck().isSelected())
                {
                    rol = vistaConfiguracion.getAdministradorCheck().getText();
                }
                else if(vistaConfiguracion.getPlataformaCheck().isSelected())
                {
                    rol = vistaConfiguracion.getPlataformaCheck().getText();
                }
                if(nombre.equals("") || contrasenna.equals("") || ((!vistaConfiguracion.getAdministradorCheck().isSelected() && !vistaConfiguracion.getPlataformaCheck().isSelected())) || ((vistaConfiguracion.getAdministradorCheck().isSelected() && vistaConfiguracion.getPlataformaCheck().isSelected())))
                {
                    JOptionPane.showMessageDialog(null, "Ingrese lo que se solicita y recuerde marcar solo un rol", "ERROR", JOptionPane.ERROR_MESSAGE);                    
                }
                else
                {
                    usuario = new Usuario(nombre, contrasenna, rol);
                    m.annadirUusario(usuario);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    vistaConfiguracion.getNombreUsuario().setText("");
                    vistaConfiguracion.getContrasenna().setText("");
                    vistaConfiguracion.getConfirmContrasenna().setText("");
                    vistaConfiguracion.getAdministradorCheck().setSelected(false);
                    vistaConfiguracion.getPlataformaCheck().setSelected(false); 
                }           
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseñas diferentes, intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                vistaConfiguracion.getContrasenna().setText("");
                vistaConfiguracion.getConfirmContrasenna().setText("");
            }
        }
    }
    
}
