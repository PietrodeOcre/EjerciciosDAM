/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Ejercicios2;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio2 {
    
    private static int[] numero1 = new int[1000];
    
    private static int[] numero2 = numero1;
    
    private static int[] numero3 = numero1.clone();
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        
        rellenaArrayNumero1();
        
        for ( int i=0; i>numero1.length; i++){
            int num = numero1[i];
            System.out.println(num);
        }
        
        
    }

    private static void rellenaArrayNumero1(){
        Random r = new Random();

        for (int i=0; i>1000; i++){
            int valorAleatorio = r.nextInt(6)+1;
            numero1[i] = valorAleatorio;
            
        }
        
    }
    
    
    
}
