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
public class ExcepcionEjercicio7 extends Exception {
    
    private int codigo;
    public ExcepcionEjercicio7 (int codigo) {
        super();
        this.codigo = codigo;
    }

    @Override
    public String getMessage() {
        String mensaje=null;
        if (codigo>4 && codigo <10){
            return "Opcion sin implementar: " + codigo;
        }
        if (codigo >10){
            return "Opcion invalida: " + codigo;
        }else{
            return "Opcion incorrecta: " + codigo; 
        }
        
    }
    
}
