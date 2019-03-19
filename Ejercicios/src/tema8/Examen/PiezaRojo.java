/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

/**
 *
 * @author pietrodeocre
 */
public class PiezaRojo extends Pieza{
    public static int espesor;
    public static int grosor;

    public PiezaRojo(int espesor, int grosor, int tamanio, int precio) {
        super(tamanio, precio);
        this.espesor = espesor;
        this.grosor = grosor;
    }
    
    public static void imprimeInfo(){
        System.out.println("El precio es "+(precio*2.15));
        System.out.println("El grosor es "+grosor);
        System.out.println("El espesor es "+espesor);
    }
}
