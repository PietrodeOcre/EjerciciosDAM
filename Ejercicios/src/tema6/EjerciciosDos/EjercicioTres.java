/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjerciciosDos;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioTres {
    public static int euclides(int n, int m){
        if (m==0) {
            return n;
        }else{    
            return euclides(m,n%m);
        }
    }
    
    public static void main (String[]args){
        System.out.println(euclides(2,56));
    }
}
