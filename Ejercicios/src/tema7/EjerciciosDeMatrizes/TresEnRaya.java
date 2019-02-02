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
    public static void main(String[] args){
        String[][] tablero = new String[3][3];
        
        
        System.out.println("Este es el juego del 3 en raya.");
        System.out.println("Escribe la fila y la columna (en ese orden) separado por un espacio");
        
        System.out.println(Arrays.toString(tablero));
        
    }
    
    public static void jugador1(String[][] tablero, String jugador){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la fila y la columna: ");
        String movimiento = sc.nextLine();
        int num1 = 0, num2 = 0;
        if ((movimiento.charAt(1)) == ' '){
            if (movimiento.charAt(0) < 0 && movimiento.charAt(0) > 2){
                num1 = Integer.valueOf(movimiento.charAt(0));
            }
            if (movimiento.charAt(0) < 0 && movimiento.charAt(0) > 2){
                num2 = Integer.valueOf(movimiento.charAt(2));
            }
        }
        
        if (jugador.equals("1")){
            tablero[num1][num2] = "0";
        }else{
             tablero[num1][num2] = "X";
        }
        
        
    }
    
    
    
    public static void comprueba(String[][] tablero){
        
    }
}
