/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Fruteria;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Fruteria {
    Naranja[] naranja = null;
    Platano[] platano = null;
    Tomate[] tomate = null;

    public Fruteria(Tomate[] tomate, Naranja[] najarna, Platano[] platano) {
        super();
        this.tomate = new Tomate[10];
        this.naranja = new Naranja[7];
        this.platano = new Platano[4];
    }
    
    public void imprimeFrutas(){
        if (tomate != null && platano != null && naranja !=null){
            
            for (int i = 0; i < tomate.length; i++) {
                if(tomate[i]!=null){
                    Arrays.sort(tomate);
                    System.out.println("Tomates: ");
                    System.out.println(tomate[i].getIdentificador() + " " + tomate[i].getNombre() + " "+ tomate[i].getTextura());
                    
                    
                }
            }
            
            for (int i = 0; i < naranja.length; i++) {
                if(naranja[i]!=null){
                    Arrays.sort(naranja);
                    System.out.println("Naranjas: ");
                    System.out.println(naranja[i].getIdentificador() + " " + naranja[i].getNombre() + " "+ naranja[i].getColor() + " " + naranja[i].getTamanio());
                }
            }
            
            for (int i = 0; i < platano.length; i++) {
                if(platano[i]!= null){
                    Arrays.sort(platano);
                    System.out.println("Platanos: ");
                    System.out.println(platano[i].getIdentificador() + " " + platano[i].getNombre() + " "+ platano[i].getTamanio());
                }
            }
        }
    }
    
}
