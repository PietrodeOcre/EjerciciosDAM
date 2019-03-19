/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Cinco {
    public static void gestionaEntrada()throws NumberFormatException{
        Scanner sc = new Scanner (System.in);
        int cad = Integer.parseInt(sc.nextLine());
        
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Escribe un número: ");
        //try{
            gestionaEntrada();
        //}catch(Exception e){
            //System.out.println("Error"+e.getMessage());
        //}
        
        
    }
}
