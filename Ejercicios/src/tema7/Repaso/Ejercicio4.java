/*
Implementa un algoritmo que determine el elemento mayor y menor de un array de
enteros y de cadenas.
 */
package tema7.Repaso;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio4 {
    
    private static int[] mayorMenorInt (int[] array){
        
        Arrays.sort(array);
        return array; 
    }
    
    private static String[] mayorMenorString (String[] array){
        
        Arrays.sort(array);
        return array;
    }
    
    private static void mayorMenorString (Object[] array){
        
        Arrays.sort(array);
  
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);

    }
    
    public static void main(String[] args) {
        
        int[] arrayNum = new int[4];
        
        String[] arrayCad = new String[4];
        
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            arrayNum[i] = i+r.nextInt(100);
        }
        
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            
            arrayCad[i] = "Hola"+i+r.nextInt(100);
        }
        
        int[] array1 = new int[4];
        
        array1 = mayorMenorInt(arrayNum);
        
        String[] array2 = new String[4];
        
        array2 = mayorMenorString(arrayCad);
        
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        
        System.out.println(array1[0]);
        System.out.println(array1[array1.length-1]);
        
        System.out.println(array2[0]);
        System.out.println(array2[array2.length-1]);
        
        //mayorMenorString(array1);
        
    }
    
}
