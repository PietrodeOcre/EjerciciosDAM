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
public class CongeladoAire extends tema9.EjemploClase.ProductoCongelado{
    private String porcentajes;

    public String getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(String porcentajes) {
        this.porcentajes = porcentajes;
    }

    public CongeladoAire(String porcentajes, int temperatura, Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        super(temperatura, fecha_Caducidad, numero_Lote, fechaEnvasado, paisOrigen);
        this.porcentajes = porcentajes;
    }

    
    
}
