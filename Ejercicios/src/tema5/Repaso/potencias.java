/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Repaso;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class potencias {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la base: ");
        int base =sc.nextInt();
        System.out.print("Escribe el exponente: ");
        int exponente =sc.nextInt();
        System.out.println("El resultado es: "+potencia(base, exponente));
    }
    
    public static int potencia(int base, int exponente){
        int potencia = 1;
        for(int i = 0; i<exponente;i++){
            potencia *= base;
        }
        return potencia;
    }
 
}
