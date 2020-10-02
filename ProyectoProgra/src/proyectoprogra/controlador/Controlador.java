/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.controlador;

import java.awt.Color;
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
import proyectoprogra.vista.VistaAgregarCliente;
import proyectoprogra.vista.VistaAvion;
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

    

    private VistaBuscarClientes vistaBuscarCliente;

    private VistaAvion vistaAvion;
    
    
  //  private VerPlataforma plataforma;



    private Vuelos vuelo;
    private VistaVerVuelos verVuelos;
    LocalDate date = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaCreacion = dtf.format(date);
    
    public Controlador(Modelo m, VistaLogin vistaLogin, VistaConfiguracion vistaConfiguracion, MainFrame mainFrame, VistaRegistraAerolinea vistaRegAero, VistaVuelos vistaVuelos, VistaAgregarCliente vistaAgregarClientes,VistaBuscarClientes vistaBuscarCliente, VistaVerVuelos verVuelos, VistaAvion vistaAvion){
        this.m = m;
        this.vistaLogin = vistaLogin;
        this.vistaConfiguracion = vistaConfiguracion;
        this.mainFrame = mainFrame;
        this.vistaRegAero = vistaRegAero;
        this.vistaVuelos = vistaVuelos;
        this.vistaAgregarClientes = vistaAgregarClientes;
        this.vistaBuscarCliente = vistaBuscarCliente;

        this.verVuelos = verVuelos;
        this.vistaAvion = vistaAvion;

        this.verVuelos = verVuelos;


        
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
        this.verVuelos.getVolverbtn().addActionListener(this);
  

        
        this.vistaAgregarClientes.getAgregarClienteBttn().addActionListener(this);
        this.vistaBuscarCliente.getVolverBCBttn().addActionListener(this);
        this.vistaAgregarClientes.getVolverRCBttn().addActionListener(this);
        this.vistaBuscarCliente.getBuscarBttn().addActionListener(this);
        this.vistaAgregarClientes.getMostrarVuelosComB().addActionListener(this);
        
        this.vistaConfiguracion.getVolverBtn().addActionListener(this);
        this.vistaConfiguracion.getAceptarBttn().addActionListener(this);
        
        this.vistaRegAero.getVolverBtn().addActionListener(this);
        this.vistaRegAero.getRegistrarBttn().addActionListener(this);

        this.verVuelos.getVolverbtn().addActionListener(this);
        this.verVuelos.getModificarbtn().addActionListener(this);

        reset();
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
        
        if(ae.getSource().equals(verVuelos.getVolverbtn())){
            verVuelos.setVisible(false);
            mainFrame.iniciar();
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

            if(m.getClientes().size() == 0){
                JOptionPane.showMessageDialog(null, "No se ha registrado ningun cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
                vistaBuscarCliente.getiDCliente().setText("");
                vistaBuscarCliente.setVisible(false);
                mainFrame.iniciar();
                
            }
            else{
                mainFrame.setVisible(false);
                vistaBuscarCliente.iniciar();
            }
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
            verVuelos.iniciar();
        
        }
        if(ae.getSource().equals(verVuelos.getVolverbtn())){
            verVuelos.setVisible(false);
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
                rowData[2] = m.getClientes().get(i).getVuelo();
                
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
            String vuelo = "";
       
            nombre = vistaAgregarClientes.getNombreTxt().getText();
            apellidos = vistaAgregarClientes.getApellidoTxt().getText();
            acompannantes = Integer.parseInt(vistaAgregarClientes.getAcompannantesTxt().getText());
            IDCliente = Integer.parseInt(vistaAgregarClientes.getIDClienteTxt().getText());
            vuelo = vistaAgregarClientes.getMostrarVuelosComB().getSelectedItem().toString();
            
            cliente1 = new Cliente (nombre,apellidos, IDCliente, acompannantes, vuelo);
            m.annadirCliente(cliente1);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            DefaultTableModel table = (DefaultTableModel) vistaAgregarClientes.getTableUsuarios().getModel();
            Object rowData[] = new Object[5];
            table.setNumRows(0);
            for(int i=0; i < m.getClientes().size(); i++){
                rowData[0] = m.getClientes().get(i).getNombre();
                rowData[1] = m.getClientes().get(i).getApellido();
                rowData[2] = m.getClientes().get(i).getID();
                rowData[3] = m.getClientes().get(i).getNumeroAcompannantes();
                rowData[4] = m.getClientes().get(i).getVuelo();
                table.addRow(rowData);
            }          
            vistaAgregarClientes.getNombreTxt().setText("");
            vistaAgregarClientes.getApellidoTxt().setText("");
            vistaAgregarClientes.getAcompannantesTxt().setText("");
            vistaAgregarClientes.getIDClienteTxt().setText("");
            //vistaAgregarClientes.getMostrarVuelosComB();
            vistaAgregarClientes.setVisible(false);
            vistaAvion.iniciar();
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
        if(ae.getSource().equals(mainFrame.getVerVuelosRegBttn())){
            mainFrame.setVisible(false);
            verVuelos.setVisible(true);
            
            DefaultTableModel table = (DefaultTableModel) verVuelos.getjTable1().getModel();
            Object rowData[] = new Object[6];
            table.setNumRows(0);
            for(int i=0; i < m.getVuelos().size(); i++){
                rowData[0] = m.getVuelos().get(i).getAerolinea();
                rowData[1] = m.getVuelos().get(i).getNumeroVuelo();
                rowData[2] = m.getVuelos().get(i).getSalida();
                rowData[3] = m.getVuelos().get(i).getHorarioSalida();
                rowData[4] = m.getVuelos().get(i).getDestino();
                rowData[5] = m.getVuelos().get(i).getHorarioLlegada();
                table.addRow(rowData);
            }
            if(ae.getSource().equals(verVuelos.getModificarbtn())){
                String aerolinea = "", numeroVuelo = "", salida = "", destino = "", horarioSalida = "", horarioLlegada = "";
                int duracionVuelo = 0, numeroAsientos = 0;
                table.setNumRows(0);
                
                for(int i=0; i < m.getClientes().size(); i++){
                    rowData[0] = m.getVuelos().get(i).getAerolinea();
                    rowData[1] = m.getVuelos().get(i).getNumeroVuelo();
                    rowData[2] = m.getVuelos().get(i).getSalida();
                    rowData[3] = m.getVuelos().get(i).getHorarioSalida();
                    rowData[4] = m.getVuelos().get(i).getDestino();
                    rowData[5] = m.getVuelos().get(i).getHorarioLlegada();
                    table.addRow(rowData);
                }
                int row = verVuelos.getjTable1().getSelectedRow();
                int col = verVuelos.getjTable1().getSelectedColumn();
                if(row >= 0){
                    duracionVuelo = m.getVuelos().get(row).getDuracionVuelo();
                    numeroAsientos = m.getVuelos().get(row).getNumeroAsientos();
                        
                    aerolinea = table.getValueAt(row, col).toString();
                    numeroVuelo = table.getValueAt(row, col).toString();
                    salida = table.getValueAt(row, col).toString();
                    horarioSalida = table.getValueAt(row, col).toString();
                    destino = table.getValueAt(row, col).toString();
                    horarioLlegada = table.getValueAt(row, col).toString();
                        
                    vuelo = new Vuelos(aerolinea, numeroVuelo, salida, destino, horarioSalida, horarioLlegada,fechaCreacion, duracionVuelo, numeroAsientos);
                    m.getVuelos().set(row, vuelo);
                    }
                }
            }
    }
    
    public void reset(){
        
        vistaAvion.getjButton1().setText("-");
        vistaAvion.getjButton1().setBackground(Color.green);
        
        vistaAvion.getjButton2().setText("-");
        vistaAvion.getjButton2().setBackground(Color.green);
        
        vistaAvion.getjButton3().setText("-");
        vistaAvion.getjButton3().setBackground(Color.green);
        
        vistaAvion.getjButton4().setText("-");
        vistaAvion.getjButton4().setBackground(Color.green);
        
        vistaAvion.getjButton5().setText("-");
        vistaAvion.getjButton5().setBackground(Color.green);
        
        vistaAvion.getjButton6().setText("-");
        vistaAvion.getjButton6().setBackground(Color.green);
        
        vistaAvion.getjButton7().setText("-");
        vistaAvion.getjButton7().setBackground(Color.green);
        
        vistaAvion.getjButton8().setText("-");
        vistaAvion.getjButton8().setBackground(Color.green);
        
        vistaAvion.getjButton9().setText("-");
        vistaAvion.getjButton9().setBackground(Color.green);
        
        vistaAvion.getjButton10().setText("-");
        vistaAvion.getjButton10().setBackground(Color.green);
        
        vistaAvion.getjButton11().setText("-");
        vistaAvion.getjButton11().setBackground(Color.green);
        
        vistaAvion.getjButton12().setText("-");
        vistaAvion.getjButton12().setBackground(Color.green);
        
        vistaAvion.getjButton13().setText("-");
        vistaAvion.getjButton13().setBackground(Color.green);
        
        vistaAvion.getjButton14().setText("-");
        vistaAvion.getjButton14().setBackground(Color.green);
        
        vistaAvion.getjButton15().setText("-");
        vistaAvion.getjButton15().setBackground(Color.green);
        
        vistaAvion.getjButton16().setText("-");
        vistaAvion.getjButton16().setBackground(Color.green);
        
        vistaAvion.getjButton17().setText("-");
        vistaAvion.getjButton17().setBackground(Color.green);
        
        vistaAvion.getjButton18().setText("-");
        vistaAvion.getjButton18().setBackground(Color.green);
        
        vistaAvion.getjButton19().setText("-");
        vistaAvion.getjButton19().setBackground(Color.green);
        
        vistaAvion.getjButton20().setText("-");
        vistaAvion.getjButton20().setBackground(Color.green);
        
        vistaAvion.getjButton21().setText("-");
        vistaAvion.getjButton21().setBackground(Color.green);
        
        vistaAvion.getjButton22().setText("-");
        vistaAvion.getjButton22().setBackground(Color.green);
        
        vistaAvion.getjButton23().setText("-");
        vistaAvion.getjButton23().setBackground(Color.green);
        
        vistaAvion.getjButton24().setText("-");
        vistaAvion.getjButton24().setBackground(Color.green);
        
        vistaAvion.getjButton25().setText("-");
        vistaAvion.getjButton25().setBackground(Color.green);
        
        vistaAvion.getjButton26().setText("-");
        vistaAvion.getjButton26().setBackground(Color.green);
        
        vistaAvion.getjButton27().setText("-");
        vistaAvion.getjButton27().setBackground(Color.green);
        
        vistaAvion.getjButton28().setText("-");
        vistaAvion.getjButton28().setBackground(Color.green);
        
        vistaAvion.getjButton29().setText("-");
        vistaAvion.getjButton29().setBackground(Color.green);
        
        vistaAvion.getjButton30().setText("-");
        vistaAvion.getjButton30().setBackground(Color.green);
        
        vistaAvion.getjButton31().setText("-");
        vistaAvion.getjButton31().setBackground(Color.green);
        
        vistaAvion.getjButton32().setText("-");
        vistaAvion.getjButton32().setBackground(Color.green);
        
        vistaAvion.getjButton33().setText("-");
        vistaAvion.getjButton33().setBackground(Color.green);
        
        vistaAvion.getjButton34().setText("-");
        vistaAvion.getjButton34().setBackground(Color.green);
        
        vistaAvion.getjButton35().setText("-");
        vistaAvion.getjButton35().setBackground(Color.green);
        
        vistaAvion.getjButton36().setText("-");
        vistaAvion.getjButton36().setBackground(Color.green);
        
        vistaAvion.getjButton37().setText("-");
        vistaAvion.getjButton37().setBackground(Color.green);
        
        vistaAvion.getjButton38().setText("-");
        vistaAvion.getjButton38().setBackground(Color.green);
        
        vistaAvion.getjButton39().setText("-");
        vistaAvion.getjButton39().setBackground(Color.green);
        
        vistaAvion.getjButton40().setText("-");
        vistaAvion.getjButton40().setBackground(Color.green);
        
        vistaAvion.getjButton41().setText("-");
        vistaAvion.getjButton41().setBackground(Color.green);
        
        vistaAvion.getjButton42().setText("-");
        vistaAvion.getjButton42().setBackground(Color.green);
        
        vistaAvion.getjButton43().setText("-");
        vistaAvion.getjButton43().setBackground(Color.green);
        
        vistaAvion.getjButton44().setText("-");
        vistaAvion.getjButton44().setBackground(Color.green);
        
        vistaAvion.getjButton45().setText("-");
        vistaAvion.getjButton45().setBackground(Color.green);
        
        vistaAvion.getjButton46().setText("-");
        vistaAvion.getjButton46().setBackground(Color.green);
        
        vistaAvion.getjButton47().setText("-");
        vistaAvion.getjButton47().setBackground(Color.green);
        
        vistaAvion.getjButton48().setText("-");
        vistaAvion.getjButton48().setBackground(Color.green);
    }
}

