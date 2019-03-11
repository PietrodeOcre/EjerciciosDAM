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
public class EjercicioUno {
    
    public static int MultiplicacionEnteros (int primerNumero, int segundoNumero){
        if (segundoNumero == 1){
            return primerNumero;
        }else{
            return primerNumero+MultiplicacionEnteros(primerNumero, --segundoNumero);
        }
    }
    
    public static void main(String[]args){
        System.out.println(MultiplicacionEnteros(2, 5));
    }
}
