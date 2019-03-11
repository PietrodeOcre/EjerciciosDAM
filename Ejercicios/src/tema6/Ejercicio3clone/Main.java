/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio3clone;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[]args){
        
        Pez pez1 = new Pez();
            
        pez1.setNombre("Pez Globo");
            
        Pez pez2 = null;
            
        try {    
            pez2 = (Pez) pez1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        pez2.setNombre("Pez Toro");
        
        System.out.println(pez1);
        
        
        System.out.println(pez1.equals(pez2));
        
        
        System.out.println(pez2);
        
        pez2.setNombre("Pez Globo");
        
        System.out.println(pez1.equals(pez2));
        System.out.println(pez2);
        
        
        Pez pez3 = new Pez("Nemo");
        
        
        
        System.out.println(pez3.equals(pez2));
        System.out.println(pez3);
        
        
        /*int numero = 6;
        suma(numero);
        System.out.println(numero);*/
        
        Pez pececito =  new Pez();
        Pez pececito2 =  new Pez();
        pececito.setNombre("Pez1");
        suma(pececito, pececito2);
        System.out.println(pececito);
        System.out.println(pececito2);
    }

    public static void suma(/*int numero1*/Pez p1, Pez p2){
        /*numero1 = numero1 + 5;*/
        p1.setNombre("Pez1");
        p2.setNombre("Pez2");
    }
    
}
