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
public class cuatroT5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe los kilos de papas:  ");
        double kilosPapa = sc.nextDouble();
        System.out.print("Escribe los kilos de chocos:  ");
        double kilosChocos = sc.nextDouble();
        System.out.println("Tienes Papas para "+(int)damePapas(kilosPapa)+" personas");
	System.out.println("Tienes Chocos para "+(int)dameChocos(kilosChocos)+" personas");
    }
    public static double damePapas(double kilosPapa){
        return kilosPapa*3;
    }
    public static double dameChocos(double kilosChocos){
        return (kilosChocos*2)*3;
    }
}
