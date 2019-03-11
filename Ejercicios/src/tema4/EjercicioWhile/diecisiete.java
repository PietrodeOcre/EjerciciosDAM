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
public class diecisiete {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definir variables
        int num, suma, x;
        suma = 0;
        //Definimos bucle
        for (x=0; x<15; x++){
            System.out.print("Escribe un número: ");
            num = sc.nextInt();
            suma+=num;
        }
        System.out.println("La suma es: "+suma);
    }
}
