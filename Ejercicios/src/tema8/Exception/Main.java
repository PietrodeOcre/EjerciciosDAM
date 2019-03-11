/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int numeroAleatorio = rnd.nextInt(10);
        
        
        try{
            if(numeroAleatorio%2 == 0){

                throw new ExcepcionNumeros("El número es par");

            }else{
                throw new ExcepcionNumeros("El número es impar");
            }
        }catch(ExcepcionNumeros e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
