/*
 * 1º Pedir por pantalla numero de filas y número de columnas
 * 2º crear matriz diciendo por teclado el número de filas y columnas, 
 * con las n filas y m columnas conteniendo números aleatorios e imprimirla.
 * 3º invertir matriz anterior según numero y filas que introduzcamos
 * por teclado
 * 4º imprimir la matríz final.
 * 5º Sumar filas de la matríz y crear una matriz ordenado de menor a mayor
 */
package tema7.HojaDos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioClase2 {
    
    public static int numF;
   
    public static int numC;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos el número de filas
        System.out.println("Escribe el número de filas: ");
        EjercicioClase2.numF = sc.nextInt();

        //Pedimos el número de columnas
        System.out.println("Escribe el número de columnas: ");
        EjercicioClase2.numC = sc.nextInt();

        //Creamos la matriz con los datos introducidos
        int matriz[][] = new int[numF][numC];

        System.out.print("\n");
        
        //Llenamos array
        llenado(matriz);

        //Mostramos la matriz inicial
        mostrar(matriz);

        //Creamos la matriz para ser invertida
        int matriz2[][] = invertir(matriz);

        System.out.print("\n");
        
        //Mostramos la matriz inicial
        mostrar(matriz2);
        
        System.out.print("\n");

        //Sumamos filas y creamos vector
        int array[] = sumarOrdenar(matriz);
        mostrarArray(array);
    }

    //Este método nos muestra la matriz
    private static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("-> " + matriz[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
    
    //Este método nos muestra el array
    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {          
                System.out.print("-> " + array[i] + " ");
        }
    }

    //Este Método llena el array de números aleatorios
    private static void llenado(int[][] matriz) {
        Random r = new Random();
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = r.nextInt(9) + 1;

            }
        }
    }

    //Este método llena el array de los números pero en posición invertida
    private static int[][] invertir(int[][] matriz) {
        int[][] matriz2 = new int[matriz.length][matriz[0].length];
        for (int x=0; x<matriz.length; x++) {
            int contC = 0;
            for (int y=(matriz[x].length)-1; y>=0; y--) {
                matriz2[x][contC] = matriz[x][y];
                contC++;
            }    
	}
        return matriz2;
    }

    //Sumaremos las filas y devolveremos un array con los resultados
    private static int[] sumarOrdenar(int[][] matriz) {
        int[] mem = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            mem[i]=0;
            for (int j = 0; j < matriz[i].length; j++) {
                mem[i] = mem[i] + matriz[i][j];
            }
        }

        return mem;
    }

}
