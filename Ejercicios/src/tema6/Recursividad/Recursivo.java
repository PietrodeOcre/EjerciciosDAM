/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Recursividad;

/**
 *
 * @author pietrodeocre
 */
public class Recursivo {
    
    public static int potencia (int base, int exp){
        if (exp==1){
            return base;
        }else{
            return base*potencia(base, --exp);
        }
    }
    
    //Método recursivo que realiza el factorial de un número
    public static int factorial (int numero){
        if (numero==1){
            return 1;
            
        }else {
            return numero*factorial(--numero);
        }
    }
    
    //Método recursivo que realiza la suma de todos los números hasta n
    public static int sumaHastaN (int n){
        if (n==0){
            return 0;
        }else{
            return n+sumaHastaN(--n);
        }
    }
    
    public static void main(String [] args){
        System.out.println(potencia(2,3));
        System.out.println(factorial(3));
        System.out.println(sumaHastaN(69));
    }
}
