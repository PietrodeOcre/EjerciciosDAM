/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class sieteSegunda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto del teclado
        Scanner sc = new Scanner(System.in);
        // Definimos variables
        int a, b = 0, c = 0;
        //Asignamos valor a variable aç
        //Indica la suma de numeros pares desde 0 hasta el número dado
        System.out.print("Escribe un número:");
        a = sc.nextInt();
        while(b<=a){
            if (b%2 == 0){
                c=c+b;
                 
            }
            ++b;
        }
        System.out.print("La suma de los números pares es: "+c);
    }
}
