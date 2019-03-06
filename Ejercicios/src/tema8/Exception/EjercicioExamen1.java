/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

import static sun.management.Agent.error;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioExamen1 {
    static String s="";
    
    public static void main(String[] args) {
        try{
            doStuff(args);
        }catch(/*error*/IllegalArgumentException e){
            s+="e_";
        }
        
        s+="x";
        System.out.println(s);
    }
    
    private static void doStuff(String[] args){
        if (args.length ==0){
            throw new IllegalArgumentException(); //captura error controlable
            /*
            throwable es la clase superclase de el dependen 
            exception y error son dos clases hijas
            las de tipo exception son controlables por el usuario
            las de tipo error no lo son simplemente se acaba el programa si salta 
            una excepcion de tipo error y no es controlable
            sin embargo con el tipo exception si que es capturable y controlable con lo que
            podriamos controlar lo que sale en caso de excepcion
            */
            //s += "d_";
        }
    }
    //d_e_x
    //
}
