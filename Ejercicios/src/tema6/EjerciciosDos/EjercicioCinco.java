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
public class EjercicioCinco {
    public static int sumaDosDigitos(int numero){
        if (numero == 0){
            return numero;
        }else{
            return sumaDosDigitos(numero/10)+(numero%10);
        }
    }
    
    public static void main (String[]args){
        System.out.println(sumaDosDigitos(88));
    }
}
