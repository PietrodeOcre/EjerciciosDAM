/*
 En esta clase podemos elevar la exception en el void main para que 
la trate la clase padre o poner un catch en la linea 13 para controlar 
la excepcion
 */
package tema9;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioClase1 {
    public static void main(String[] args) {
        try{
            new EjercicioClase1().doStuff();
//Inicializo el objeto sin asignarlo a una variable
//De ese modo podemos llamar a los métodos de dicha clase.
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    static void doStuff() throws Exception{
        throw new Exception();
    }
}
