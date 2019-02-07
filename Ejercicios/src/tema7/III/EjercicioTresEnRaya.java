/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.III;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioTresEnRaya {
    
    static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[]args){
        jugar();
    }
    
    //En este método inicializamos variables 
    private static void jugar(){
        //Ficha de jugador 1
        String j1="X";
        //Ficha de jugador 2
        String j2="0";
        //Casilla vacia
        String vacio="-";
        
        //Turno de jugadores
        boolean turno= true;
        
        //Creamos el tablero
        String[][] tablero = new String[3][3];
        
        //Metodo para llenar el tablero de vacios
        llenarTablero(tablero, vacio);
        
        //Validamos al posición del tablero
        boolean validarPosicion, stop;
        
        //Coordenadas
        int[] num = new int[2];
        int fila, columna;
        
        System.out.println("Juego de 3 en raya");
        
        System.out.println("Escribe un número del 0 al 2 para la fila \n "
                        + "e igual para la columna (en ese orden) separado por un espacio");
        
        //Bucle de juego
        while(!finPartida(tablero, vacio)){

            do{

                //Mostrar a que jugador le toca
                turnoActual(turno);
            
                //Mostramos el tablero 
                mostrar(tablero);
            
                stop = false;
                
                //Pedimos el primer número la fila y columna
                pedirNumero(num,"Escribe las coordenadas: ");

                fila=num[0];
                columna=num[1];

                //Compruena si está llena la posicion
                validarPosicion = validarPos(tablero, fila, columna);

                //Si está llena
                if(validarPosicion){

                    if (!hayValor(tablero, fila, columna, vacio)){
                        stop = true;
                    }else{
                        System.out.println("Ya esta ocupada esa casilla!");
                    }
                    
                }else{
                    System.out.println("No es válida la posición.");
                }
            
            //Mientras Stop sea diferente de true se repite el bucle
            }while(!stop);
            
            
            //Con este if metemos el valor despues de 
            //validado en la casilla correspondiente
            if (turno){
                meterValor(tablero, fila, columna, j1);
            }else{
                meterValor(tablero, fila, columna, j2);
            }
            
            //Cambiar turno
            turno = !turno;

        }
        
        //Mostramos el tablero 
        mostrar(tablero);
        
        mostrarGanador(tablero, j1, j2, vacio);
        
    }
    
    //Introducimos el valor en el tablero
    private static void meterValor(String[][] tablero, int fila, int columna, String simbolo){
        tablero[fila][columna]=simbolo;
    }
    
    //Este metodo nos pide un string que muestra antes de pedir un número
    private static int[] pedirNumero(int[] num,String mensaje){

        //mostramos el mensaje
        System.out.println(mensaje);
        
        //Pedimos un string con este formato "n n"
        String movimiento = sc.nextLine();

        /*Con este Try conseguimos devolver un valor diferente si metemos letras
        En lugar de saltar un error devuelve el vector {7,7} y un mensaje de error
        Con lo cual el programa no salta de turno y no llena ninguna 
        Posicion del tablero*/
        try{
            //Inicializamos las variables para comprobar que son números entre 0 y 2
            int num1;
            int num2;
            
            //Convertimos a numerica la posicion del String
            num1=Integer.parseInt(movimiento.substring(0,1));
            num2=Integer.parseInt(movimiento.substring(2));
        
        
            //Comprobamos que los datos están dentro del rango de nuestra matriz
            if((num1 != 0) || 
                    (num1 != 1) || 
                    (num1 != 2) && 
                    (num2 != 0) || 
                    (num2 != 1) ||
                    (num2 != 2) &&
                    (!movimiento.substring(1, 1).equals(" "))
                    ){
                
                    //Pasamos a número las posiciones del String con el que pedimos
                    //los datos
                    num[0] = num1;
                    num[1] = num2;

            }

            //Retornamos el número correcto
            return num;

        }catch(NumberFormatException e){
            //Mostramos un error si se introducen letras
            System.out.println("Error");
            
            //Cambiamos el valor del vector para que no salte turno
            num[0]=7;
            num[1]=7;
            //Devolvemos un valor que sabemos que no muestra nada en la tabla 
            //Cuando existe un error y ahorramos la excepción al introducir letras
            return  num;
        }

    }
    
    //Este método devuelve true si la posición contiene un valor que no sea "-"
    private static boolean hayValor(String[][] tablero, int fila , int columna, String simbolo){
        
        if (tablero[fila][columna] != simbolo){
            return true;
        }
        
        return false;
    }
    
    //Este muestra un mensaje cada vez que cambiamos de turno
    private static void turnoActual(boolean turno){
        
        //Indicamos que si el turno es true le toca al jugador 1
        if (turno) {
            System.out.println("Le toca al jugador 1");
        }else{
            //De lo contrario al jugador 2
            System.out.println("Le toca al jugador 2");
        }
        
    }
    
    //Llenamos el tablero al principio de espacios vacios
    private static void llenarTablero(String[][] tablero, String simbolo){
        //Recorremos las filas
        for (int i=0; i<tablero.length; i++){
            //Recorremos las columnas 
            for (int j=0; j< tablero.length; j++){
                //Definimos como simbolo cada una de las posiciones del tablero
                tablero[i][j]=simbolo;
            }
            
        }
    }
    
    //Comprobamos y ya existe un valor en la posición que queremos guardar
    private static boolean validarPos(String[][] tablero, int fila, int columna){
        //Devuelve true si encuentra un valor entre 0 y 2
        return fila>=0 && fila<tablero.length && columna>=0 && columna<tablero.length;
    }
    
    
    //Comprobamos si hay ganador 
    private static boolean finPartida(String[][] tablero, String simbolo){
        
        if(tableroLleno(tablero, simbolo) ||
                comprobarFila(tablero, simbolo) !=simbolo ||
                comprobarColumna(tablero, simbolo) !=simbolo ||
                comprobarDiagonal1(tablero, simbolo) !=simbolo ||
                comprobarDiagonal2(tablero, simbolo) !=simbolo        
                ){
            return true;
        }
        
        return false;
    }
    
    //Comprobamos las tres filas horizontales
    private static String comprobarFila(String[][] tablero, String simbolo){
        for (int i = 0; i < tablero.length; i++) {
            //Si alguna de las posiciones es un guion devuelve false
            if (tablero[i][i].equals("-") || tablero[i][i+1].equals("-") || tablero[i][i+2].equals("-")){
                return "-";
            }
            //Si los tres simbolos son iguales y ninguno es un guión devuelve true
            if (tablero[i][i].equals(tablero[i][i+1]) && tablero[i][i].equals(tablero[i][i+2])){
                return tablero[i][i];
            }
        }
        return "-";
    }
    
    //COmprobamos las tres filas verticales
    private static String comprobarColumna(String[][] tablero, String simbolo){
        for (int i = 0; i < tablero.length; i++) {
            //Si alguna de las posiciones es un guion devuelve false
            if (tablero[i][i].equals("-") || tablero[i+1][i].equals("-") || tablero[i+2][i].equals("-")){
                return "-";
            }
            //Si los tres simbolos son iguales y ninguno es un guión devuelve true
            if (tablero[i][i].equals(tablero[i+1][i]) && tablero[i][i].equals(tablero[i+2][i])){
                return tablero[i][i];
            }
        }
        return "-";
    }
    
    //Comprobamos la primera diagonal
    private static String comprobarDiagonal1(String[][] tablero, String simbolo){
        //Si alguna de las posiciones es un guion devuelve false
        if (tablero[0][0].equals("-") || tablero[1][1].equals("-") || tablero[2][2].equals("-")){
            return "-";
        }
        //Si los tres simbolos son iguales y ninguno es un guión devuelve true
        if (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2])){
            return tablero[0][0];
        }
        return "-";
    }
    
    //Comprobamos la segunda diagonal
    private static String comprobarDiagonal2(String[][] tablero, String simbolo){
        //Si alguna de las posiciones es un guion devuelve false
        if (tablero[2][0].equals("-") || tablero[1][1].equals("-") || tablero[0][2].equals("-")){
            return "-";
        }
        //Si los tres simbolos son iguales y ninguno es un guión devuelve true
        if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals(tablero[0][2])){
            return tablero[2][0];
        }
        return "-";
    }
    
    //Comprobamos que no se hayan llenado todos los huecos del tablero
    private static boolean tableroLleno(String[][] tablero, String simboloDef){
        //Recorremos todo el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                //Si todos tienen simbolo por defecto devuelve false
                if(tablero[i][j].equals(simboloDef)){
                    return false;
                }
            }
        }
        return true;
    }
    
    //Mostramos el tablero completo
    public static void mostrar(String[][] tablero){
        //Recorremos las filas
        for (int i=0; i<tablero.length; i++){
            //Recorremos las columnas
            for (int j=0;j<tablero[i].length; j++){
                //Mostramos la posicion del tablero
                System.out.print(tablero[i][j]+" ");
            }
            //Dejamos un salto de linea para mostrar de tres en tres todo el tablero
            System.out.println("");
        }
    }
    
    //Mostraremos el ganador
    private static void mostrarGanador(String[][] tablero, String j1, String j2,String def){
        
        String simbolo = comprobarFila(tablero,def);
        
        if(simbolo!=def){
            if (simbolo == j1) {
                System.out.println("Ha ganado el jugador 1!");
            }else{
                System.out.println("Ha ganado el jugador 2!"); 
            }
        }
        
        simbolo = comprobarColumna(tablero,def);
        
        if(simbolo!=def){
            if (simbolo == j1) {
                System.out.println("Ha ganado el jugador 1!");
            }else{
                System.out.println("Ha ganado el jugador 2!"); 
            }
        }
        
        simbolo = comprobarDiagonal1(tablero,def);
        
        if(simbolo!=def){
            if (simbolo == j1) {
                System.out.println("Ha ganado el jugador 1!");
            }else{
                System.out.println("Ha ganado el jugador 2!"); 
            }
        }
        
        simbolo = comprobarDiagonal2(tablero,def);
        
        if(simbolo!=def){
            if (simbolo == j1) {
                System.out.println("Ha ganado el jugador 1!");
            }else{
                System.out.println("Ha ganado el jugador 2!"); 
            }
        }
        
    }
}
