/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjerciciosDos;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioCuatro {
    public static boolean  esImpar(int numero){
        if (numero == 0){
            return false;
        }else {
            return esPar(--numero);
        }
    }
    
    public static boolean  esPar(int numero){
        if (numero == 0){
            return true;
        }else {
            return esImpar(--numero);
        }
    }
    
    public static void main (String[]args){
        System.out.println(esPar(7));
        System.out.println(esImpar(7));
    }
}
