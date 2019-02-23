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
public class ventiuno {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cont,mayorMil, sueldo;
        cont=0;
        mayorMil=0;
        do{
            System.out.print("escribe el sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo>1000){
                ++mayorMil;
            }
            cont++;
        }while(cont<=10);
        System.out.println("Los sueldos por encima de Mil euros son: "+mayorMil);
    }
    
}
