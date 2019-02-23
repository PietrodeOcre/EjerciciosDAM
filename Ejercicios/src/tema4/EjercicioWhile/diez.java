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
public class diez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos objeto teclado
        Scanner sc = new Scanner(System.in);
        // Definimos variables
        int numerouno;
        do {
            System.out.print("Escribe un número: ");
            numerouno = sc.nextInt();
            if (numerouno%2!=0) {
                System.out.println("Número Impar.");
            } else {
                System.out.println("Número Par.");
            }
        }while(numerouno!=0);
    }
}
