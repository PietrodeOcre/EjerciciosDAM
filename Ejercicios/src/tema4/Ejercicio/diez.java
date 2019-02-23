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
public class diez {
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
            System.out.println("Mostramos la cuenta: "+ a);
            if (a%2 == 0){
                b+=a;
            }else{
                c+=a;
            }
        }
        System.out.println("Los números pares sumados: "+ b);
        System.out.println("Los números impares sumados: "+ c);
    }
}
