/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8II;

import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        int[] vector = new int[15];
        
        int num = aleatorio();
        int num2 = aleatorio();
        
        try{
            vector[0] = gestionaMenorQue5(num);
        }catch(ExcepcionGestion e){
            System.out.println(e.getMessage());
            vector[0] = 0;
        }

        vector[1] = gestionaMayorQue5(num2);
    }
    
    private static int gestionaMenorQue5 (int num) throws ExcepcionGestion{
        int resp = num * num;
        if (resp>10){
            throw new ExcepcionGestion("ExcepcionGestionMayor10");  
        }
        return num;
    }
    
    private static int gestionaMayorQue5(int num){
        int resp = num / 2;
        if (resp<=3){
            try{
                throw new ExcepcionGestion("ExcepcionGestionMenor3");
            }catch(ExcepcionGestion e){
                System.out.println(e.getMessage());
                resp = -10;
            }
            
        }
        return resp;
    }
    
    private static int aleatorio(){
        //LLena un array de números aleatorios de 0 a 1000
        Random r = new Random();
        int num = r.nextInt(9);
        return num;  
        
    }
    
}
