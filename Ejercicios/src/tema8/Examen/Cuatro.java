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
public class Cuatro {
    public static void main(String[] args) {
        String galileo=null;
        try{
            gestionaCientifico(galileo);
        }catch(Error e){
            System.out.println("Leonardo Da Vinci");
        }catch(Exception ex){
            System.out.println("Galileo");
        }finally{
            System.out.println("Nikola Tesla");
        }
        System.out.println("Stephen Hawking");
    }
    public static void gestionaCientifico(String cadena){
        if (cadena.charAt(0)=='C'){
            System.out.println("Copernico");
        }else{
            System.out.println("Isaac Newton");
        }
    }
}
