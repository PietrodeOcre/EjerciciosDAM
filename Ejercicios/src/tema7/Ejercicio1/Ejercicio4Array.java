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
public class Ejercicio4Array {
    
    private static final int POS = 20;

    public static void main (String[] args){
        char[] vector = {'a', 'b', 'c'};
    }
    
    private static void vectorChar(char[] vector){
        int contador = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i<POS){
            String cadena = sc.nextLine();
            try {
                Integer entero = Integer.parseInt(cadena.substring(0, 1));
                /*numero[contador] = entero;
                contador = contador+2;
                if (contador>=POS){
                    break;
                }
                
                i++;*/
            } catch (NumberFormatException e) {
                vector[contador] = cadena.charAt(0);
                contador = contador+2;
                if (contador>=POS){
                    break;
                }
                
                i++;
            }
        }}}
