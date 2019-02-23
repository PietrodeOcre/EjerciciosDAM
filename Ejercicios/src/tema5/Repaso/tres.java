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
public class tres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número de tres cifras: ");
        int elNum = sc.nextInt();
        if((elNum/100)==0 || (elNum/10)==0){
            System.out.print("El número debe ser de tres cifras! ");
        }
        int centenas = (elNum/100);
        int decenas = (elNum/10)-(centenas*10);
        int unidades = (elNum%10);
        int sumaNum = (int)(Math.pow(centenas, 3))+(int)(Math.pow(decenas, 3))+(int)(Math.pow(unidades, 3));
        System.out.println(centenas+"+"+decenas+"+"+unidades+"="+sumaNum);
        int cont = 0, producto = 1;
        System.out.println("El número "+((elNum==sumaNum)?"si es Amstrom":"no es Amstrom"));
    }
}
