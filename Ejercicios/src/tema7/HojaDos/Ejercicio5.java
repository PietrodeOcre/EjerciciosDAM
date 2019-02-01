/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.HojaDos;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio5 {
    
    //Este método busca un valor dado en un array
    private static void encuentra(int[] numero, int num){
        for (int i=0; i<numero.length; i++){
            if(numero[i] == num){
                
            }
        }
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
    private static int elementoBuscar(){
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
        
        //Mostramos el 0 o el -1 como indica el ejercicio
        System.out.println("-> ("+ elementoBuscar() +")");
        
        //Comprobamos que se ha borrado la posición mostrando de nuevo el array
        mostrar(hacemosArray);
        
    }
}
