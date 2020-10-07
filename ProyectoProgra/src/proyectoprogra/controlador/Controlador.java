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
import javax.swing.JButton;
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
    
    String idVuelo = "";
    int cantAcompanantes = 0;
    int cant = 0;
    private ArrayList <JButton> listaBotones = new ArrayList<>();
    
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
        
        this.vistaAvion.getjButton1().addActionListener(this);
        this.vistaAvion.getjButton2().addActionListener(this);
        this.vistaAvion.getjButton3().addActionListener(this);
        this.vistaAvion.getjButton4().addActionListener(this);
        this.vistaAvion.getjButton5().addActionListener(this);
        this.vistaAvion.getjButton6().addActionListener(this);
        this.vistaAvion.getjButton7().addActionListener(this);
        this.vistaAvion.getjButton8().addActionListener(this);
        this.vistaAvion.getjButton9().addActionListener(this);
        this.vistaAvion.getjButton10().addActionListener(this);
        this.vistaAvion.getjButton11().addActionListener(this);
        this.vistaAvion.getjButton12().addActionListener(this);
        this.vistaAvion.getjButton13().addActionListener(this);
        this.vistaAvion.getjButton14().addActionListener(this);
        this.vistaAvion.getjButton15().addActionListener(this);
        this.vistaAvion.getjButton16().addActionListener(this);
        this.vistaAvion.getjButton17().addActionListener(this);
        this.vistaAvion.getjButton18().addActionListener(this);
        this.vistaAvion.getjButton19().addActionListener(this);
        this.vistaAvion.getjButton20().addActionListener(this);
        this.vistaAvion.getjButton21().addActionListener(this);
        this.vistaAvion.getjButton22().addActionListener(this);
        this.vistaAvion.getjButton23().addActionListener(this);
        this.vistaAvion.getjButton24().addActionListener(this);
        this.vistaAvion.getjButton25().addActionListener(this);
        this.vistaAvion.getjButton26().addActionListener(this);
        this.vistaAvion.getjButton27().addActionListener(this);
        this.vistaAvion.getjButton28().addActionListener(this);
        this.vistaAvion.getjButton29().addActionListener(this);
        this.vistaAvion.getjButton30().addActionListener(this);
        this.vistaAvion.getjButton31().addActionListener(this);
        this.vistaAvion.getjButton32().addActionListener(this);
        this.vistaAvion.getjButton33().addActionListener(this);
        this.vistaAvion.getjButton34().addActionListener(this);
        this.vistaAvion.getjButton35().addActionListener(this);
        this.vistaAvion.getjButton36().addActionListener(this);
        this.vistaAvion.getjButton37().addActionListener(this);
        this.vistaAvion.getjButton38().addActionListener(this);
        this.vistaAvion.getjButton39().addActionListener(this);
        this.vistaAvion.getjButton40().addActionListener(this);
        this.vistaAvion.getjButton41().addActionListener(this);
        this.vistaAvion.getjButton42().addActionListener(this);
        this.vistaAvion.getjButton43().addActionListener(this);
        this.vistaAvion.getjButton44().addActionListener(this);
        this.vistaAvion.getjButton45().addActionListener(this);
        this.vistaAvion.getjButton46().addActionListener(this);
        this.vistaAvion.getjButton47().addActionListener(this);
        this.vistaAvion.getjButton48().addActionListener(this);
        this.vistaAvion.getComprarAsientosBtn().addActionListener(this);
      //  this.vistaAvion.getVolverBtn().addActionListener(this);
        
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
                 vistaAgregarClientes.getMostrarVuelosComB().addItem(vuel.get(i).getNumeroVuelo());
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
                else if(m.getClientes().size() == 0 ){
                    JOptionPane.showMessageDialog(null, "No se ha registrado ningun cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    vistaBuscarCliente.getiDCliente().setText("");
                }
                
                else if(cl.getID() != IDCliente){
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
            idVuelo = vistaAgregarClientes.getMostrarVuelosComB().getSelectedItem().toString(); //el parametro id del vuelo para apartar campos
            cantAcompanantes = acompannantes; // variable para comparar con la cantidad de botones de asientos elegidos
            cliente1 = new Cliente (nombre,apellidos, IDCliente, acompannantes, vuelo);
            m.annadirCliente(cliente1);
            //JOptionPane.showMessageDialog(null, "Registro exitoso");
            
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
            reset();
            //vistaAvion.getComprarAsientosBtn().setEnabled(false);
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
        if(ae.getSource().equals(vistaAvion.getjButton1()) && vistaAvion.getjButton1().getText() == "-")
        {
            vistaAvion.getjButton1().setBackground(Color.gray);
            vistaAvion.getjButton1().setText("x");
            m.apartarCampos(idVuelo, 0, 0);
            listaBotones.add(vistaAvion.getjButton1());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton1()) && vistaAvion.getjButton1().getText() == "x"){
            vistaAvion.getjButton1().setBackground(Color.green);
            vistaAvion.getjButton1().setText("-");
            m.quitarCampos(idVuelo, 0, 0);
            listaBotones.remove(vistaAvion.getjButton1());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton2()) && vistaAvion.getjButton2().getText() == "-")
        {
            vistaAvion.getjButton2().setBackground(Color.gray);
            vistaAvion.getjButton2().setText("x");
            m.apartarCampos(idVuelo, 1, 0);
            listaBotones.add(vistaAvion.getjButton2());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton2()) && vistaAvion.getjButton2().getText() == "x"){
            vistaAvion.getjButton2().setBackground(Color.green);
            vistaAvion.getjButton2().setText("-");
            m.quitarCampos(idVuelo, 1, 0);
            listaBotones.remove(vistaAvion.getjButton2());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton3()) && vistaAvion.getjButton3().getText() == "-")
        {
            vistaAvion.getjButton3().setBackground(Color.gray); 
            vistaAvion.getjButton3().setText("x");
            m.apartarCampos(idVuelo, 2, 0);
            listaBotones.add(vistaAvion.getjButton3());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton3()) && vistaAvion.getjButton3().getText() == "x"){
            vistaAvion.getjButton3().setBackground(Color.green);
            vistaAvion.getjButton3().setText("-");
            m.quitarCampos(idVuelo, 2, 0);
            listaBotones.remove(vistaAvion.getjButton3());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton4()) && vistaAvion.getjButton4().getText() == "-")
        {
            vistaAvion.getjButton4().setBackground(Color.gray);
            vistaAvion.getjButton4().setText("x");
            m.apartarCampos(idVuelo, 3, 0);
            listaBotones.add(vistaAvion.getjButton4());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton4()) && vistaAvion.getjButton4().getText() == "x"){
            vistaAvion.getjButton4().setBackground(Color.green);
            vistaAvion.getjButton4().setText("-");
            m.quitarCampos(idVuelo, 3, 0);
            listaBotones.remove(vistaAvion.getjButton4());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton5()) && vistaAvion.getjButton5().getText() == "-")
        {
            vistaAvion.getjButton5().setBackground(Color.gray); 
            vistaAvion.getjButton5().setText("x");
            m.apartarCampos(idVuelo, 4, 0);
            listaBotones.add(vistaAvion.getjButton5());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton5()) && vistaAvion.getjButton5().getText() == "x"){
            vistaAvion.getjButton5().setBackground(Color.green);
            vistaAvion.getjButton5().setText("-");
            m.quitarCampos(idVuelo, 4, 0);
            listaBotones.remove(vistaAvion.getjButton5());
            cant--;
        }
      ///******Actualizar aca para abajo***********************************************************************************************
        if(ae.getSource().equals(vistaAvion.getjButton6()) && vistaAvion.getjButton6().getText() == "-")
        {
            vistaAvion.getjButton6().setBackground(Color.gray); 
            vistaAvion.getjButton6().setText("x");
            m.apartarCampos(idVuelo, 5, 0);
            listaBotones.add(vistaAvion.getjButton6());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton6()) && vistaAvion.getjButton6().getText() == "x"){
            vistaAvion.getjButton6().setBackground(Color.green);
            vistaAvion.getjButton6().setText("-");
            m.quitarCampos(idVuelo, 5, 0);
            listaBotones.remove(vistaAvion.getjButton6());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton7()) && vistaAvion.getjButton7().getText() == "-")
        {
            vistaAvion.getjButton7().setBackground(Color.gray);   
            vistaAvion.getjButton7().setText("x");
            m.apartarCampos(idVuelo, 0, 1);
            listaBotones.add(vistaAvion.getjButton7());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton7()) && vistaAvion.getjButton7().getText() == "x"){
            vistaAvion.getjButton7().setBackground(Color.green);
            vistaAvion.getjButton7().setText("-");
            m.quitarCampos(idVuelo, 0, 1);
            listaBotones.remove(vistaAvion.getjButton7());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton8()) && vistaAvion.getjButton8().getText() == "-")
        {
            vistaAvion.getjButton8().setBackground(Color.gray); 
            vistaAvion.getjButton8().setText("x");
            m.apartarCampos(idVuelo, 1, 1);
            listaBotones.add(vistaAvion.getjButton8());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton8()) && vistaAvion.getjButton8().getText() == "x"){
            vistaAvion.getjButton8().setBackground(Color.green);
            vistaAvion.getjButton8().setText("-");
            m.quitarCampos(idVuelo, 1, 1);
            listaBotones.remove(vistaAvion.getjButton8());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton9()) && vistaAvion.getjButton9().getText() == "-")
        {
            vistaAvion.getjButton9().setBackground(Color.gray); 
            vistaAvion.getjButton9().setText("x");
            m.apartarCampos(idVuelo, 2, 1);
            listaBotones.add(vistaAvion.getjButton9());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton9()) && vistaAvion.getjButton9().getText() == "x"){
            vistaAvion.getjButton9().setBackground(Color.green);
            vistaAvion.getjButton9().setText("-");
            m.quitarCampos(idVuelo, 2, 1);
            listaBotones.remove(vistaAvion.getjButton9());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton10()) && vistaAvion.getjButton10().getText() == "-")
        {
            vistaAvion.getjButton10().setBackground(Color.gray); 
            vistaAvion.getjButton10().setText("x");
            m.apartarCampos(idVuelo, 3, 1);
            listaBotones.add(vistaAvion.getjButton10());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton10()) && vistaAvion.getjButton10().getText() == "x"){
            vistaAvion.getjButton10().setBackground(Color.green);
            vistaAvion.getjButton10().setText("-");
            m.quitarCampos(idVuelo, 3, 1);
            listaBotones.remove(vistaAvion.getjButton10());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton11()) && vistaAvion.getjButton11().getText() == "-")
        {
            vistaAvion.getjButton11().setBackground(Color.gray);  
            vistaAvion.getjButton11().setText("x");
            m.apartarCampos(idVuelo, 4, 1);
            listaBotones.add(vistaAvion.getjButton11());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton11()) && vistaAvion.getjButton11().getText() == "x"){
            vistaAvion.getjButton11().setBackground(Color.green);
            vistaAvion.getjButton11().setText("-");
            m.quitarCampos(idVuelo, 4, 1);
            listaBotones.remove(vistaAvion.getjButton11());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton12()) && vistaAvion.getjButton12().getText() == "-")
        {
            vistaAvion.getjButton12().setBackground(Color.gray);  
            vistaAvion.getjButton12().setText("x");
            m.apartarCampos(idVuelo, 5, 1);
            listaBotones.add(vistaAvion.getjButton12());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton12()) && vistaAvion.getjButton12().getText() == "x"){
            vistaAvion.getjButton12().setBackground(Color.green);
            vistaAvion.getjButton12().setText("-");
            m.quitarCampos(idVuelo, 5, 1);
            listaBotones.remove(vistaAvion.getjButton12());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton13()) && vistaAvion.getjButton13().getText() == "-")
        {
            vistaAvion.getjButton13().setBackground(Color.gray);   
            vistaAvion.getjButton13().setText("x");
            m.apartarCampos(idVuelo, 0, 2);
            listaBotones.add(vistaAvion.getjButton13());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton13()) && vistaAvion.getjButton13().getText() == "x"){
            vistaAvion.getjButton13().setBackground(Color.green);
            vistaAvion.getjButton13().setText("-");
            m.quitarCampos(idVuelo, 0, 2);
            listaBotones.remove(vistaAvion.getjButton13());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton14()) && vistaAvion.getjButton14().getText() == "-")
        {
            vistaAvion.getjButton14().setBackground(Color.gray);   
            vistaAvion.getjButton14().setText("x");
            m.apartarCampos(idVuelo, 1, 2);
            listaBotones.add(vistaAvion.getjButton14());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton14()) && vistaAvion.getjButton14().getText() == "x"){
            vistaAvion.getjButton14().setBackground(Color.green);
            vistaAvion.getjButton14().setText("-");
            m.quitarCampos(idVuelo, 1, 2);
            listaBotones.remove(vistaAvion.getjButton14());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton15()) && vistaAvion.getjButton15().getText() == "-")
        {
            vistaAvion.getjButton15().setBackground(Color.gray);  
            vistaAvion.getjButton15().setText("x");
            m.apartarCampos(idVuelo, 2, 2);
            listaBotones.add(vistaAvion.getjButton15());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton15()) && vistaAvion.getjButton15().getText() == "x"){
            vistaAvion.getjButton15().setBackground(Color.green);
            vistaAvion.getjButton15().setText("-");
            m.quitarCampos(idVuelo, 2, 2);
            listaBotones.remove(vistaAvion.getjButton15());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton16()) && vistaAvion.getjButton16().getText() == "-")
        {
            vistaAvion.getjButton16().setBackground(Color.gray);   
            vistaAvion.getjButton16().setText("x");
            m.apartarCampos(idVuelo, 3, 2);
            listaBotones.add(vistaAvion.getjButton16());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton16()) && vistaAvion.getjButton16().getText() == "x"){
            vistaAvion.getjButton16().setBackground(Color.green);
            vistaAvion.getjButton16().setText("-");
            m.quitarCampos(idVuelo, 3, 2);
            listaBotones.remove(vistaAvion.getjButton16());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton17()) && vistaAvion.getjButton17().getText() == "-")
        {
            vistaAvion.getjButton17().setBackground(Color.gray);   
            vistaAvion.getjButton17().setText("x");
            m.apartarCampos(idVuelo, 4, 2);
            listaBotones.add(vistaAvion.getjButton17());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton17()) && vistaAvion.getjButton17().getText() == "x"){
            vistaAvion.getjButton17().setBackground(Color.green);
            vistaAvion.getjButton17().setText("-");
            m.quitarCampos(idVuelo, 4, 2);
            listaBotones.remove(vistaAvion.getjButton17());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton18()) && vistaAvion.getjButton18().getText() == "-")
        {
            vistaAvion.getjButton18().setBackground(Color.gray);   
            vistaAvion.getjButton18().setText("x");
            m.apartarCampos(idVuelo, 5, 2);
            listaBotones.add(vistaAvion.getjButton18());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton18()) && vistaAvion.getjButton18().getText() == "x"){
            vistaAvion.getjButton18().setBackground(Color.green);
            vistaAvion.getjButton18().setText("-");
            m.quitarCampos(idVuelo, 5, 2);
            listaBotones.remove(vistaAvion.getjButton18());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton19()) && vistaAvion.getjButton19().getText() == "-")
        {
            vistaAvion.getjButton19().setBackground(Color.gray);   
            vistaAvion.getjButton19().setText("x");
            m.apartarCampos(idVuelo, 0, 3);
            listaBotones.add(vistaAvion.getjButton19());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton19()) && vistaAvion.getjButton19().getText() == "x"){
            vistaAvion.getjButton19().setBackground(Color.green);
            vistaAvion.getjButton19().setText("-");
            m.quitarCampos(idVuelo, 0, 3);
            listaBotones.remove(vistaAvion.getjButton19());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton20()) && vistaAvion.getjButton20().getText() == "-")
        {
            vistaAvion.getjButton20().setBackground(Color.gray);   
            vistaAvion.getjButton20().setText("x");
            m.apartarCampos(idVuelo, 1, 3);
            listaBotones.add(vistaAvion.getjButton20());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton20()) && vistaAvion.getjButton20().getText() == "x"){
            vistaAvion.getjButton20().setBackground(Color.green);
            vistaAvion.getjButton20().setText("-");
            m.quitarCampos(idVuelo, 1, 3);
            listaBotones.remove(vistaAvion.getjButton20());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton21()) && vistaAvion.getjButton21().getText() == "-")
        {
            vistaAvion.getjButton21().setBackground(Color.gray);   
            vistaAvion.getjButton21().setText("x");
            m.apartarCampos(idVuelo, 2, 3);
            listaBotones.add(vistaAvion.getjButton21());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton21()) && vistaAvion.getjButton21().getText() == "x"){
            vistaAvion.getjButton21().setBackground(Color.green);
            vistaAvion.getjButton21().setText("-");
            m.quitarCampos(idVuelo, 2, 3);
            listaBotones.remove(vistaAvion.getjButton21());
            cant--;
        }
       
        if(ae.getSource().equals(vistaAvion.getjButton22()) && vistaAvion.getjButton22().getText() == "-")
        {
            vistaAvion.getjButton22().setBackground(Color.gray);   
            vistaAvion.getjButton22().setText("x");
            m.apartarCampos(idVuelo, 3, 3);
            listaBotones.add(vistaAvion.getjButton22());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton22()) && vistaAvion.getjButton22().getText() == "x"){
            vistaAvion.getjButton22().setBackground(Color.green);
            vistaAvion.getjButton22().setText("-");
            m.quitarCampos(idVuelo, 3, 3);
            listaBotones.remove(vistaAvion.getjButton22());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton23()) && vistaAvion.getjButton23().getText() == "-")
        {
            vistaAvion.getjButton23().setBackground(Color.gray);   
            vistaAvion.getjButton23().setText("x");
            m.apartarCampos(idVuelo, 4, 3);
            listaBotones.add(vistaAvion.getjButton23());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton23()) && vistaAvion.getjButton23().getText() == "x"){
            vistaAvion.getjButton23().setBackground(Color.green);
            vistaAvion.getjButton23().setText("-");
            m.quitarCampos(idVuelo, 4, 3);
            listaBotones.remove(vistaAvion.getjButton23());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton24()) && vistaAvion.getjButton24().getText() == "-")
        {
            vistaAvion.getjButton24().setBackground(Color.gray);   
            vistaAvion.getjButton24().setText("x");
            m.apartarCampos(idVuelo, 5, 3);
            listaBotones.add(vistaAvion.getjButton24());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton24()) && vistaAvion.getjButton24().getText() == "x"){
            vistaAvion.getjButton24().setBackground(Color.green);
            vistaAvion.getjButton24().setText("-");
            m.quitarCampos(idVuelo, 5, 3);
            listaBotones.remove(vistaAvion.getjButton24());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton25()) && vistaAvion.getjButton25().getText() == "-")
        {
            vistaAvion.getjButton25().setBackground(Color.gray);   
            vistaAvion.getjButton25().setText("x");
            m.apartarCampos(idVuelo, 0, 4);
            listaBotones.add(vistaAvion.getjButton25());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton25()) && vistaAvion.getjButton25().getText() == "x"){
            vistaAvion.getjButton25().setBackground(Color.green);
            vistaAvion.getjButton25().setText("-");
            m.quitarCampos(idVuelo, 0, 4);
            listaBotones.remove(vistaAvion.getjButton25());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton26()) && vistaAvion.getjButton26().getText() == "-")
        {
            vistaAvion.getjButton26().setBackground(Color.gray);   
            vistaAvion.getjButton26().setText("x");
            m.apartarCampos(idVuelo, 1, 4);
            listaBotones.add(vistaAvion.getjButton26());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton26()) && vistaAvion.getjButton26().getText() == "x"){
            vistaAvion.getjButton26().setBackground(Color.green);
            vistaAvion.getjButton26().setText("-");
            m.quitarCampos(idVuelo, 1, 4);
            listaBotones.remove(vistaAvion.getjButton26());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton27()) && vistaAvion.getjButton27().getText() == "-")
        {
            vistaAvion.getjButton27().setBackground(Color.gray);   
            vistaAvion.getjButton27().setText("x");
            m.apartarCampos(idVuelo, 2, 4);
            listaBotones.add(vistaAvion.getjButton27());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton27()) && vistaAvion.getjButton27().getText() == "x"){
            vistaAvion.getjButton27().setBackground(Color.green);
            vistaAvion.getjButton27().setText("-");
            m.quitarCampos(idVuelo, 2, 4);
            listaBotones.remove(vistaAvion.getjButton27());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton28()) && vistaAvion.getjButton28().getText() == "-")
        {
            vistaAvion.getjButton28().setBackground(Color.gray);   
            vistaAvion.getjButton28().setText("x");
            m.apartarCampos(idVuelo, 3, 4);
            listaBotones.add(vistaAvion.getjButton28());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton28()) && vistaAvion.getjButton28().getText() == "x"){
            vistaAvion.getjButton28().setBackground(Color.green);
            vistaAvion.getjButton28().setText("-");
            m.quitarCampos(idVuelo, 3, 4);
            listaBotones.remove(vistaAvion.getjButton28());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton29()) && vistaAvion.getjButton29().getText() == "-")
        {
            vistaAvion.getjButton29().setBackground(Color.gray);   
            vistaAvion.getjButton29().setText("x");
            m.apartarCampos(idVuelo, 4, 4);
            listaBotones.add(vistaAvion.getjButton29());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton29()) && vistaAvion.getjButton29().getText() == "x"){
            vistaAvion.getjButton29().setBackground(Color.green);
            vistaAvion.getjButton29().setText("-");
            m.quitarCampos(idVuelo, 4, 4);
            listaBotones.remove(vistaAvion.getjButton29());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton30()) && vistaAvion.getjButton30().getText() == "-")
        {
            vistaAvion.getjButton30().setBackground(Color.gray);   
            vistaAvion.getjButton30().setText("x");
            m.apartarCampos(idVuelo, 5, 4);
            listaBotones.add(vistaAvion.getjButton30());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton30()) && vistaAvion.getjButton30().getText() == "x"){
            vistaAvion.getjButton30().setBackground(Color.green);
            vistaAvion.getjButton30().setText("-");
            m.quitarCampos(idVuelo, 5, 4);
            listaBotones.remove(vistaAvion.getjButton30());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton31()) && vistaAvion.getjButton31().getText() == "-")
        {
            vistaAvion.getjButton31().setBackground(Color.gray);   
            vistaAvion.getjButton31().setText("x");
            m.apartarCampos(idVuelo, 0, 5);
            listaBotones.add(vistaAvion.getjButton31());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton31()) && vistaAvion.getjButton31().getText() == "x"){
            vistaAvion.getjButton31().setBackground(Color.green);
            vistaAvion.getjButton31().setText("-");
            m.quitarCampos(idVuelo, 0, 5);
            listaBotones.remove(vistaAvion.getjButton31());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton32()) && vistaAvion.getjButton32().getText() == "-")
        {
            vistaAvion.getjButton32().setBackground(Color.gray);   
            vistaAvion.getjButton32().setText("x");
            m.apartarCampos(idVuelo, 1, 5);
            listaBotones.add(vistaAvion.getjButton32());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton32()) && vistaAvion.getjButton32().getText() == "x"){
            vistaAvion.getjButton32().setBackground(Color.green);
            vistaAvion.getjButton32().setText("-");
            m.quitarCampos(idVuelo, 1, 5);
            listaBotones.remove(vistaAvion.getjButton32());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton33()) && vistaAvion.getjButton33().getText() == "-")
        {
            vistaAvion.getjButton33().setBackground(Color.gray);   
            vistaAvion.getjButton33().setText("x");
            m.apartarCampos(idVuelo, 2, 5);
            listaBotones.add(vistaAvion.getjButton33());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton33()) && vistaAvion.getjButton33().getText() == "x"){
            vistaAvion.getjButton33().setBackground(Color.green);
            vistaAvion.getjButton33().setText("-");
            m.quitarCampos(idVuelo, 2, 5);
            listaBotones.remove(vistaAvion.getjButton33());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton34()) && vistaAvion.getjButton34().getText() == "-")
        {
            vistaAvion.getjButton34().setBackground(Color.gray);   
            vistaAvion.getjButton34().setText("x");
            m.apartarCampos(idVuelo, 3, 5);
            listaBotones.add(vistaAvion.getjButton34());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton34()) && vistaAvion.getjButton34().getText() == "x"){
            vistaAvion.getjButton34().setBackground(Color.green);
            vistaAvion.getjButton34().setText("-");
            m.quitarCampos(idVuelo, 3, 5);
            listaBotones.remove(vistaAvion.getjButton34());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton35()) && vistaAvion.getjButton35().getText() == "-")
        {
            vistaAvion.getjButton35().setBackground(Color.gray);   
            vistaAvion.getjButton35().setText("x");
            m.apartarCampos(idVuelo, 4, 5);
            listaBotones.add(vistaAvion.getjButton35());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton35()) && vistaAvion.getjButton35().getText() == "x"){
            vistaAvion.getjButton35().setBackground(Color.green);
            vistaAvion.getjButton35().setText("-");
            m.quitarCampos(idVuelo, 4, 5);
            listaBotones.remove(vistaAvion.getjButton35());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton36()) && vistaAvion.getjButton36().getText() == "-")
        {
            vistaAvion.getjButton36().setBackground(Color.gray);   
            vistaAvion.getjButton36().setText("x");
            m.apartarCampos(idVuelo, 5, 5);
            listaBotones.add(vistaAvion.getjButton36());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton36()) && vistaAvion.getjButton36().getText() == "x"){
            vistaAvion.getjButton36().setBackground(Color.green);
            vistaAvion.getjButton36().setText("-");
            m.quitarCampos(idVuelo, 5, 5);
            listaBotones.remove(vistaAvion.getjButton36());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton37()) && vistaAvion.getjButton37().getText() == "-")
        {
            vistaAvion.getjButton37().setBackground(Color.gray);   
            vistaAvion.getjButton37().setText("x");
            m.apartarCampos(idVuelo, 0, 6);
            listaBotones.add(vistaAvion.getjButton37());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton37()) && vistaAvion.getjButton37().getText() == "x"){
            vistaAvion.getjButton37().setBackground(Color.green);
            vistaAvion.getjButton37().setText("-");
            m.quitarCampos(idVuelo, 0, 6);
            listaBotones.remove(vistaAvion.getjButton37());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton38()) && vistaAvion.getjButton38().getText() == "-")
        {
            vistaAvion.getjButton38().setBackground(Color.gray);   
            vistaAvion.getjButton38().setText("x");
            m.apartarCampos(idVuelo, 1, 6);
            listaBotones.add(vistaAvion.getjButton38());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton38()) && vistaAvion.getjButton38().getText() == "x"){
            vistaAvion.getjButton38().setBackground(Color.green);
            vistaAvion.getjButton38().setText("-");
            m.quitarCampos(idVuelo, 1, 6);
            listaBotones.remove(vistaAvion.getjButton38());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton39()) && vistaAvion.getjButton39().getText() == "-")
        {
            vistaAvion.getjButton39().setBackground(Color.gray);   
            vistaAvion.getjButton39().setText("x");
            m.apartarCampos(idVuelo, 2, 6);
            listaBotones.add(vistaAvion.getjButton39());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton39()) && vistaAvion.getjButton39().getText() == "x"){
            vistaAvion.getjButton39().setBackground(Color.green);
            vistaAvion.getjButton39().setText("-");
            m.quitarCampos(idVuelo, 2, 6);
            listaBotones.remove(vistaAvion.getjButton39());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton40()) && vistaAvion.getjButton40().getText() == "-")
        {
            vistaAvion.getjButton40().setBackground(Color.gray);   
            vistaAvion.getjButton40().setText("x");
            m.apartarCampos(idVuelo, 3, 6);
            listaBotones.add(vistaAvion.getjButton40());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton40()) && vistaAvion.getjButton40().getText() == "x"){
            vistaAvion.getjButton40().setBackground(Color.green);
            vistaAvion.getjButton40().setText("-");
            m.quitarCampos(idVuelo, 3, 6);
            listaBotones.remove(vistaAvion.getjButton40());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton41()) && vistaAvion.getjButton41().getText() == "-")
        {
            vistaAvion.getjButton41().setBackground(Color.gray);   
            vistaAvion.getjButton41().setText("x");
            m.apartarCampos(idVuelo, 4, 6);
            listaBotones.add(vistaAvion.getjButton41());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton41()) && vistaAvion.getjButton41().getText() == "x"){
            vistaAvion.getjButton41().setBackground(Color.green);
            vistaAvion.getjButton41().setText("-");
            m.quitarCampos(idVuelo, 4, 6);
            listaBotones.remove(vistaAvion.getjButton41());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton42()) && vistaAvion.getjButton42().getText() == "-")
        {
            vistaAvion.getjButton42().setBackground(Color.gray);   
            vistaAvion.getjButton42().setText("x");
            m.apartarCampos(idVuelo, 5, 6);
            listaBotones.add(vistaAvion.getjButton42());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton42()) && vistaAvion.getjButton42().getText() == "x"){
            vistaAvion.getjButton42().setBackground(Color.green);
            vistaAvion.getjButton42().setText("-");
            m.quitarCampos(idVuelo, 5, 6);
            listaBotones.remove(vistaAvion.getjButton42());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton43()) && vistaAvion.getjButton43().getText() == "-")
        {
            vistaAvion.getjButton43().setBackground(Color.gray);   
            vistaAvion.getjButton43().setText("x");
            m.apartarCampos(idVuelo, 0, 7);
            listaBotones.add(vistaAvion.getjButton43());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton43()) && vistaAvion.getjButton43().getText() == "x"){
            vistaAvion.getjButton43().setBackground(Color.green);
            vistaAvion.getjButton43().setText("-");
            m.quitarCampos(idVuelo, 0, 7);
            listaBotones.remove(vistaAvion.getjButton43());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton44()) && vistaAvion.getjButton44().getText() == "-")
        {
            vistaAvion.getjButton44().setBackground(Color.gray);   
            vistaAvion.getjButton44().setText("x");
            m.apartarCampos(idVuelo, 1, 7);
            listaBotones.add(vistaAvion.getjButton44());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton44()) && vistaAvion.getjButton44().getText() == "x"){
            vistaAvion.getjButton44().setBackground(Color.green);
            vistaAvion.getjButton44().setText("-");
            m.quitarCampos(idVuelo, 1, 7);
            listaBotones.remove(vistaAvion.getjButton44());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton45()) && vistaAvion.getjButton45().getText() == "-")
        {
            vistaAvion.getjButton45().setBackground(Color.gray);   
            vistaAvion.getjButton45().setText("x");
            m.apartarCampos(idVuelo, 2, 7);
            listaBotones.add(vistaAvion.getjButton45());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton45()) && vistaAvion.getjButton45().getText() == "x"){
            vistaAvion.getjButton45().setBackground(Color.green);
            vistaAvion.getjButton45().setText("-");
            m.quitarCampos(idVuelo, 2, 7);
            listaBotones.remove(vistaAvion.getjButton45());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton46()) && vistaAvion.getjButton46().getText() == "-")
        {
            vistaAvion.getjButton46().setBackground(Color.gray);   
            vistaAvion.getjButton46().setText("x");
            m.apartarCampos(idVuelo, 3, 7);
            listaBotones.add(vistaAvion.getjButton46());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton46()) && vistaAvion.getjButton46().getText() == "x"){
            vistaAvion.getjButton46().setBackground(Color.green);
            vistaAvion.getjButton46().setText("-");
            m.quitarCampos(idVuelo, 3, 7);
            listaBotones.remove(vistaAvion.getjButton46());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton47()) && vistaAvion.getjButton47().getText() == "-")
        {
            vistaAvion.getjButton47().setBackground(Color.gray);   
            vistaAvion.getjButton47().setText("x");
            m.apartarCampos(idVuelo, 4, 7);
            listaBotones.add(vistaAvion.getjButton47());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton47()) && vistaAvion.getjButton47().getText() == "x"){
            vistaAvion.getjButton47().setBackground(Color.green);
            vistaAvion.getjButton47().setText("-");
            m.quitarCampos(idVuelo, 4, 7);
            listaBotones.remove(vistaAvion.getjButton47());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getjButton48()) && vistaAvion.getjButton48().getText() == "-")
        {
            vistaAvion.getjButton48().setBackground(Color.gray);  
            vistaAvion.getjButton48().setText("x");
            m.apartarCampos(idVuelo, 5, 7);
            listaBotones.add(vistaAvion.getjButton48());
            cant++;
        }else if(ae.getSource().equals(vistaAvion.getjButton48()) && vistaAvion.getjButton48().getText() == "x"){
            vistaAvion.getjButton48().setBackground(Color.green);
            vistaAvion.getjButton48().setText("-");
            m.quitarCampos(idVuelo, 5, 7);
            listaBotones.remove(vistaAvion.getjButton48());
            cant--;
        }
        if(ae.getSource().equals(vistaAvion.getComprarAsientosBtn()) && cant == cantAcompanantes)
        {
            JOptionPane.showMessageDialog(null, "Compra exitosa");
            cant = 0;
            vistaAvion.setVisible(false);
            vistaAgregarClientes.iniciar();
        }else if(ae.getSource().equals(vistaAvion.getComprarAsientosBtn()) && cant != cantAcompanantes){
            JOptionPane.showMessageDialog(null, "Los asientos seleccionados no coinciden con la cantidad de acompañantes.\nSeleccione la cantidad correcta");
        }
        /*if(ae.getSource().equals(vistaAvion.getVolverBtn()))
        {
            vistaAvion.setVisible(false);
            accionVolverBtn();
            cant = 0;
            listaBotones.removeAll(listaBotones);
            vistaAgregarClientes.iniciar();
        }*/
        System.out.println(m.toStringVuelos());
        System.out.println(idVuelo);
        System.out.println(cant);
        System.out.println(cantAcompanantes);
    }
    
    public void accionVolverBtn(){
        for(int i = 0; i < listaBotones.size(); i++)
        {
            if(listaBotones.get(i) == vistaAvion.getjButton1())
            {
                m.quitarCampos(idVuelo, 0, 0);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton2())
            {
                m.quitarCampos(idVuelo, 1, 0);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton3())
            {
                m.quitarCampos(idVuelo, 2, 0);
            }
           
            else if(listaBotones.get(i) == vistaAvion.getjButton4())
            {
                m.quitarCampos(idVuelo, 3, 0);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton5())
            {
                m.quitarCampos(idVuelo, 4, 0);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton6())
            {
                m.quitarCampos(idVuelo, 5, 0);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton7())
            {
                m.quitarCampos(idVuelo, 0, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton8())
            {
                m.quitarCampos(idVuelo, 1, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton9())
            {
                m.quitarCampos(idVuelo, 2, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton10())
            {
                m.quitarCampos(idVuelo, 3, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton11())
            {
                m.quitarCampos(idVuelo, 4, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton12())
            {
                m.quitarCampos(idVuelo, 5, 1);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton13())
            {
                m.quitarCampos(idVuelo, 0, 2);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton14())
            {
                m.quitarCampos(idVuelo, 1, 2);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton15())
            {
                m.quitarCampos(idVuelo, 2, 2);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton16())
            {
                m.quitarCampos(idVuelo, 3, 2);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton17())
            {
                m.quitarCampos(idVuelo, 4, 2);
            }
            /****/
            else if(listaBotones.get(i) == vistaAvion.getjButton18())
            {
                m.quitarCampos(idVuelo, 5, 2);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton19())
            {
                m.quitarCampos(idVuelo, 0, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton20())
            {
                m.quitarCampos(idVuelo, 1, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton21())
            {
                m.quitarCampos(idVuelo, 2, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton22())
            {
                m.quitarCampos(idVuelo, 3, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton23())
            {
                m.quitarCampos(idVuelo, 4, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton24())
            {
                m.quitarCampos(idVuelo, 5, 3);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton25())
            {
                m.quitarCampos(idVuelo, 0, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton26())
            {
                m.quitarCampos(idVuelo, 1, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton27())
            {
                m.quitarCampos(idVuelo, 2, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton28())
            {
                m.quitarCampos(idVuelo, 3, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton29())
            {
                m.quitarCampos(idVuelo, 4, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton30())
            {
                m.quitarCampos(idVuelo, 5, 4);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton31())
            {
                m.quitarCampos(idVuelo, 0, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton32())
            {
                m.quitarCampos(idVuelo, 1, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton33())
            {
                m.quitarCampos(idVuelo, 2, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton34())
            {
                m.quitarCampos(idVuelo, 3, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton35())
            {
                m.quitarCampos(idVuelo, 4, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton36())
            {
                m.quitarCampos(idVuelo, 5, 5);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton37())
            {
                m.quitarCampos(idVuelo, 0, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton38())
            {
                m.quitarCampos(idVuelo, 1, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton39())
            {
                m.quitarCampos(idVuelo, 2, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton40())
            {
                m.quitarCampos(idVuelo, 3, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton41())
            {
                m.quitarCampos(idVuelo, 4, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton42())
            {
                m.quitarCampos(idVuelo, 5, 6);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton43())
            {
                m.quitarCampos(idVuelo, 0, 7);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton44())
            {
                m.quitarCampos(idVuelo, 1, 7);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton45())
            {
                m.quitarCampos(idVuelo, 2, 7);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton46())
            {
                m.quitarCampos(idVuelo, 3, 7);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton47())
            {
                m.quitarCampos(idVuelo, 4, 7);
            }
            else if(listaBotones.get(i) == vistaAvion.getjButton48())
            {
                m.quitarCampos(idVuelo, 5, 7);
            }
                     
            
            
        }
    }
    
    public void reset(){
        if(m.cargaAsientos(idVuelo, 0, 0)){
            vistaAvion.getjButton1().setText("x");
            vistaAvion.getjButton1().setBackground(Color.red);
            vistaAvion.getjButton1().setEnabled(false);
        }else{
            vistaAvion.getjButton1().setText("-");
            vistaAvion.getjButton1().setBackground(Color.green);
            vistaAvion.getjButton1().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 0)){
            vistaAvion.getjButton2().setText("x");
            vistaAvion.getjButton2().setBackground(Color.red);
            vistaAvion.getjButton2().setEnabled(false);
        }else{
            vistaAvion.getjButton2().setText("-");
            vistaAvion.getjButton2().setBackground(Color.green);
            vistaAvion.getjButton2().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 0)){
            vistaAvion.getjButton3().setText("x");
            vistaAvion.getjButton3().setBackground(Color.red);
            vistaAvion.getjButton3().setEnabled(false);
        }else{
            vistaAvion.getjButton3().setText("-");
            vistaAvion.getjButton3().setBackground(Color.green);
            vistaAvion.getjButton3().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 0)){
            vistaAvion.getjButton4().setText("x");
            vistaAvion.getjButton4().setBackground(Color.red);
            vistaAvion.getjButton4().setEnabled(false);
        }else{
            vistaAvion.getjButton4().setText("-");
            vistaAvion.getjButton4().setBackground(Color.green);
            vistaAvion.getjButton4().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 0)){
            vistaAvion.getjButton5().setText("x");
            vistaAvion.getjButton5().setBackground(Color.red);
            vistaAvion.getjButton5().setEnabled(false);
        }else{
            vistaAvion.getjButton5().setText("-");
            vistaAvion.getjButton5().setBackground(Color.green);
            vistaAvion.getjButton5().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 0)){
            vistaAvion.getjButton6().setText("x");
            vistaAvion.getjButton6().setBackground(Color.red);
            vistaAvion.getjButton6().setEnabled(false);
        }else{
            vistaAvion.getjButton6().setText("-");
            vistaAvion.getjButton6().setBackground(Color.green);
            vistaAvion.getjButton6().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 1)){
            vistaAvion.getjButton7().setText("x");
            vistaAvion.getjButton7().setBackground(Color.red);
            vistaAvion.getjButton7().setEnabled(false);
        }else{
            vistaAvion.getjButton7().setText("-");
            vistaAvion.getjButton7().setBackground(Color.green);
            vistaAvion.getjButton7().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 1)){
            vistaAvion.getjButton8().setText("x");
            vistaAvion.getjButton8().setBackground(Color.red);
            vistaAvion.getjButton8().setEnabled(false);
        }else{
            vistaAvion.getjButton8().setText("-");
            vistaAvion.getjButton8().setBackground(Color.green);
            vistaAvion.getjButton8().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 1)){
            vistaAvion.getjButton9().setText("x");
            vistaAvion.getjButton9().setBackground(Color.red);
            vistaAvion.getjButton9().setEnabled(false);
        }else{
            vistaAvion.getjButton9().setText("-");
            vistaAvion.getjButton9().setBackground(Color.green);
            vistaAvion.getjButton9().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 1)){
            vistaAvion.getjButton10().setText("x");
            vistaAvion.getjButton10().setBackground(Color.red);
            vistaAvion.getjButton10().setEnabled(false);
        }else{
            vistaAvion.getjButton10().setText("-");
            vistaAvion.getjButton10().setBackground(Color.green);
            vistaAvion.getjButton10().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 1)){
            vistaAvion.getjButton11().setText("x");
            vistaAvion.getjButton11().setBackground(Color.red);
            vistaAvion.getjButton11().setEnabled(false);
        }else{
            vistaAvion.getjButton11().setText("-");
            vistaAvion.getjButton11().setBackground(Color.green);
            vistaAvion.getjButton11().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 1)){
            vistaAvion.getjButton12().setText("x");
            vistaAvion.getjButton12().setBackground(Color.red);
            vistaAvion.getjButton12().setEnabled(false);
        }else{
            vistaAvion.getjButton12().setText("-");
            vistaAvion.getjButton12().setBackground(Color.green);
            vistaAvion.getjButton12().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 2)){
            vistaAvion.getjButton13().setText("x");
            vistaAvion.getjButton13().setBackground(Color.red);
            vistaAvion.getjButton13().setEnabled(false);
        }else{
            vistaAvion.getjButton13().setText("-");
            vistaAvion.getjButton13().setBackground(Color.green);
            vistaAvion.getjButton13().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 2)){
            vistaAvion.getjButton14().setText("x");
            vistaAvion.getjButton14().setBackground(Color.red);
            vistaAvion.getjButton14().setEnabled(false);
        }else{
            vistaAvion.getjButton14().setText("-");
            vistaAvion.getjButton14().setBackground(Color.green);
            vistaAvion.getjButton14().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 2)){
            vistaAvion.getjButton15().setText("x");
            vistaAvion.getjButton15().setBackground(Color.red);
            vistaAvion.getjButton15().setEnabled(false);
        }else{
            vistaAvion.getjButton15().setText("-");
            vistaAvion.getjButton15().setBackground(Color.green);
            vistaAvion.getjButton15().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 2)){
            vistaAvion.getjButton16().setText("x");
            vistaAvion.getjButton16().setBackground(Color.red);
            vistaAvion.getjButton16().setEnabled(false);
        }else{
            vistaAvion.getjButton16().setText("-");
            vistaAvion.getjButton16().setBackground(Color.green);
            vistaAvion.getjButton16().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 2)){
            vistaAvion.getjButton17().setText("x");
            vistaAvion.getjButton17().setBackground(Color.red);
            vistaAvion.getjButton17().setEnabled(false);
        }else{
            vistaAvion.getjButton17().setText("-");
            vistaAvion.getjButton17().setBackground(Color.green);
            vistaAvion.getjButton17().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 2)){
            vistaAvion.getjButton18().setText("x");
            vistaAvion.getjButton18().setBackground(Color.red);
            vistaAvion.getjButton18().setEnabled(false);
        }else{
            vistaAvion.getjButton18().setText("-");
            vistaAvion.getjButton18().setBackground(Color.green);
            vistaAvion.getjButton18().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 3)){
            vistaAvion.getjButton19().setText("x");
            vistaAvion.getjButton19().setBackground(Color.red);
            vistaAvion.getjButton19().setEnabled(false);
        }else{
            vistaAvion.getjButton19().setText("-");
            vistaAvion.getjButton19().setBackground(Color.green);
            vistaAvion.getjButton19().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 3)){
            vistaAvion.getjButton20().setText("x");
            vistaAvion.getjButton20().setBackground(Color.red);
            vistaAvion.getjButton20().setEnabled(false);
        }else{
            vistaAvion.getjButton20().setText("-");
            vistaAvion.getjButton20().setBackground(Color.green);
            vistaAvion.getjButton20().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 3)){
            vistaAvion.getjButton21().setText("x");
            vistaAvion.getjButton21().setBackground(Color.red);
            vistaAvion.getjButton21().setEnabled(false);
        }else{
            vistaAvion.getjButton21().setText("-");
            vistaAvion.getjButton21().setBackground(Color.green);
            vistaAvion.getjButton21().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 3)){
            vistaAvion.getjButton22().setText("x");
            vistaAvion.getjButton22().setBackground(Color.red);
            vistaAvion.getjButton22().setEnabled(false);
        }else{
            vistaAvion.getjButton22().setText("-");
            vistaAvion.getjButton22().setBackground(Color.green);
            vistaAvion.getjButton22().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 3)){
            vistaAvion.getjButton23().setText("x");
            vistaAvion.getjButton23().setBackground(Color.red);
            vistaAvion.getjButton23().setEnabled(false);
        }else{
            vistaAvion.getjButton23().setText("-");
            vistaAvion.getjButton23().setBackground(Color.green);
            vistaAvion.getjButton23().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 3)){
            vistaAvion.getjButton24().setText("x");
            vistaAvion.getjButton24().setBackground(Color.red);
            vistaAvion.getjButton24().setEnabled(false);
        }else{
            vistaAvion.getjButton24().setText("-");
            vistaAvion.getjButton24().setBackground(Color.green);
            vistaAvion.getjButton24().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 4)){
            vistaAvion.getjButton25().setText("x");
            vistaAvion.getjButton25().setBackground(Color.red);
            vistaAvion.getjButton25().setEnabled(false);
        }else{
            vistaAvion.getjButton25().setText("-");
            vistaAvion.getjButton25().setBackground(Color.green);
            vistaAvion.getjButton25().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 4)){
            vistaAvion.getjButton26().setText("x");
            vistaAvion.getjButton26().setBackground(Color.red);
            vistaAvion.getjButton26().setEnabled(false);
        }else{
            vistaAvion.getjButton26().setText("-");
            vistaAvion.getjButton26().setBackground(Color.green);
            vistaAvion.getjButton26().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 4)){
            vistaAvion.getjButton27().setText("x");
            vistaAvion.getjButton27().setBackground(Color.red);
            vistaAvion.getjButton27().setEnabled(false);
        }else{
            vistaAvion.getjButton27().setText("-");
            vistaAvion.getjButton27().setBackground(Color.green);
            vistaAvion.getjButton27().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 4)){
            vistaAvion.getjButton28().setText("x");
            vistaAvion.getjButton28().setBackground(Color.red);
            vistaAvion.getjButton28().setEnabled(false);
        }else{
            vistaAvion.getjButton28().setText("-");
            vistaAvion.getjButton28().setBackground(Color.green);
            vistaAvion.getjButton28().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 4)){
            vistaAvion.getjButton29().setText("x");
            vistaAvion.getjButton29().setBackground(Color.red);
            vistaAvion.getjButton29().setEnabled(false);
        }else{
            vistaAvion.getjButton29().setText("-");
            vistaAvion.getjButton29().setBackground(Color.green);
            vistaAvion.getjButton29().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 4)){
            vistaAvion.getjButton30().setText("x");
            vistaAvion.getjButton30().setBackground(Color.red);
            vistaAvion.getjButton30().setEnabled(false);
        }else{
            vistaAvion.getjButton30().setText("-");
            vistaAvion.getjButton30().setBackground(Color.green);
            vistaAvion.getjButton30().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 5)){
            vistaAvion.getjButton31().setText("x");
            vistaAvion.getjButton31().setBackground(Color.red);
            vistaAvion.getjButton31().setEnabled(false);
        }else{
            vistaAvion.getjButton31().setText("-");
            vistaAvion.getjButton31().setBackground(Color.green);
            vistaAvion.getjButton31().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 5)){
            vistaAvion.getjButton32().setText("x");
            vistaAvion.getjButton32().setBackground(Color.red);
            vistaAvion.getjButton32().setEnabled(false);
        }else{
            vistaAvion.getjButton32().setText("-");
            vistaAvion.getjButton32().setBackground(Color.green);
            vistaAvion.getjButton32().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 5)){
            vistaAvion.getjButton33().setText("x");
            vistaAvion.getjButton33().setBackground(Color.red);
            vistaAvion.getjButton33().setEnabled(false);
        }else{
            vistaAvion.getjButton33().setText("-");
            vistaAvion.getjButton33().setBackground(Color.green);
            vistaAvion.getjButton33().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 5)){
            vistaAvion.getjButton34().setText("x");
            vistaAvion.getjButton34().setBackground(Color.red);
            vistaAvion.getjButton34().setEnabled(false);
        }else{
            vistaAvion.getjButton34().setText("-");
            vistaAvion.getjButton34().setBackground(Color.green);
            vistaAvion.getjButton34().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 5)){
            vistaAvion.getjButton35().setText("x");
            vistaAvion.getjButton35().setBackground(Color.red);
            vistaAvion.getjButton35().setEnabled(false);
        }else{
            vistaAvion.getjButton35().setText("-");
            vistaAvion.getjButton35().setBackground(Color.green);
            vistaAvion.getjButton35().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 5)){
            vistaAvion.getjButton36().setText("x");
            vistaAvion.getjButton36().setBackground(Color.red);
            vistaAvion.getjButton36().setEnabled(false);
        }else{
            vistaAvion.getjButton36().setText("-");
            vistaAvion.getjButton36().setBackground(Color.green);
            vistaAvion.getjButton36().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 6)){
            vistaAvion.getjButton37().setText("x");
            vistaAvion.getjButton37().setBackground(Color.red);
            vistaAvion.getjButton37().setEnabled(false);
        }else{
            vistaAvion.getjButton37().setText("-");
            vistaAvion.getjButton37().setBackground(Color.green);
            vistaAvion.getjButton37().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 6)){
            vistaAvion.getjButton38().setText("x");
            vistaAvion.getjButton38().setBackground(Color.red);
            vistaAvion.getjButton38().setEnabled(false);
        }else{
            vistaAvion.getjButton38().setText("-");
            vistaAvion.getjButton38().setBackground(Color.green);
            vistaAvion.getjButton38().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 6)){
            vistaAvion.getjButton39().setText("x");
            vistaAvion.getjButton39().setBackground(Color.red);
            vistaAvion.getjButton39().setEnabled(false);
        }else{
            vistaAvion.getjButton39().setText("-");
            vistaAvion.getjButton39().setBackground(Color.green);
            vistaAvion.getjButton39().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 6)){
            vistaAvion.getjButton40().setText("x");
            vistaAvion.getjButton40().setBackground(Color.red);
            vistaAvion.getjButton40().setEnabled(false);
        }else{
            vistaAvion.getjButton40().setText("-");
            vistaAvion.getjButton40().setBackground(Color.green);
            vistaAvion.getjButton40().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 6)){
            vistaAvion.getjButton41().setText("x");
            vistaAvion.getjButton41().setBackground(Color.red);
            vistaAvion.getjButton41().setEnabled(false);
        }else{
            vistaAvion.getjButton41().setText("-");
            vistaAvion.getjButton41().setBackground(Color.green);
            vistaAvion.getjButton41().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 6)){
            vistaAvion.getjButton42().setText("x");
            vistaAvion.getjButton42().setBackground(Color.red);
            vistaAvion.getjButton42().setEnabled(false);
        }else{
            vistaAvion.getjButton42().setText("-");
            vistaAvion.getjButton42().setBackground(Color.green);
            vistaAvion.getjButton42().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 0, 7)){
            vistaAvion.getjButton43().setText("x");
            vistaAvion.getjButton43().setBackground(Color.red);
            vistaAvion.getjButton43().setEnabled(false);
        }else{
            vistaAvion.getjButton43().setText("-");
            vistaAvion.getjButton43().setBackground(Color.green);
            vistaAvion.getjButton43().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 1, 7)){
            vistaAvion.getjButton44().setText("x");
            vistaAvion.getjButton44().setBackground(Color.red);
            vistaAvion.getjButton44().setEnabled(false);
        }else{
            vistaAvion.getjButton44().setText("-");
            vistaAvion.getjButton44().setBackground(Color.green);
            vistaAvion.getjButton44().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 2, 7)){
            vistaAvion.getjButton45().setText("x");
            vistaAvion.getjButton45().setBackground(Color.red);
            vistaAvion.getjButton45().setEnabled(false);
        }else{
            vistaAvion.getjButton45().setText("-");
            vistaAvion.getjButton45().setBackground(Color.green);
            vistaAvion.getjButton45().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 3, 7)){
            vistaAvion.getjButton46().setText("x");
            vistaAvion.getjButton46().setBackground(Color.red);
            vistaAvion.getjButton46().setEnabled(false);
        }else{
            vistaAvion.getjButton46().setText("-");
            vistaAvion.getjButton46().setBackground(Color.green);
            vistaAvion.getjButton46().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 4, 7)){
            vistaAvion.getjButton47().setText("x");
            vistaAvion.getjButton47().setBackground(Color.red);
            vistaAvion.getjButton47().setEnabled(false);
        }else{
            vistaAvion.getjButton47().setText("-");
            vistaAvion.getjButton47().setBackground(Color.green);
            vistaAvion.getjButton47().setEnabled(true);
        }
        if(m.cargaAsientos(idVuelo, 5, 7)){
            vistaAvion.getjButton48().setText("x");
            vistaAvion.getjButton48().setBackground(Color.red);
            vistaAvion.getjButton48().setEnabled(false);
        }else{
            vistaAvion.getjButton48().setText("-");
            vistaAvion.getjButton48().setBackground(Color.green);
            vistaAvion.getjButton48().setEnabled(true);
        }
    }
}

