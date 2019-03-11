/*
 * Escribe un programa en Java que encuentre el elemento más pequeño y el segundo más
pequeño de un array de enteros.
 */
package tema7.Repaso2;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio5 {
    
    private static void masPequeMasGrande(int[] array){
        int grande=0;
        int peque=0;
        int j;
        for (int i = 1; i<array.length; i++){
            int a= array[i];
            for(j=i-1; j>0 && array[j]>a; j--){
                array[j+1] = array[j];
                grande = array[j];   
            }
            array[j+1]=a;
        }
        peque = array[0];
        System.out.println("El más pequeño es " + peque + " y el más grande es " + grande);
    }
    
    public static void main(String[] args) {
        int[] array = {2,3,5,6,5,4,3,2,6,7};
        
        
        masPequeMasGrande(array);
    }
    
}
