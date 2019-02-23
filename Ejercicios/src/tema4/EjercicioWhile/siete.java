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
public class siete {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto de teclado
        Scanner sc = new Scanner(System.in);
        // Definir variables
        int opcion, uno, dos, tres;
        do {
        // Mostramos las opciones
        System.out.println("Opción 1 la suma");
        System.out.println("Opción 2 la suma");
        System.out.println("Opción 3 la suma");
        System.out.println("Opción 4 la suma");
        System.out.println("Tendras que elegir entre una de las opciones: ");
        // Asignamos valor a las variables
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Escribe el primer número: ");
                uno = sc.nextInt();
                System.out.println("Escribe el segundo número: ");
                dos = sc.nextInt();
                System.out.println("El resultado de la suma es: "+(uno + dos));
                break;
            case 2:
                System.out.println("Escribe el primer número: ");
                uno = sc.nextInt();
                System.out.println("Escribe el segundo número: ");
                dos = sc.nextInt();
                System.out.println("Escribe el tercer número: ");
                tres = sc.nextInt();
                System.out.println("El resultado de la multiplicación es: "+(uno * dos * tres));
                break;
            case 3:
                System.out.println("Opción no implementada");
                break;
            default :
                break;
        }
        
        }while (opcion != 4 );
    }
}
