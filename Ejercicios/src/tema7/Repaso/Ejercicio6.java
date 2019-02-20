/*
Escribe un método en Java que escriba por pantalla los elementos repetidos de un array de
cadenas:
private void escribeElementosRepetidosArray(String []array)
 */
package tema7.Repaso;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        String[] cadena = new String[5];
        
        llenaArrayCadena(cadena);
        
        //Arrays.sort(cadena);
        
        cadena[1] = "Hola22";
        cadena[3] = "Hola22";
        
        //Arrays.sort(cadena);
        
        //mostrar(cadena);
        
        //escribeElementosRepetidosArray(cadena);
        
        escribeElementosRepetidosArraySinOrden(cadena);
        
    }
    
    private static void mostrar(String[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"-");
            
        }
           System.out.println("");
    }
    
    //Comparamos el segundo con el primero, el tercero con el segundo y sucesivamente
    private static void escribeElementosRepetidosArray(String[] array){
        
        Arrays.sort(array);
        //Solo funciona si esta ordenado
        for(int i = 1; i < array.length; i++) { // recorremos todo el array
            if(array[i].equals(array[i-1])) { // Comparamos si i es igual a su anterior
                System.out.println("Se repite el num: " + array[i]); // mostramos en pantalla
            }
        } 
        
    }
    
    //Comparamos el segundo con el primero, el tercero con el segundo y sucesivamente
    private static void escribeElementosRepetidosArraySinOrden(String[] array){
        
        for(int i = 1; i < array.length-1; i++) { // recorremos todo el array
            for (int j = i+1; j < array.length-1; j++) {
                if(array[i].equals(array[j])) { // Comparamos si i es igual a su anterior
                    System.out.println("Se repite el num: " + array[i]); // mostramos en pantalla
                }
            }
        } 
        
    }
    
    private static String[] llenaArrayCadena(String[] array){
        
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            
            array[i] = "Hola"+i+r.nextInt(100);
        }
        
        return array;
        
    }
    
}
