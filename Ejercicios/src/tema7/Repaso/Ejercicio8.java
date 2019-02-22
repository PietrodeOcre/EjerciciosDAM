/*
Escribe un método que elimine los elementos duplicados de un array de cadenas:
private String[] eliminaElementosDuplicados(String []listaCadenas)
 */
package tema7.Repaso;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        String[] cadena = new String[5];
        
        cadena[0]= "hola";
        cadena[1]= "adios";
        cadena[2]= "hola";
        cadena[3]= "pena";
        cadena[4]= "adios";
        
        //String[] cadena2 = null;
        
        
        escribeElementosRepetidosArraySinOrden(cadena);
        
        System.out.println(Arrays.toString(cadena));
        
    }
    
    //Comparamos el segundo con el primero, el tercero con el segundo y sucesivamente
    private static String[] escribeElementosRepetidosArraySinOrden(String[] array){
        
        //int cont=0;
        //String[] cad = new String[array.length];
        
        for(int i = 0; i < array.length; i++) { // recorremos todo el array
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])) { // Comparamos si i es igual a su anterior
                    array[j] = "";
                    //cont++;
                    //System.out.println("Se repite el num: " + array[i]); // mostramos en pantalla
                }
            }
        } 
        return array;
        
    }
    
}
