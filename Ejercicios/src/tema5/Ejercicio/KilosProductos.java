/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;

/**
 *
 * @author pietrodeocre
 */
public class KilosProductos {
    public static int kilosPapa, kilosChocos;
    
    public int damePapas(int kilosPapa){
        return kilosPapa*3;
    }
    public int dameChocos(int kilosChocos){
        return (kilosChocos*2)*3;
    }
    public void masPapas(int mas){
        kilosPapa = kilosPapa+mas;
    }
    public void masChocos(int mas){
        kilosChocos = kilosChocos+mas;
    }
    public void showPapas(){
        System.out.println("Actualmente hay "+ kilosPapa + " kilos de Papas");
    }
    public void showChocos(){
        System.out.println("Actualmente hay "+ kilosChocos + " kilos de Chocos");
    }
    public void getComensales(){
        System.out.println("El número máximo de comensales es "+ dameChocos(kilosChocos));
    }
    
}
