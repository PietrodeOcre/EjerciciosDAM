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
public class veinticinco {
    /**
     */
    public static int cont, nota, suspenso, condicion, aprobado;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Escribe la nota: ");
            nota = sc.nextInt();
            if(nota<4){
                suspenso++;
            } 
            if(nota==4){
                condicion++;
            }
            if (nota>=5){
                aprobado++;
            }
            cont++;
        }while(cont<=6);
        System.out.println("Aprobados: "+aprobado);
        System.out.println("Condicionados : "+condicion);
        System.out.println("Suspendidos: "+suspenso);
    }
}
