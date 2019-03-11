/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8II;

/**
 *
 * @author pietrodeocre
 */
public class ExcepcionGestion extends Exception {
    
    String mensaje;

    public ExcepcionGestion(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }
    
    @Override
    public String getMessage() {
        
        if(mensaje == "ExcepcionGestionMayor10"){
            return "Se ha producido una Excepción de tipo: ExcepcionGestionMayor10";
        }else if(mensaje == "ExcepcionGestionMenor3"){
            return "Se ha producido una Excepción de tipo: ExcepcionGestionMenor3"; 
        }
        return "no hay error";

    }
    
}
