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
public class llamandoMetodos1 {
    
//public static int i=0;
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		/*do {
			int numero = sc.nextInt();

			System.out.println("El numero " +
					numero + (esMultipleDe3(numero)?"es":"no es")+
					" multiplo de 3");			
			System.out.println();
			i++;
		}while (i<5);*/
		i=0;
		do {
			int numero = sc.nextInt();

			System.out.println("La calificacion es "
					+devuelveCadenaSuspenso(numero));
			System.out.println("El numero " +
					numero +(esNegativo(numero)? " es ":" no es ")+
					"negativo"); 
			i++;
		}while (i<5);
		
		
		int iz=1;
		
		for(iz=1; iz<=10; iz++) {
			tablaNumero(iz);
		}
	}
	public static boolean esMultipleDe3(int numero) {
		
			return numero%3==0;
	}
	public static void tablaNumero(int numero) {
		int j;
		
		for(j=0; j<=10; j++) {
			System.out.println(numero+"*"+j+ "="+(numero*j));
			return;
		}
		
	}
	public static String devuelveCadenaSuspenso
	(int numero) {
		
		return numero<5?"Suspenso":"Aprobado";
	}
	public static boolean esNegativo(int numero) {
		
		return numero < 0;
	}
}
