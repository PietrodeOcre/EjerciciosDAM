/*
 * Programa que nos va a decir el número de números
 * primos que existen entre 1 y el número N introducido
 * por teclado.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class trentiuno {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int cuentaHasta = sc.nextInt();
        //Definimos variables
        int secuencia, primo;
        secuencia=1;
        primo=0;
        //Comenzamos iteración
        while(secuencia<=cuentaHasta){
            int sumador=0;//aquí guardamos por cuantos números es divisible el número iterado
            for (int division=1; division<=secuencia; division++){
                if (secuencia%division==0){
                    ++sumador;//Si el numero es divisible por 0 se suma aqui
                }
            }
            if (sumador==2){
                primo++;//Si el numero solo es divisible 2 veces es por que es primo
                //Se divide por 1 y por el mismo, es decir 2 veces.
                //System.out.println(secuencia);
            }
            ++secuencia;//Aumentamos la secuencia para pasar al siguiente número
        }
        System.out.println("Los números primos son: "+primo);
    }   
}
