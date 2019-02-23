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
public class diecinueve {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num, cont, sum;
        cont=1;
        sum=1;
        System.out.print("Escribe un número: ");
        num = sc.nextInt();
        while(cont<num){
            cont++;
            sum*=cont;
        }
        System.out.println("El factorial del número es: "+sum);
    }
}
