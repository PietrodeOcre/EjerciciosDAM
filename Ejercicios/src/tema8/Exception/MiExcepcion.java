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
public class MiExcepcion extends Exception {
    
    //int mensaje;
    int codigo_error;
    public MiExcepcion(int codigo_error) {
        super(String.valueOf(codigo_error));
        this.codigo_error = codigo_error;
        
    }

    @Override
    public String getMessage() {
        String mensaje=null;

        switch(codigo_error){
            case 111: 
                mensaje="Error, el número está entre 0 y 10.";
                break;
            case 222: 
                mensaje="Error, el número está entre 11 y 20.";
                break;
            case 333: 
                mensaje="Error, el número está entre 21 y 30.";
                break; 
            default:
                mensaje="Error";
                break;
        }
        return mensaje;
        /*if(mensaje>=0 && mensaje<=10) {
            return "Error, el número está entre 0 y 10. excepción con código 111. ";    
        } 
        if(mensaje>=11 && mensaje<=20){
            return "Error, el número está entre 11 y 20. excepción con código 222. ";
        }
        if(mensaje>=21 && mensaje<=30){
            return "Error, el número está entre 21 y 30. excepción con código 333. ";
        }else {
            return "";
        }*/
        //return "Proceso finalizado";
    }
    
    
    /*public setMessage(String mensaje) {
        if(mensaje){
            return "Error, el número está entre 0 y 10";
        }
        return "Se ha producido una Excepción de tipo: " + mensaje; 
    }*/
    
}
