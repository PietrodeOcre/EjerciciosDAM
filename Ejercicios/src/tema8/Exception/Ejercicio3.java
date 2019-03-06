/*
Escribe un método auxiliar de nombre “caracterEn” en Java que realice la 
siguiente acción: Recibe como parámetros una cadena (String) y un 
entero (int);Si el entero está entre 0 y la longitud de la cadena 
(puedes hacer uso del método “length():int” de la clase “String”) 
devuelve el carácter en la posición correspondiente (puedes haceruso 
del método “charAt(int)” de la clase “String”).En caso contrario, 
construye y lanza una excepción de tipo “Exception”.
 */
package tema8.Exception;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3 {
    
    private static char caracterEn(String cadena, int num) throws IllegalAccessException{
        if (num>0 && num<cadena.length()){
            return cadena.charAt(num);
        }else{
            throw new IllegalAccessException("Posición erronea");
        }
    }
    
    public static void main(String[] args) {
        try{
            caracterEn("hola", 7);//LLamamos al método que puede causar una exception
        }catch (IllegalAccessException e){
            System.out.println("Capturada de nuevo: " + e);
        }finally{//Este bloque siempre se ejecuta aunque no salte la exception
            System.out.println("Finaliza");
        }
       
    }
    
}
