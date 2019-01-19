/*
 * Crea dos arrays de números con un tamaño pasado por teclado.
 * Uno de ellos estará rellenado con números aleatorios(del 1 al 1000) 
 * y el otro apuntara al array anterior(misma referencia). Después crea un nuevo 
 * array que contendrá los mismos valores que el primer array y diferente 
 * referencias.
 * El método nextInt(int n) devuelve un valor entre 0 y n, excluido n.
 */
package tema7.Ejercicios2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio2 {
    
    //Creamos los Arrays
    private static int[] numero1 = new int[1000];
    
    private static int[] numero2 = numero1;
    
    private static int[] numero3 = numero1.clone();
    
    
    public static void main(String[]args){
        
        //Llenamos de valores el array 1, como el 3 no tiene las mismas 
        //referencias tenemos que llenarlo también;
        insertar(numero1);
        insertar(numero3);
        
        //Mostramos los tres arrays 
        mostrar(numero1);
        mostrar(numero2);
        mostrar(numero3);
    }
    
    /*
    Con este método generamos los números aleatorios y recorremos 
    el array para insertar los valores 
    */
    public static void insertar(int[] numeros) {
		Scanner sc = new Scanner(System.in);
                for (int i=0; i<numeros.length; i++) {
			Random r = new Random();
                        numeros[i] = r.nextInt(6)+1;
		}
    }
    
    /*
    Con este método mostramos n valores del array, el valor de n lo 
    introducimos por teclado, también muestra al final el numero de 
    valores mostrados, que será según el enunciado n-1
    */
    public static void mostrar(int[] numero1) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        System.out.println("Escriba un número de valores a mostrar entre 0 y 1000: ");
        int valor = sc.nextInt();
        for (int i=0; i<(valor-1); i++) {
            
                System.out.println("El número: " + numero1[i]);
                cont++;
            
        }
        System.out.println("Hay un total de " + cont + " números.");      
    }
}
