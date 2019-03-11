/*
Observa el siguiente fragmento de código:

	String aux = “hola”;
	int aux2 = Integer.parseInt (aux);

¿Qué sucedería al ejecutar el mismo? 
 */
package tema8.Exception;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        try{
            String aux = "hola";
            int aux2 = Integer.parseInt (aux);
        }catch (NumberFormatException e){
            System.out.println("Error, no puedes poner letras y pedir números. " + e.getMessage());
        }
        
        
    }
    
}
