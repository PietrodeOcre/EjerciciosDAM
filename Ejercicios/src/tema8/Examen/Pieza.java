/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

import static java.lang.System.out;

/**
 *
 * @author pietrodeocre
 */
public class Pieza {
    public int tamanio;
    public static int precio=1;
    
    public Pieza(int tamanio, int precio) {
        this.tamanio = tamanio;
        this.precio = precio;
    }
    
    public static void imprimeInfo(){
        System.out.println("El precio es "+(precio*2.15));
    }
}
