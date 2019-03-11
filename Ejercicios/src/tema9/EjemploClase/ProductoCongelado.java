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
public class ProductoCongelado extends Producto {

    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ProductoCongelado(int temperatura, Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        super(fecha_Caducidad, numero_Lote, fechaEnvasado, paisOrigen);
        this.temperatura = temperatura;
    }

    
    
}
