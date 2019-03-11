/*
Crear vector 10 posiciones. Se accede a la posición 11 del vector.
-Creamos un try/catch para capturar la exception-> ArrayIndexOutBoundsException
-Se imprime por pantalla la captura de la exception.
-Usaremos e.getMessage() para imprimirla o e.printStackTrace() o un e.toString()
-Tambien crearemos un método que llamará desde el main a la posición 11 del vector 
-El método anterior elevará la exception y el main lo capturará.
-Crear un método2 que lanzará una exception del mismo tipo pero se lanzará manualmente
-El main tambien capturará la exception que hemos lanzado manualmente.
 */
package tema8.Exception;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioEjemplos {
    
    
    public static void main(String[] args) {
        
        int[] numero = new int[10];
        for (int i = 0; i < 9; i++) {
            numero[i] = i;
        }
             
        //Este Try entra en la posicion 11 del array, que como no existe salta el exception
        /*try{
            int per = numero[11];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            //e.toString();
        } */
        
        
        //Este Try ejecuta un método que entra en la posicion 11 del array, 
        //que como no existe salta el exception
        //el método manda la exception elevada al main que es capturada por este try
        /*try{
            hacerException(numero);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*/
        
        
        //Este Try ejecuta un método que activa una exception manualmente, 
        //simulando al exception anterior.
        //el método manda la exception elevada al main que es capturada por este try
        try{
            hacerException2();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
    }
    
    //Este método eleva la exception al main con el throws
    private static void hacerException(int[] array) throws ArrayIndexOutOfBoundsException{
        
        int per = array[11];

    }
    
    //Este método eleva la excaption simulada con el throw new
    private static void hacerException2() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException("11");
    }
    
     
    
}
