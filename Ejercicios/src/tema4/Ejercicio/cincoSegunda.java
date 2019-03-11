/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

//importar scanner
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author pietrodeocre
 */
public class cincoSegunda {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos objeto de teclado
        Scanner sc=new Scanner(System.in);
        // Definimos variables
        int a;
        // Asignamos valor a la variable
        System.out.print("Introduce un valor numérico:");
        a = sc.nextInt();
        // Definimos las condiciones
        System.out.print((a<=0)?"Error":"La raiz del número es "+Math.sqrt(a));
    }
}
