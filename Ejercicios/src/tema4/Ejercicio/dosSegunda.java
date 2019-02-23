/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;
//Importamos la libreria scanner
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class dosSegunda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objero para obtener datos por teclado
        Scanner sc= new Scanner(System.in);
        // Definimos variables
        int a, b;
        //Asignamos valones a las variables
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        System.out.print("Introduzca un número: ");
        b = sc.nextInt();
        //Realizamos las operaciones y las mostramos
        System.out.println("La suma es: "+(a+b));
        System.out.println("La multiplicación es: "+(a*b));
        System.out.println("La división es: "+(a/b));
        System.out.println("La resta es: "+(a-b));
    }
}