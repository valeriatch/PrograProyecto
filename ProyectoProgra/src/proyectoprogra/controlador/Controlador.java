/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoprogra.modelo.Aerolinea;
import proyectoprogra.modelo.Modelo;
import proyectoprogra.modelo.Usuario;
import proyectoprogra.modelo.Cliente;
import proyectoprogra.modelo.Vuelos;
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
    private VistaAgregarCliente vistaAgregarClientes;
    private Cliente cliente1;
    private Aerolinea aerolinea;

    private VistaVerVuelos vistaVerVuelo;

    private VistaBuscarClientes vistaBuscarCliente;
    
    
  //  private VerPlataforma plataforma;



    private Vuelos vuelo;
    private VistaVerVuelos verVuelos;
    LocalDate date = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaCreacion = dtf.format(date);
    

    public Controlador(Modelo m, VistaLogin vistaLogin, VistaConfiguracion vistaConfiguracion, MainFrame mainFrame, VistaRegistraAerolinea vistaRegAero, VistaVuelos vistaVuelos, VistaAgregarCliente vistaAgregarClientes,VistaBuscarClientes vistaBuscarCliente ,VistaVerVuelos vistaVerVuelo){



        this.m = m;
        this.vistaLogin = vistaLogin;
        this.vistaConfiguracion = vistaConfiguracion;
        this.mainFrame = mainFrame;
        this.vistaRegAero = vistaRegAero;
        this.vistaVuelos = vistaVuelos;
        this.vistaAgregarClientes = vistaAgregarClientes;
        this.vistaBuscarCliente = vistaBuscarCliente;
        this.vistaVerVuelo = vistaVerVuelo;

        //this.plataforma = plataforma;


        
        this.vistaLogin.getIniciaSesion().addActionListener(this);
        
        this.mainFrame.getAerolíneas().addActionListener(this);
        this.mainFrame.getConfiguracion().addActionListener(this);
        this.mainFrame.getVuelos().addActionListener(this);
        this.mainFrame.getVolverBtn().addActionListener(this);
        this.mainFrame.getAgregarClienteBttn().addActionListener(this);
        this.mainFrame.getBuscarCliente().addActionListener(this);
        this.mainFrame.getSalirBttn().addActionListener(this);
        this.mainFrame.getVerVuelosRegBttn().addActionListener(this);
   
        
        
        this.vistaVuelos.getVolverbtn().addActionListener(this);
        this.vistaVuelos.getRegistrarbtn().addActionListener(this);
        this.vistaVerVuelo.getVolverbtn().addActionListener(this);
        

        
        this.vistaAgregarClientes.getAgregarClienteBttn().addActionListener(this);
        this.vistaBuscarCliente.getVolverBCBttn().addActionListener(this);
        this.vistaAgregarClientes.getVolverRCBttn().addActionListener(this);
        this.vistaBuscarCliente.getBuscarBttn().addActionListener(this);
        this.vistaAgregarClientes.getMostrarVuelosComB().addActionListener(this);
        
        this.vistaConfiguracion.getVolverBtn().addActionListener(this);
        this.vistaConfiguracion.getAceptarBttn().addActionListener(this);
        
        this.vistaRegAero.getVolverBtn().addActionListener(this);
        this.vistaRegAero.getRegistrarBttn().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(vistaLogin.getIniciaSesion()))
        {
            String entradaUsuario = vistaLogin.getUsuarioEntrada().getText();
            if(m.verificaUsuario(vistaLogin.getUsuarioEntrada().getText(), vistaLogin.getContrasennaEntrada().getText()))
            {
                vistaLogin.setVisible(false);
                vistaLogin.getUsuarioEntrada().setText("");
                vistaLogin.getContrasennaEntrada().setText("");
                if(m.bloquearBotones(entradaUsuario))
                {
                    mainFrame.iniciar();
            
                }
                else
                {
                    mainFrame.iniciar();
                    mainFrame.getConfiguracion().setEnabled(false);
                    mainFrame.getAerolíneas().setEnabled(false);
                    mainFrame.getVuelos().setEnabled(false);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                vistaLogin.getUsuarioEntrada().setText("");
                vistaLogin.getContrasennaEntrada().setText("");
            }
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
            vistaRegAero.getFechaTxt().setText(fechaCreacion);
        }
        

        if(ae.getSource().equals(mainFrame.getConfiguracion()))
        {
            mainFrame.setVisible(false);
            vistaConfiguracion.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getVuelos()))
        {
            mainFrame.setVisible(false);
            vistaVuelos.getComboBoxAero().removeAllItems();
            ArrayList<Aerolinea> aero = m.getAerolineas();
            for(int i = 0; i < aero.size(); i++) {
                vistaVuelos.getComboBoxAero().addItem(aero.get(i).getNombre());
            }
            vistaVuelos.iniciar();
            vistaVuelos.getCreaciontxf().setText(fechaCreacion);
        }
        if(ae.getSource().equals(mainFrame.getAgregarClienteBttn()))
        {
            mainFrame.setVisible(false);
            vistaAgregarClientes.getMostrarVuelosComB().removeAllItems();
            ArrayList<Vuelos> vuel = m.getVuelos();
             for(int i = 0; i < vuel.size(); i++) {
                 vistaAgregarClientes.getMostrarVuelosComB().addItem(vuel.get(i).getDestino());
             }
             vistaAgregarClientes.iniciar();
            
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
        if(ae.getSource().equals(mainFrame.getBuscarCliente()))
        {
            mainFrame.setVisible(false);
            vistaBuscarCliente.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getSalirBttn()))
        {
            mainFrame.setVisible(false);
            if(JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir del sistema? ","Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             System.exit(0);                
            }
            else {
                 mainFrame.iniciar();
            }
                    
        }
        
        //
        if(ae.getSource().equals(vistaBuscarCliente.getVolverBCBttn()))
        {
            vistaBuscarCliente.setVisible(false);
            mainFrame.iniciar();
            
        }
        
        if(ae.getSource().equals(vistaAgregarClientes.getVolverRCBttn()))
        {
            vistaAgregarClientes.setVisible(false);
            mainFrame.iniciar();
            
        }
        if(ae.getSource().equals(mainFrame.getVerVuelosRegBttn()))
        {
            mainFrame.setVisible(false);
            vistaVerVuelo.iniciar();
        
        }
        if(ae.getSource().equals(vistaVerVuelo.getVolverbtn())){
            vistaVerVuelo.setVisible(false);
            mainFrame.iniciar();
        }
        
        if(ae.getSource().equals(mainFrame.getAgregarClienteBttn()))
        {
            mainFrame.setVisible(false);
            vistaAgregarClientes.iniciar();
            
        }
        if(ae.getSource().equals(vistaBuscarCliente.getBuscarBttn()))
        {
            int IDCliente = 0;
            IDCliente = Integer.parseInt(vistaBuscarCliente.getiDCliente().getText());
            System.out.println(m.buscarCliente(IDCliente));
            
            DefaultTableModel table = (DefaultTableModel) vistaBuscarCliente.getTablaClientesReg().getModel();
            Object rowData[] = new Object[3];
            table.setNumRows(0);
            for(int i=0; i < m.getClientes().size(); i++){
                Cliente cl = m.getClientes().get(i);
                if(cl.getID() == IDCliente){
                rowData[0] = m.getClientes().get(i).getNombre();
                rowData[1] = m.getClientes().get(i).getID();
               // rowData[2] = m.getClientes().get(i).getNumeroAcompannantes();
                table.addRow(rowData);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cliente no registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                    vistaBuscarCliente.getiDCliente().setText("");
                    
                } 
                
            }
                      
        }
        if (ae.getSource().equals(vistaAgregarClientes.getAgregarClienteBttn()))
        {
            String nombre = "";
            String apellidos = "";
            int acompannantes = 0;
            int IDCliente = 0;
       
            nombre = vistaAgregarClientes.getNombreTxt().getText();
            apellidos = vistaAgregarClientes.getApellidoTxt().getText();
            acompannantes = Integer.parseInt(vistaAgregarClientes.getAcompannantesTxt().getText());
            IDCliente = Integer.parseInt(vistaAgregarClientes.getIDClienteTxt().getText());
            
            cliente1 = new Cliente (nombre,apellidos, IDCliente, acompannantes);
            m.annadirCliente(cliente1);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            DefaultTableModel table = (DefaultTableModel) vistaAgregarClientes.getTableUsuarios().getModel();
            Object rowData[] = new Object[4];
            table.setNumRows(0);
            for(int i=0; i < m.getClientes().size(); i++){
                rowData[0] = m.getClientes().get(i).getNombre();
                rowData[1] = m.getClientes().get(i).getApellido();
                rowData[2] = m.getClientes().get(i).getID();
                rowData[3] = m.getClientes().get(i).getNumeroAcompannantes();
                table.addRow(rowData);
            }
                        
            vistaAgregarClientes.getNombreTxt().setText("");
            vistaAgregarClientes.getApellidoTxt().setText("");
            vistaAgregarClientes.getAcompannantesTxt().setText("");
            vistaAgregarClientes.getIDClienteTxt().setText("");
            
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
                if(nombre.equals("") || contrasenna.equals("") || rol == "")
                {
                    JOptionPane.showMessageDialog(null, "Ingrese lo que se solicita y recuerde marcar solo un rol", "ERROR", JOptionPane.ERROR_MESSAGE);                    
                }
                else
                {
                    usuario = new Usuario(rol, nombre, contrasenna);
                    m.annadirUusario(usuario);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    //System.out.println(m.toString());
                    vistaConfiguracion.getNombreUsuario().setText("");
                    vistaConfiguracion.getContrasenna().setText("");
                    vistaConfiguracion.getConfirmContrasenna().setText("");
                    vistaConfiguracion.getCheckbox().clearSelection();
                }           
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Contraseñas diferentes, intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                vistaConfiguracion.getContrasenna().setText("");
                vistaConfiguracion.getConfirmContrasenna().setText("");
            }
        }
        if(ae.getSource().equals(vistaRegAero.getRegistrarBttn())){
            System.out.println(dtf.format(date));
            String nombre = "";
            
            vistaRegAero.getFechaTxt().setText(fechaCreacion);
           // fecha = vistaRegAero.getFechaTxt().getText();
            nombre = vistaRegAero.getNombreAerolinea().getText();
            if(nombre.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Ingrese lo que se solicita", "ERROR", JOptionPane.ERROR_MESSAGE);                    
            }
            else{
                aerolinea = new Aerolinea(fechaCreacion, nombre);
                m.annadirAerolinea(aerolinea);
                System.out.println(m.toStringAerolineas());
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                
                vistaRegAero.getNombreAerolinea().setText("");
            }
        }
        if(ae.getSource().equals(vistaVuelos.getRegistrarbtn()))
        {
            String aerolinea = "", numeroVuelo = "", salida = "", destino = "", horarioSalida = "", horarioLlegada = "";
            int duracionVuelo = 0, numeroAsientos = 0;
            
            aerolinea = vistaVuelos.getComboBoxAero().getSelectedItem().toString();
            numeroVuelo = vistaVuelos.getnVuelotxf().getText();
            salida = vistaVuelos.getPartidatxf().getText();
            destino = vistaVuelos.getDestinotxf().getText();
            horarioSalida = vistaVuelos.getHorasalidatxf().getText();
            horarioLlegada = vistaVuelos.getHorallegadatxf().getText();
            duracionVuelo = Integer.parseInt(vistaVuelos.getDuracionVuelotxf().getText());
            numeroAsientos = 48;
            
            vuelo = new Vuelos(aerolinea, numeroVuelo, salida, destino, horarioSalida, horarioLlegada,fechaCreacion, duracionVuelo, numeroAsientos);
            m.annadirVuelos(vuelo);
            System.out.println(m.toStringVuelos());
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            vistaVuelos.getnVuelotxf().setText("");
            vistaVuelos.getPartidatxf().setText("");
            vistaVuelos.getDestinotxf().setText("");
            vistaVuelos.getHorasalidatxf().setText("");
            vistaVuelos.getHorallegadatxf().setText("");
            vistaVuelos.getDuracionVuelotxf().setText("");
            
        }
        
        
    }
}

 