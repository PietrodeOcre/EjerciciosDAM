/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class diecinueve {
    public static int num, cont, sum;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        cont=1;
        sum=1;
        System.out.print("Escribe un número: ");
        num = sc.nextInt();
        calculoFactorial(num);
        System.out.println("El factorial del número es: "+sum);
    }
    
    public static int calculoFactorial(int num){
        while(cont<num){
            cont++;
            sum*=cont;
        }
        return sum;
    }
    
}
