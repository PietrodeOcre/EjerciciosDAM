/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.EjemploClase.TipoConjelado;

import java.util.Date;

/**
 *
 * @author pietrodeocre
 */
public class CongeladoNitrogeno extends tema9.EjemploClase.ProductoCongelado {
    
    private String informacion;
    private int tiempoExposicion;

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public CongeladoNitrogeno(String informacion, int tiempoExposicion, int temperatura, Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        super(temperatura, fecha_Caducidad, numero_Lote, fechaEnvasado, paisOrigen);
        this.informacion = informacion;
        this.tiempoExposicion = tiempoExposicion;
    }
    
    
    
}
