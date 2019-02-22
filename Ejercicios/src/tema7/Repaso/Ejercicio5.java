/*
Escribe un método que invierta los elementos de un array. El prototipo de la función es la
siguiente:
private int[] reverseElementosArray(int []array)
 */
package tema7.Repaso;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int[] array = new int[6];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        mostrar(array);
        
        System.out.println("");
        
        array = reverseElementosArray(array);
        
        System.out.println("");

        mostrar(array);
    }
    
    
    //devuelve un array de enteros del revés
    private static int[] reverseElementosArray(int []array){
        int[] arrayTemporal = new int[(array.length)];
        int contC = 0;
        for (int y=(array.length)-1; y>=0; y--) {
                arrayTemporal[contC] = array[y];
                contC++;
            } 
        return arrayTemporal;
        
    }
    
    //devuelve un array de lo que sea del revés
    private static Object[] reverseElementosArrayParaCualquierTipo(Object []array){
        Object[] arrayTemporal = new Object[(array.length)];
        int contC = 0;
        for (int y=(array.length)-1; y>=0; y--) {
                arrayTemporal[contC] = array[y];
                contC++;
            } 
        return arrayTemporal;
        
    }
    
    private static void mostrar(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
           
    }
    
    
    
}
