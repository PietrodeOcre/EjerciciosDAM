/*
Escribe un método en Java que inserte un elemento en una determinada posición de un
array. Si la posición es correcta y se inserta el elemento, se devuelve true. En caso contrario,
false. La cabera del método es la siguiente:
private boolean insertaElementoArray(String [] array, String elemento, int posicion)
 */
package tema7.Repaso;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3 {
    
    private static boolean insertaElementoArray(String [] array, String elemento, int posicion){
        //Devuelve true si consigue añadir elemento al array y false si está la posicion ocupada
        if(posicion<array.length){
            if (array[posicion] == null){
                Arrays.fill(array, posicion, posicion+1, elemento);
                return true;
            }
        }        
        return false;
    }
    
    public static void main(String[] args) {
        String[] array = new String[5];
        
        System.out.println(insertaElementoArray(array, "Hola", 0));
        
        System.out.println(Arrays.toString(array));
        //insertaElementoArray(array, "Hola", 0);
    }
    
}
