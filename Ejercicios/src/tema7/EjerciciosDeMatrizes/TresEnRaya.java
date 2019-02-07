/*
 * Juego de tres en raya
 * Ususrio introduce fila y columan en ese orden 2_2
 * Introducir X a jugador1 y 0 a jugador2
 * Comprobar en cada jugada si hay tres en raya.
 * Si no hay tres en raya del jugador1 cambia de turno y pasa a jugador2
 * Mostrar actualización en cada jugada
 * Si se gana indicar que el jugador de dicho turno ha ganado
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
        String[][] tablero = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        
        
        System.out.println("3 en raya.");
        //Mostramos el tablero
        mostrar(tablero);
        
        //Mostramos descripción y las normas del juego
        System.out.println("Escribe un número del 0 al 2 para la fila e igual para \n"
                + "la columna (en ese orden) separado por un espacio");
        
        //Pedimos la posicion
        num = pedirPos();
        
        //Poner simbolo en tabla, indicamos el numero de jugador para marcar 0 o X
        tableroPos(tablero,num[0],num[1],1);
        
         //Pedimos la posicion
        num = pedirPos();
        
        //Poner simbolo en tabla, indicamos el numero de jugador para marcar 0 o X
        tableroPos(tablero,num[0],num[1],1);
        
         //Pedimos la posicion
        num = pedirPos();
        
        //Poner simbolo en tabla, indicamos el numero de jugador para marcar 0 o X
        tableroPos(tablero,num[0],num[1],1);
        
        //Mostramos el tablero
        mostrar(tablero);
        
        ganador(tablero,"0");
    } 
     
    //Devuelve un vector con la posición en la que queremos poner el símbolo
    private static int[] pedirPos(){
        
        //Usamos un vector para almacenar 
        int[] num = new int[2];
        Scanner sc = new Scanner(System.in);
        //En estas variables ponemos una copia del resultado para comprobar 
        //que se mete por teclado el dato correcto
        int num1=0;
        int num2=0;
        System.out.println("Escribe la fila y la columna: ");
        String movimiento = sc.nextLine();
        
        //Pasamos a número las posiciones del String con el que pedimos
        //los datos
        try{
        num1 = Integer.parseInt(movimiento.substring(0,1));
        num2 = Integer.parseInt(movimiento.substring(2));
        }catch (NumberFormatException e){
            System.out.println("Escribe un número del 0 al 2 para la fila e igual para \n"
                + "la columna (en ese orden) separado por un espacio");
        }
    
        //Comprobamos que los datos están dentro del rango de nuestra matriz
        if((num1 != 0) || 
                    (num1 != 1) || 
                    (num1 != 2) && 
                    (num2 != 0) || 
                    (num2 != 1) ||
                    (num2 != 2) &&
                    (!movimiento.substring(1, 1).equals(" "))
                    ){
                //Si lo estan asignamos al vector las coordenadas para el tablero
                num[0] = num1;
                num[1] = num2;
                
            }else{
                //Si no mostramos un error para poder volver a preguntar 
                System.out.println("Escribe un número del 0 al 2 para la fila e igual para la columna (en ese orden) separado por un espacio");
            }

        //Finalmente devolvemos un vector con las coordenadas
        return num;
        /*
        En este método reptendía realizar una comprobación, de manera
        que si se introduce una letra en lugar de un número muestre un error
        y repita la pregunta pero pr mucho que he intentado no lo he conseguido
        entiendo que debe ser con un try/catch pero no he sabido hacerlo 
        funcionar correctamente.
        */
    }
    
    //Introducimos símbolo en el tablero
    private static String[][] tableroPos(String[][] tablero, int num1, int num2, int jugador){
        
        //Comprobamos que la posición no está ocupada
        //Si es falso no asigna el símbolo
        if(compruebaPos(tablero, num1, num2)){
            //Segun el número de jugador apuntamos un 0 o una X
            tablero[num1][num2] = ((jugador == 1)?"0":"X");
        }

        return tablero;
    }
    
    //Mostramos el tablero completo
    public static void mostrar(String[][] tablero){
        
        for (int i=0; i<tablero.length; i++){
            System.out.print("|");
            for (int j=0;j<tablero[i].length; j++){
                System.out.print(tablero[i][j]+"|");
            }
            System.out.println("");
        }
    }
    
    //Comprobamos si la posicion está ocupada
    private static boolean compruebaPos(String[][] tablero, int num1, int num2){
        //Si dentro de la posición existe una X o un 0
        if (tablero[num1][num2] == "X" || tablero[num1][num2]=="0"){
            //Devuelve falso
            return false;
        }
        //De lo contrario verdadero
        return true;
    }
    
    //Comprobamos si existe ya un ganador
    private static boolean compruebaPosicion(String[][] tablero, int num1, int num2, String sig){

        if (tablero[num1][num2]==sig){
            return true;
        }
        return false;
    }
    
    private static void ganador(String[][] tablero, String turno){

        boolean[] ganador = new boolean[9];

            ganador[0] = ((fila(tablero,0,turno))?true:false);
            ganador[1] = ((fila(tablero,1,turno))?true:false);
            ganador[2] = ((fila(tablero,2,turno))?true:false);
        
            ganador[3] = ((columna(tablero,0,turno))?true:false);
            ganador[4] = ((columna(tablero,1,turno))?true:false);
            ganador[5] = ((columna(tablero,2,turno))?true:false);
        
        if ((compruebaPosicion(tablero,0,0,turno)) &&
                (compruebaPosicion(tablero,1,1,turno)) &&
                (compruebaPosicion(tablero,2,2,turno))
                ){
            ganador[6] = true;
        }else{
            ganador[6] = false;
        }
        
        if ((compruebaPosicion(tablero,0,2,turno)) &&
                (compruebaPosicion(tablero,1,1,turno)) &&
                (compruebaPosicion(tablero,2,0,turno))
                ){
            ganador[7] = true;
        }else{
            ganador[7] = false;
        }
        
        for(int y=0; y<9; y++){
            //System.out.println("Ganador!");
            if(ganador[y]){
                System.out.println("Ganador!");
            }
        }
    }
    
    private static boolean fila(String[][] tablero, int num, String sig){
        boolean verdadero = false;
        for(int j=0; j<2; j++){
            verdadero = compruebaPosicion(tablero,j,num,sig);
        }
        return verdadero;
    }
    
    private static boolean columna(String[][] tablero, int num, String sig){
        boolean verdadero = false;
        for(int j=0; j<2; j++){
            verdadero = compruebaPosicion(tablero,num,j,sig);
        }
        return verdadero;
    }
}
