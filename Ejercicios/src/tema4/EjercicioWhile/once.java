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
public class once {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definir contador
        int numerodos, numerouno;
        //Asignamos valores
        numerodos = 0;
        
        // Declaramos condicion 
        do {
            System.out.print("Escribe un número: ");
            numerouno = sc.nextInt(); //Pedimos el número
            numerodos++;        
        } while(numerouno>0);
        System.out.println("Has tecleado " + numerodos + " números");
    }
    
}
