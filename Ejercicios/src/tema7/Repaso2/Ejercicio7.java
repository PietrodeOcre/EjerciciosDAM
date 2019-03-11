/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso2;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int[] array= {1,3,5,4,2,4,5};
        
        separeElementos(array);
        
    }
    
    private static int[] separeElementos(int[] n){
        //devuelve el array dado ordenando los pares primero y los impares depsues
        int[] par = new int[n.length];
        int[] impar = new int[n.length];
        int i;
        int pares = 0;
        int impares = 0;   
        for (i = 0; i < n.length; i++) {
            // Separa los números metiendo los pares en un array
            // y los impares en otro.
            if (n[i] % 2 == 0) {
                par[pares++] = n[i];
            } else {
                impar[impares++] = n[i];
            }
        }       
        // Mete los pares en las primeras posiciones
        // del array original.
        for (i = 0; i < pares; i++) {
            n[i] = par[i];
        }   
        // Mete los impares en los huecos que quedan.
        for (i = pares; i < n.length; i++) {
            n[i] = impar[i - pares];
        }
        // Muestra el resultado.
        System.out.println("Array con los pares al principio:");
        for (i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }        
        return n;
    }
    
}
