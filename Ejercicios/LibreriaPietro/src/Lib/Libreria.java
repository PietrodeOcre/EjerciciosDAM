/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.util.Scanner;


/**
 *
 * @author pietrodeocre
 */
public class Libreria {
    
    private static void raizDeN(int a){
        // Definimos que si a es menor o igual a 0 de error de lo contrario muesre la raiz
        System.out.print((a<=0)?"Error":"La raiz del número es "+Math.sqrt(a));
    }
    
    private static void multiYSumaDeTresNum (int a, int b, int c){
        //Definimos que si a es menor que 0 se multipliquen y si no se sumen
        System.out.print((a<0)?"El producto de dichos números es:"+(a*b*c):"La suma de dichos números es:"+(a+b+c));
    }
    
    private static void sumaImparesYPares(int a){
        //Desde el numero que digamos hasta 100 este método muestra la suma de los números pares
        //Y la suma de los números de los impares
        int b=0;
        int c=0;
        //Definimos el bucle
        while (a<100){
            //Aumentamos el contador hasta llegar a 100
            ++a;
            //Imprimirmos contador 
            System.out.println("Mostramos la cuenta: "+ a);
            if (a%2 == 0){
                //Si a es par lo sumamos en la variable b
                b+=a;
            }else{
                //Si a es impar lo sumamos en la variable c
                c+=a;
            }
        }
        //Imprimirmos la suma de numero pares y al de numeros impares
        System.out.println("Los números pares sumados: "+ b);
        System.out.println("Los números impares sumados: "+ c);
    }
    
    private static void tablaMultiplicarDeNumero(int num){
        //Muestra la tabla de multiplicar del número entregado pro el parámetro
        int a = 0;
        while (a<=10){
            System.out.println(num +" * "+ a +" = "+ (num*a));
            ++a;
        }
    }
    
    private static void numeroMayorDeTres(int a, int b, int c){
        //Definimos método para que indique cual de los tres numeros es mayor o si no hay diferencia
        System.out.println("El mayor entre "+a+", "+b+" y "+c+" es "+((a==b || a==c || b==c)?"no hay diferencia":((a>b && a>c)?a:(b>c && b>a)?b:c)));
    }
    
    private static void divisionEntreMenor(int a, int b){
        //Dados dos números se divide siemrpe el mayor entre el menor.
        System.out.println("La división del mayor entre el menor es "+ a +" y "+ b +" es "+((a==b)?1:((a>b)?(a/b):(b/a))));
    }
    
    private static void notaMediaDeNAlumnos(int alumnos, double nota1, double nota2){
        //Pregunta el número de alumnos y dos notas de cada uno
        int contador = 1;
	while (contador<=alumnos) {
            //Indica la media de las dos notas del alumno 
            System.out.println("La nota del alumno "+contador+" es "+((nota1*0.6)+(nota2*0.4)));
            ++contador;
        }
    }
    
    private static void parImparMasCuantos(int a){
        //Indica un número de 0 a 100
        //El método nos muestra desde ese número hasta 100 
        //Cual es par y cual impar
        //Finalmente indica cuantos números hay de cada tipo
        int b=0; 
        int c=0;
        while (a<100){
            //Aumentamos el contador
            ++a;
            if (a%2 == 0){
                System.out.println("Este número es par: "+ a);
                ++b;
            }else{
                System.out.println("Este número es impar: "+ a);
                ++c;
            }
        }
        System.out.println("Número total de números pares: "+ b);
        System.out.println("Número total de números impares: "+ c);
    }
    
    private static void mayorQue(int a, int b){
        //Indica cual es mayor de dos números
        if (a==b){
            System.out.println("Los números "+ a +" y "+ b +" son iguales");
        }else if (a>b){
            System.out.println("El "+ a +" es mayor");
        } else {
            System.out.println("El "+ b +" es mayor");
        }
    }
    
    private static void sumaPares(int a){
        //Indica la suma de numeros pares desde 0 hasta el número dado
        int b=0;
        int c=0;
        while(b<=a){
            if (b%2 == 0){
                c=c+b;
                 
            }
            ++b;
        }
        System.out.print("La suma de los números pares es: "+c);
    }
    
    
    
    
}
