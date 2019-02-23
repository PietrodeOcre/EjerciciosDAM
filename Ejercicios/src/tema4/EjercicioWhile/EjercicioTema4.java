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
public class EjercicioTema4 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos contador
        int i=0;
        while (i<100) {
            if(i==74) break;
            if(i%9!=0) continue;
            System.out.println(i);
            i = i + 1;     
        }
        i = 0;
        while (true) {
            i = i + 1;
            int j=i*27;
            if (j == 1269) break;
            if (i%10!=0) return;
            System.out.println(i);
        }
    }
}
