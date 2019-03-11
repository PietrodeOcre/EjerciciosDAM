/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.EjemploClase;

import java.util.Date;

/**
 *
 * @author pietrodeocre
 */
public class Producto {
    private Date fecha_Caducidad;
    private String numero_Lote;
    private Date fechaEnvasado;
    private String paisOrigen;

    public Date getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(Date fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public String getNumero_Lote() {
        return numero_Lote;
    }

    public void setNumero_Lote(String numero_Lote) {
        this.numero_Lote = numero_Lote;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Producto(Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        this.fecha_Caducidad = fecha_Caducidad;
        this.numero_Lote = numero_Lote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    
    
    
    
}
