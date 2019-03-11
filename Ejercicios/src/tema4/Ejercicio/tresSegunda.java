/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

//Importamos libreria de Scanner
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class tresSegunda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b, c;
        //Creamos objeto del teclado
        Scanner sc = new Scanner(System.in);
        //Asignamos valores
        System.out.print("Introduce el primer valor:");
        a = sc.nextInt();
        System.out.print("Introduce el segundo valor:");
        b = sc.nextInt();
        System.out.print("Introduce el tercer valor:");
        c = sc.nextInt();
        //Creamos las condiciones
        System.out.print("El mayor de los tres es "+((a==b && b==c)?"Ninguno":(a>b && a>c)?a:(b>a && b>c)?b:c));
    }
}
