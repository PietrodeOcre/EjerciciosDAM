/*
 * Juego de tres en raya
 * Ususrio introduce fila y columan en ese orden 2_2
 * Introducir X a jugador1 y 0 a jugador2
 * Comprobar en cada jugada si hay tres en raya.
 * Si no hay tres en raya del jugador1 cambia de turno y pasa a jugador2
 * Mostrar actualización en cada jugada
 * Si se gana indicer que el jugador de dicho turno ha ganado
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class TresEnRaya {
    
    //Creamos el tablero
    //private static String[][] tablero = new String[3][3];
    
    public static void main(String[] args){
        //Memorizamos la posicion elegida por el jugador que corresponda
        int[] num = new int[1];
        
        //Creamos el tablero
        String[][] tablero = new String[3][3];
        
        //Mostramos descripción y las normas del juego
        System.out.println("Este es el juego del 3 en raya.");
        System.out.println("Escribe un número del 0 al 2 para la fila e igual para la columna (en ese orden) separado por un espacio");
        
        //Pedimos la posicion
        num = pedirPos();
        
        tableroPos(tablero,num[0],num[1]);
        
        //Mostramos el tablero
        mostrar(tablero);
        
        
    }
    
    private static int[] pedirPos(){
        
        int[] num = new int[2];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la fila y la columna: ");
        String movimiento = sc.nextLine();
        
        if((Integer.parseInt(movimiento.substring(0,1)) == 0) || 
                    (Integer.parseInt(movimiento.substring(0,1)) == 1) || 
                    (Integer.parseInt(movimiento.substring(0,1)) == 2) && 
                    (Integer.parseInt(movimiento.substring(2)) == 0) || 
                    (Integer.parseInt(movimiento.substring(2)) == 1) ||
                    (Integer.parseInt(movimiento.substring(2)) == 2) &&
                    (movimiento.substring(1, 1).equals(" "))
                    ){
                num[0] = Integer.parseInt(movimiento.substring(0,1));
                num[1] = Integer.parseInt(movimiento.substring(2));
                return num;
            }else{
                System.out.println("Escribe un número del 0 al 2 para la fila e igual para la columna (en ese orden) separado por un espacio");
            }
   
        return num;
  
    }
    
    private static String[][] tableroPos(String[][] tablero, int num1, int num2){
        
        tablero[num1][num2] = "0";
        
        return tablero;
    }
    
    
    public static void mostrar(String[][] tablero){
        System.out.println("");
        for (int i=0; i<tablero.length; i++){
            for (int j=0;j<tablero[i].length; j++){
                System.out.print("|"+tablero[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
