/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Pablo {
    
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        
        int[] array = new int[4];
        
        array = prueba(num);
        
        System.out.println(Arrays.toString(num));
        
        System.out.println(Arrays.toString(array));
        
    }
    
    private static int[] prueba(int[] num){
        //Copiar un array sin la clase Arrays
        
        int[] num2 = new int[num.length];
        int cont=0;
        for (int i = 0; i < (num.length); i++) {
            num2[cont] = num[i];
            //System.out.println(num[i]);
            cont++;
        }
        return num2;
    }
    
    
}
