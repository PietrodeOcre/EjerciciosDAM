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
public class ocho {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerouno;
        do {
            System.out.print("Escribe un número: ");
            numerouno = sc.nextInt();
            System.out.println("El cuadrado del número es "+(numerouno*numerouno));
        } while(numerouno>0);
        
    }
}
