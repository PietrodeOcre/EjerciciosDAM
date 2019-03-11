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
public class tres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        int numerouno, numerodos;
        // Definir el objeto del teclado
        Scanner sc=new Scanner(System.in);
        // Asignar variables
        System.out.print("Escribe el primer número: ");
        numerouno = sc.nextInt();
        System.out.print("Escribe el segundo número: ");
        numerodos = sc.nextInt();
        if (numerouno>numerodos){
            System.out.println("El primer número no puede ser mayor que el segundo número.");
            
        } else {
            while (numerouno<=numerodos) {
                System.out.println(numerouno);
                numerouno++;
            }
        }
    }
}
