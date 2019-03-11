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
public class ProductoRefrigerado extends Producto{
    
    private String codigoOrganismo;
    private int temperatura;

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ProductoRefrigerado(String codigoOrganismo, int temperatura, Date fecha_Caducidad, String numero_Lote, Date fechaEnvasado, String paisOrigen) {
        super(fecha_Caducidad, numero_Lote, fechaEnvasado, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperatura = temperatura;
    }

    
    
}
