/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

//Importamos scanner
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class unoSegunda {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b, c;
        
        //Creamos el objero para obtener datos por teclado
        Scanner sc = new Scanner(System.in);
        //Pedimos el valor por teclado para asignarlo a las variables
        System.out.print("Introduce el primer número:");
        a = sc.nextInt();
        System.out.print("Introduce el segundo número:");
        b = sc.nextInt();
        //Evaluamos la expresión en forma de if anidado y comprimido.
        System.out.println("El primer valor de a es "+a+" y el de b es "+b);
        c=a;
        a=b;
        b=c;
        //Evaluamos la expresión en forma de if anidado y comprimido.
        System.out.println("El segundo valor de a es "+a+" y el de b es "+b);
    }
}
