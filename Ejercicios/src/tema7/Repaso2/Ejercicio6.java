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
public class Ejercicio6 {
    
    private static void segregaVector(int[] array, int posicion){
        
        for (int i = 0; i < array.length; i++) {
            
            if(i < posicion){
                array[i] = 0;
            }else if(i==posicion){
                array[i]=array[i];
            }else if(i>posicion){
                array[i]=1;
            }
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        
        segregaVector(array, 3);
        
    }
    
}
