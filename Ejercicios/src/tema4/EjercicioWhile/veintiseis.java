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
public class veintiseis {
    
    private static float sueldo, sueldoMax;
    private static int sueldos, cont;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de sueldos: ");
        sueldos = sc.nextInt();
        cont=1;
        sueldoMax=0;
        do {
            System.out.print("Escribe el sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo>sueldoMax){
                sueldoMax=sueldo;
            }
            cont++;
        }while(cont>=sueldos);
        System.out.print("El sueldo mas alto es:  "+sueldoMax);
    }
}
