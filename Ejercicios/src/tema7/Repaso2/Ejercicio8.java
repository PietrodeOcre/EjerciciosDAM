/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso2;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio8 {
    
    private static int[] reemplazaMayor(int[] array){
        int j;
        int f = 0;
        for (int i = 1; i<array.length; i++){
            int a= array[i];
            for(j=i-1; j>0 && array[j]>a; j--){
                array[j+1] = array[j];
                f=array[j];
            }
            array[j+1]=a;
        }
        //System.out.println(f);
        for (int i = 1; i < array.length; i++) {
            array[i] = f;
        }
        return array;
    }
     
    
    public static void main(String[] args) {
        int[] array = {6,7,4,65,7};
    
        reemplazaMayor(array);
        
        System.out.println(Arrays.toString(array));
        
    }
}
