/*
Escribe un método en Java que encuentre los elementos duplicados de dos arrays de
cadenas y los devuelva en nuevo array:
private String[] encuentraElementosRepetidos(String []listaCadenas1, String []listaCadenas2)
 */
package tema7.Repaso;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio7 {
    
    
    public static void main(String[] args) {
        
        String[] cadena = new String[5];
        
        cadena[0]= "hola";
        cadena[1]= "adios";
        cadena[2]= "hola";
        cadena[3]= "pena";
        cadena[4]= "adios";
        
        String[] cadena2 = null;
        
        
        cadena2 = escribeElementosRepetidosArraySinOrden(cadena);
        
        System.out.println(Arrays.toString(cadena2));
        
    }
    
    
    private static String[] escribeElementosRepetidosArraySinOrden(String[] array){
        //Comparamos el segundo con el primero, el tercero con el segundo y sucesivamente
        String[] cad = new String[array.length];        
        for(int i = 0; i < array.length; i++) { // recorremos todo el array
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])) { // Comparamos si i es igual a su anterior
                    cad[i] = array[i];                    
                }
            }
        } 
        return cad;        
    }    
}
