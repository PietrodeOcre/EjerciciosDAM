package tema8.Fruteria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        this.tomate = tomate;
        this.naranja = najarna;
        this.platano = platano;
    }
    
    public void imprimeFrutas(){
        if (tomate != null && platano != null && naranja !=null){
            System.out.println("Tomates: ");
            for (int i = 0; i < tomate.length; i++) {
                if(tomate[i]!=null){
                    Arrays.sort(tomate);
                    
                    System.out.println(tomate[i].getIdentificador() + " " + tomate[i].getNombre() + " "+ tomate[i].getTextura());
                    
                    
                }
            }
            System.out.println("Naranjas: ");
            for (int i = 0; i < naranja.length; i++) {
                if(naranja[i]!=null){
                    Arrays.sort(naranja);
                   
                    System.out.println(naranja[i].getIdentificador() + " " + naranja[i].getNombre() + " "+ naranja[i].getColor() + " " + naranja[i].getTamanio());
                }
            }
            System.out.println("Platanos: ");
            for (int i = 0; i < platano.length; i++) {
                if(platano[i]!= null){
                    Arrays.sort(platano);
                    
                    System.out.println(platano[i].getIdentificador() + " " + platano[i].getNombre() + " "+ platano[i].getTamanio());
                }
            }
        }
    }
    
    public static int suma(int f, int g){
        return f+g;
    }
    
}
