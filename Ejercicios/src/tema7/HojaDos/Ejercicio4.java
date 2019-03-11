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
    Además devuelve 0 si la borra y si no devuelve -1.
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
    
    //Este Método llena el array de números aleatorios
    private static void llenado(int[] numero){
        Random r = new Random();
        for (int i=0; i<numero.length; i++) {
            
                numero[i] = r.nextInt(1000)+1;
            
	}
    }
    
    //Este método nos muestra el array
    private static void mostrar(int[] numero){
        for(int j=0; j<numero.length; j++){
            System.out.println("Número ->" + numero[j]);
            
        } 
        
    }
    
    //Este método nos pregunta que elemento del array queremos eliminar
    private static int elementoEliminar(){
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Escriba la posición del array que quiere borrar: ");
        return num = sc.nextInt();
    }
    
    
    public static void main(String[] args){
        //Creamos array
        int[] hacemosArray = new int[5];
        
        //Llenamos array
        llenado(hacemosArray);
        
        //Mostramos el array completo
        mostrar(hacemosArray);
        
        //Pedimos un numero de posición del array, el que quermos borrar
        int borrar = elementoEliminar();
        
        //Mostramos el 0 o el -1 como indica el ejercicio
        System.out.println("-> ("+ borrarElemento(borrar, hacemosArray) +")");
        
        //Comprobamos que se ha borrado la posición mostrando de nuevo el array
        mostrar(hacemosArray);
        
    }
}
