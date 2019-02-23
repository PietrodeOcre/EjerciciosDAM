/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class trece {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear objeto teclado
        int numerouno, sumatorio; // Declaramos variables
        sumatorio = 0;
        do {
            System.out.print("Escribe un número: ");
            numerouno = sc.nextInt();
            sumatorio += numerouno;
        }while (numerouno!=0);
        System.out.println("La suma de números escritos es: "+sumatorio);
    }
    
}
