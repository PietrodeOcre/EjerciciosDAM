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
public class ventiocho {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int suspenso, cont = 1;
        suspenso=0;
        do{
            System.out.print("Escribe la nota del alumno:  ");
            int nota=sc.nextInt();
            if(nota<5){
                suspenso++;
            }
            cont++;
        }while(cont<=5);
        System.out.println("Hay  "+suspenso+" suspensos");
    }
}
