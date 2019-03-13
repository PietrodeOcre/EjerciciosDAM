/*
Cree un método en Java que reciba una cadena como parámetro, y devuelva un
número con el siguiente prototipo: private int gestionaCadena(String parámetro)
De tal forma, que si el parámetro es un número se capture una excepción de tipo
NumberFormatException y se devuelva un 0. En caso de que la cadena no tenga
ningún carácter, se captura la excepción IllegalArgumentException, y se retorna el
valor -1. Si la cadena es nula, se eleva la excepción NullPointerException. En caso
contrario, se devuelve un 1.
 */
package tema8II;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        System.out.println(gestionaCadena("hola"));
        
        System.out.println(gestionaCadena("222"));
        
        System.out.println(gestionaCadena(null));
        
    }
    
    private static int gestionaCadena(String param) throws NullPointerException{
        int resp = 1;
        try{
            if(param ==null){
                throw new NullPointerException();
                
            }
            
            if (param.length()==0){
                throw new IllegalArgumentException();
            }

            int num = Integer.parseInt(param);
            resp=1;
            
            
        }catch (NumberFormatException e){
            //System.out.println("0"/*+e.getMessage()*/);
            resp=0;
        }catch (IllegalArgumentException e){
            //System.out.println("-1"/*+e.getMessage()*/);
            resp=(-1);
        }

        return resp;
    }
}
