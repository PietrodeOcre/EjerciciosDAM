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
public class Ejercicio2 {
    
    public static void main (String[] args){
        int[] arrayUno = new int[10];
        
        creaArray(arrayUno);
        existe(arrayUno);
        
    }
    
    private static void existe(int[] arrayEnteros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número que quieres comparar:");
        int numero = sc.nextInt();
        System.out.println("El número "+ ((compruebaNumeroArray(numero,arrayEnteros))?" existe.":" no existe."));
    }
    
    private static void creaArray(int[] arrayEnteros){
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<arrayEnteros.length; i++){
            System.out.print("Escribe un número: ");
            arrayEnteros[i] = sc.nextInt();
        }
        
    }
    
    private static boolean compruebaNumeroArray(int numero, int[] arrayEnteros){
        for(int i=0; i<arrayEnteros.length; i++){
            if (numero == arrayEnteros[i]){
                return true;
            }
        }
        return false; 
    }
}
