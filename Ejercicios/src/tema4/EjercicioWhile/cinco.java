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
public class cinco {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definir variables
        int numerouno, numerodos, sumatorio;
        numerouno=0;
        numerodos = 0;
        System.out.print("Escribe el sumatorio: ");
        sumatorio = sc.nextInt();
        while (numerouno<=100){
            
            numerodos = numerodos +(numerouno+sumatorio);
            numerouno++;
        }
        System.out.print("La suma total es: "+numerodos);
    }
}
