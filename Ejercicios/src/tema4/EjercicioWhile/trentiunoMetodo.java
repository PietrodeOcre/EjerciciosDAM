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
public class trentiunoMetodo {

    /**
     * @param args the command line arguments
     */
    private static int secuencia, sumador, es;
    private static boolean primo;
    
    public static void main(String[] args) {
        // Objeto teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int cuentaHasta = sc.nextInt();
        //Definimos variables 
        secuencia=1;
        //Comenzamos iteración
        while(secuencia<=cuentaHasta){
            sumador=0;//aquí guardamos por cuantos números es divisible el número iterado
            esPrimo(secuencia);
            if (primo==true){
                ++es;
            } 
            ++secuencia;//Aumentamos la secuencia para pasar al siguiente número
            System.out.println(secuencia + " " +primo);
        }
        System.out.println("Los números primos son: "+es);
    }  
    
    public static boolean esPrimo(int secuencia){
        for (int division=1; division<=secuencia; division++){
            if (secuencia%division==0){
                    ++sumador;//Si el numero es divisible por 0 se suma aqui
            }
        } 
        if(sumador!=2){
            primo=false;//Si el numero solo es divisible 2 veces es por que es primo
            //Se divide por 1 y por el mismo, es decir 2 veces.
            //System.out.println(secuencia);
        }else {
            primo=true;
        }
        return primo;
    }
    
}


