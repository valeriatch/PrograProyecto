/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author XperriX
 */
public class Vuelos {

    public Vuelos(){
        aerolinea = "";
        numeroVuelo = "";
        salida = "";
        destino = "";
        horarioSalida = "";
        horarioLlegada = "";
        fechaCreacion = "";
        duracionVuelo = 0;
        numeroAsientos = 0;
    }

    public Vuelos(String aerolinea, String numeroVuelo, String salida, String destino, String horarioSalida, String horarioLlegada, String fechaCreacion, int duracionVuelo, int numeroAsientos) {
        this.aerolinea = aerolinea;
        this.numeroVuelo = numeroVuelo;
        this.salida = salida;
        this.destino = destino;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.fechaCreacion = fechaCreacion;
        this.duracionVuelo = duracionVuelo;
        this.numeroAsientos = numeroAsientos;
    }
    
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(int duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Vuelos{" + "aerolinea=" + aerolinea + ", numeroVuelo=" + numeroVuelo + ", salida=" + salida + ", destino=" + destino + ", horarioSalida=" + horarioSalida + ", horarioLlegada=" + horarioLlegada + ", fechaCreacion=" + fechaCreacion + ", duracionVuelo=" + duracionVuelo + ", numeroAsientos=" + numeroAsientos + '}';
    }
    
    private String aerolinea;
    private String numeroVuelo;
    private String salida;
    private String destino;
    private String horarioSalida;
    private String horarioLlegada;
    private String fechaCreacion;
    private int duracionVuelo;
    private int numeroAsientos;
    LocalDate date = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
