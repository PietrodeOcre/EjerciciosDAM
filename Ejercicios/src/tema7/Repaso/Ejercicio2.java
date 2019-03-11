/*
Escribe un método en Java que copie un array en otro. Realice dos versiones: utilizando la
clase Arrays y sin utilizarla. El prototipo del método es el siguiente:
private int[] copiaArray(int []array)
 */
package tema7.Repaso;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio2 {
    
    private static int[] copiaArraySin(int []array){
        
        int []array2 = new int[array.length];
        
        for (int i = 0; i < array.length-1; i++) {
            array2[i] = array[i];
        }
        
        return array2;
    }
    
    private static int[] copiaArrayCon(int []array){
        
        int[] array2 = new int[array.length];
        array2 = Arrays.copyOf(array, array.length);
        //System.arraycopy(array2, 0, array, 0, 10);
        return array2;
    }
    
    public static void main (String[] args){
        
        int[] array = new int[5];
        
        for (int i = 0; i < array.length-1; i++) {
            array[i] = i;
        }
        
        int[] array2 = new int[5];
        
        array2 = copiaArraySin(array);
        
        System.out.println(Arrays.toString(array2));
        
        int[] array3 = new int[5];
        
        array3 = copiaArrayCon(array);
        
        System.out.println(Arrays.toString(array3));
        
    }
    
}
