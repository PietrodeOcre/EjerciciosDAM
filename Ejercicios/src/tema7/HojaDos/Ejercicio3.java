/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.HojaDos;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3 {
    
    public static void main(String[] args){
        int[] array = new int[5];
        
        insertar(array);
        mostrar(array);
    }
    
    private static void insertar(int[] array){
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i=0; i< array.length; i++){
            System.out.println("Escribe un número:");
            array[i] = sc.nextInt();
        }
        
    }
    
    private static void mostrar(int[] array){
        for (int i=4; i>=0; i--){
            System.out.println("Número ->" + array[i]);    
        } 
    }
    
}
