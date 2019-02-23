/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

/**
 *
 * @author pietrodeocre
 */
public class dieciocho {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int cont, num;
        //Asignamos valores a variables
        cont=0;
        num=1;
        //Definimos bucle
        while(cont<10){
            cont++;
            if (cont%2!=0){
                num*=cont;
                System.out.print((cont!=9)?cont+"*":cont);
            }
        }
        System.out.println("="+num);
    }
}
