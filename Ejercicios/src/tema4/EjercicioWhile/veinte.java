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
public class veinte {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos objeto teclado
        Scanner sc=new Scanner (System.in);
		int cont, conti, contp, cont_num, num, sumi, sump;
		cont = 0;
                cont_num = 0;
		conti = 0;
		sumi = 1;
		contp = 0;
		sump = 1;
		do {
			System.out.println("Escribe un número");
			num = sc.nextInt();
			if (num==0) {
                            ++cont_num;
			}
			if (cont%2!=0) {
                            sumi+=cont;
                            ++conti;
			} else {
                            sump+=cont;
                            ++contp;
				
			}
			cont = cont+1;
		} while (cont<10);
		System.out.println("Número de ceros: "+cont_num);
                System.out.println("Media de Impares: "+(sumi/conti));
                System.out.println("Media de Pares: "+(sump/contp));
    }
}
