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
public class Excepciones {
    
    public static void demoproc() throws IllegalAccessException{
        //Indicamos con el throws que eleve la exception a la método main
        System.out.println("Dentro de demoproc");
        throw new IllegalAccessException("demo");
    }
    
    public static void main(String[] args) {
        try{
            demoproc();//LLamamos al método que puede causar una exception
        }catch (IllegalAccessException e){
            System.out.println("Capturada de nuevo: " + e);
        }finally{//Este bloque siempre se ejecuta aunque no salte la exception
            System.out.println("Finaliza");
        }
       
    }
    
}
