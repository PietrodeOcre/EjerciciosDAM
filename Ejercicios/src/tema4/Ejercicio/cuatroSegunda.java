/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

//Importamos Scanner
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class cuatroSegunda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto del teclado
        Scanner sc = new Scanner(System.in);
        // Definimos variables
        int a, b, c;
        //Damos valores a las variables
        System.out.print("Intoduce el primer número: ");
        a = sc.nextInt();
        System.out.print("Intoduce el segundo número: ");
        b = sc.nextInt();
        System.out.print("Intoduce el tercer número: ");
        c = sc.nextInt();
        //Definimos las condiciones
        System.out.print((a<0)?"El producto de dichos números es:"+(a*b*c):"La suma de dichos números es:"+(a+b+c));
    }
}
