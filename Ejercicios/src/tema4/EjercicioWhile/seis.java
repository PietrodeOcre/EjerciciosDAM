/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *  Implemente un algoritmo que reciba dos números 
 * enteros por la entrada estándar y calcule 
 * la función exponente (el primer número será 
 * la base y el segundo el exponente). 
 * @author pietrodeocre
 */
public class seis {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerouno, numerodos, resultado = 0;
        System.out.print("Introduce la base número: ");
        numerouno = sc.nextInt();
        System.out.print("Introduce el exponente número: ");
        numerodos = sc.nextInt();
        for (byte i=0; i<numerodos; i++){
            if (i==0){
                resultado = numerouno;
            } else{
                resultado=resultado*numerouno;
            }
            
        }
        System.out.println("El resultado es: "+resultado);
        
    }
}
