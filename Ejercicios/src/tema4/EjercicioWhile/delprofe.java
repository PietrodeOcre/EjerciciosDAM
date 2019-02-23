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
public class delprofe {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Objeto teclado
        Scanner sc = new Scanner(System.in);
        int num_secreto = (int) (Math.random()*1000);
        int num_introducido;
        boolean acierto = false;
        do {
            System.out.print("Escribe un número: ");
            num_introducido = sc.nextInt();
            if (num_introducido == num_secreto){
                System.out.print("Acertaste!!!!");
                acierto=true;
            }else if (num_introducido > num_secreto){
                System.out.println("Menor!");
            }else{
                System.out.println("Mayor!");
            }
        }while (num_introducido != num_secreto);
    }
          

    
}
