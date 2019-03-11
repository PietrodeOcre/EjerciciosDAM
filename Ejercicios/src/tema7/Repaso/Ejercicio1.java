/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    
    public static void main (String[] args){
        
        int[] array = new int[10];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        /*System.out.println(Arrays.toString(array));
        System.out.println(eliminaElemento(array, 3) + " ");
        System.out.println(Arrays.toString(array));*/
        
        System.out.println(Arrays.toString(array));
        System.out.println(eliminaElementoArray(array, 5) + " ");
        System.out.println(Arrays.toString(array));
        
    }
    
    
    private static boolean eliminaElemento(int []array, int elemento){
        if (array[elemento] == 0){
            return false;
        } else {
            array[elemento] = 0;
        
            for (int i = elemento; i < (array.length)-1; i++) {
                array[i] = array[i+1];
            }
        
            array[array.length-1] = 0;
        
            return true;
        }
        
    }
    
    private static boolean eliminaElementoArray(int[] array, int elemento){
                
        for (int x = 0; x < 10; x++) {
            if(array[x] == elemento){
                array[x] = 0;
                for (int j = x; j < (array.length)-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
        
                return true;
            }                    
        }
        return false;
    }
    
}
