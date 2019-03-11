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
public class CongeladoAgua extends tema9.EjemploClase.ProductoCongelado{
    
    private String salinidad;

    public String getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }

    public CongeladoAgua(String salinidad, int temperatura, Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        super(temperatura, fecha_Caducidad, numero_Lote, fechaEnvasado, paisOrigen);
        this.salinidad = salinidad;
    }
    
    
    
}
