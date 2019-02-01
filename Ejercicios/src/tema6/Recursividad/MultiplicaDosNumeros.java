/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Recursividad;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class MultiplicaDosNumeros {
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Escriba el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("El resultado de la pultiplicación es: ");
        System.out.println(multiplicacion(num1, num2));
    }
    
    private static int multiplicacion(int num1, int num2){
        if (num1== 0 || num2 == 0){
            return 0;
        }else{
            return num1+multiplicacion(num1, --num2);
        }
    }
    
}
