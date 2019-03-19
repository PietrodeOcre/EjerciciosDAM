/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

import static tema8.Examen.Pieza.precio;

/**
 *
 * @author pietrodeocre
 */
public class PiezaAmarillo extends Pieza{
    public static int longitud;
    public static int id;

    public PiezaAmarillo(int longitud, int id, int tamanio, int precio) {
        super(tamanio, precio);
        this.longitud = longitud;
        this.id = id;
    }
    
    public static void imprimeInfo(){
        System.out.println("El precio es "+(precio*2.15));
        System.out.println("El longitud es "+longitud);
        System.out.println("El id es "+id);
    }
}
