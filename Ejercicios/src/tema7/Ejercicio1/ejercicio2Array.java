/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Ejercicio1;
import java.util.Scanner;
        
/**
 *
 * @author pietrodeocre
 */
public class ejercicio2Array {
    private static final int POS = 20;
    
     
    public static void main(String[] args) {
        int numeros[] = new int[POS];
        insertar(numeros);
        mostrar(numeros);
    }   
    
    public static void mostrar(int[] numeros) {
        int cont=0;
        for (int i=0; i<numeros.length; i++) {
            if(esPrimo(numeros[i])){
                System.out.println("El número " + numeros[i] + " es primo.");
                cont++;
            }
        }
        System.out.println("Hay un total de " + cont + " números primos.");      
    }
     
    private static boolean esPrimo(int numero){
        boolean esPrimo = true;
        for (int i=(numero-1); i>1; i--){
            
             if (numero%i==0){
                 esPrimo = false;
             }else return esPrimo = true;
            
        }
        return esPrimo;
    }
     
    public static void insertar(int[] numeros) {
		Scanner sc = new Scanner(System.in);
                int memoria;
                int cont = 0;
		for (int i=0; i<POS; i++) {
			System.out.println("Escribe un número: ");
                        memoria = 0;		
                        memoria = sc.nextInt();	
                        
                        if (esPrimo(memoria)){
                        numeros[cont] = memoria;   
                        cont++;
                        }
                        
		}
    }
}


