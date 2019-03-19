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
public class Dos {
    public static void main(String[] args) {
        String cad="c-3p0";
        try{
            gestionaPalabra(cad);
        }catch(Exception e){
            System.out.println("r2-d2");
        }finally{
            System.out.println("Leia Organa");
        }
        System.out.println("Darth Vader");
    }
    public static void gestionaPalabra(String cadena) throws IndexOutOfBoundsException{
        System.out.println(cadena.charAt(cadena.length()));
    }
}
