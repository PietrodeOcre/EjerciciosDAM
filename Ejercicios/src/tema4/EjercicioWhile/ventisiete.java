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
public class ventisiete {
    public static int cont, numCont, numeroUno;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Escribe un número: ");
            numeroUno = sc.nextInt();
            if(numeroUno<0){
                numCont++;
            }
            cont++;
        }while(cont<=10);
        System.out.println("Se han introducido "+ numCont +" números negativos");
    }
}
