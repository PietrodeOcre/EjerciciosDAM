/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1Array {
    
    //Definimos array
    //private static int[] numero;
    private static final int POS = 8;
    
    
    private static void rellena(int[] numero){

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<POS; i++){
            System.out.print("Escribe un número: ");
            numero[i] = sc.nextInt();
            System.out.println("");
        }
    }
    
    private static void muestra(int[] numero){
        for (int x=0; x<POS; x++){
            System.out.println(x + "->" + numero[x]);
        }
    }
    
    private static int encontrarMaximo(int[] numero){
        int maximo = numero[0];
        
        for (int i = 1; i<numero.length; i++ ){
            if (numero[0] >maximo){
                maximo = numero[i];
            }
        }
        return maximo;
    }
    
    private static int encontrarMinimo(int[] numero){
        int minimo = numero[0];
        
        for (int i = 1; i<numero.length; i++ ){
            if (numero[0] <minimo){
                minimo = numero[i];
            }
        }
        return minimo;
    }
    
    
    
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        int[] numero;
        
        numero = new int[POS];
        
        
        rellena(numero);
        muestra(numero);
        if (numero.length>0){
            System.out.print("El máximo es "+encontrarMaximo(numero));
        }
        if (numero.length>0){
            System.out.print("El mínimo es "+encontrarMinimo(numero));
        }
    }
   
    
}
