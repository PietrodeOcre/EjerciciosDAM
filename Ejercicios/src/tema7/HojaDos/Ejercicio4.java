/*
 * Este programa va a borrar elementos de un array
 * usando varios métodos
 */
package tema7.HojaDos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio4 {
    
    /*
    Este Metodo es el encargado de borrar un elemento del array
    Solo recorre el array hasta que encuentra la posicion 
    que le indicamos, cuando llega a esta, la iguala a cero
    Además devuelve 0 su la borra y si no devuelve -1.
    */
    private static int borrarElemento(int num, int[] array){
        try{
        for (int i=0; i<array.length; i++){
            if (array[i] == array[num]){
                array[i] = 0;
                return 0;
            }
            
        }
           
        }catch (Exception e){
            
            return -1;
        }
        return -1;
    }
    
    private static void llenado(int[] numero){
        Random r = new Random();
        for (int i=0; i<numero.length; i++) {
            
                numero[i] = r.nextInt(1000)+1;
            
	}
    }
    
    private static void mostrar(int[] numero){
        for(int j=0; j<numero.length; j++){
            System.out.println("Número ->" + numero[j]);
            
        } 
        
    }
    
    private static int elementoEliminar(){
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Escriba la posición del array que quiere borrar: ");
        return num = sc.nextInt();
    }
    
    public static void main(String[] args){
        int[] hacemosArray = new int[5];
        
        llenado(hacemosArray);
        
        mostrar(hacemosArray);
        
        int borrar = elementoEliminar();
        
        //borrarElemento(borrar, hacemosArray);
        
        System.out.println("-> ("+ borrarElemento(borrar, hacemosArray) +")");
        
        mostrar(hacemosArray);
        
    }
}
