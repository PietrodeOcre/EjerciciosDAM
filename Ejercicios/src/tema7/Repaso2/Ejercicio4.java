/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso2;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio4 {
    
    public static void lideres(int[] array) {
        //Muestra lso números del array que despues de ellos
        //No tienen ninguno mayor que ellos mismos.
        boolean esta= false;
        for (int i = 0; i < array.length-1; i++) {
            esta=true;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]<=array[j]){
                    esta = false;
                }
            }
            if(esta){
            System.out.println(array[i]+ " es lider");
            } 
        }   
    }
    
    public static void main(String[] args) {
        int matriz[] = {2,5,9,8,0};
        
        lideres(matriz);
    }
    
}
