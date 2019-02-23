/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

/**
 *
 * @author pietrodeocre
 */
public class once {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b, c;
        //Asignamos valores a la variables.
        a = 0;
        b = 0;
        c = 0;
        //Definimos el bucle
        while (a<100){
            //Aumentamos el contador
            ++a;
            if (a%2 == 0){
                System.out.println("Este número es par: "+ a);
                ++b;
            }else{
                System.out.println("Este número es impar: "+ a);
                ++c;
            }
        }
        System.out.println("Número total de números pares: "+ b);
        System.out.println("Número total de números impares: "+ c);
    }
}
