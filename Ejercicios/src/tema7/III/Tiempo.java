/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.III;

/**
 *
 * @author pietrodeocre
 */
public class Tiempo {
    static long tiempoInicial = System.currentTimeMillis();
    
    
    static long tiempoFinal = System.currentTimeMillis();
    
    private static void espera(){
        for (int i=0; i< 9999; i++){
           
        }
    }
    
    public static void main(String[] args){
        espera();
        System.out.println("El tiempo ha sido: "+(tiempoFinal-tiempoInicial)/1000 + "s");
    }
}
