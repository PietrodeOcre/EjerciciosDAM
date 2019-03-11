/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

/**
 *
 * @author pietrodeocre
 */
public class ExcepcionNumeros extends Exception {
    String mensaje;
    public ExcepcionNumeros(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return "Se ha producido una Excepción de tipo: " + mensaje; 
    }
    
    
    
}
