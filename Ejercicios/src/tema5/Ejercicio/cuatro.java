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
public class cuatro {
    
    public static void main(String[] args) {
        // TODO code application logic here
        long a;
        //Creamos objeto teclado
        Scanner sc = new Scanner(System.in);
       
        //Asignamos valor a variable
        System.out.print("Introduce un número, de una o varias cifras:");
        a=sc.nextInt();
        
        System.out.println("El número tiene "+numeroCifrasDos(a)+" cifras.");
    }
    
    public static int numeroCifrasDos(long b){
        int cont=0;
        do{
            b=b/10;
            ++cont;
        }while(b>=1);
        return cont;
    }
}
