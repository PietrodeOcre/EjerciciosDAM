/*
 * Este programa nos muestra
 * la tabla de multiplicar
 * desde el cero hasta el 10
 */
package tema4.EjercicioWhile;

/**
 *
 * @author pietrodeocre
 */
public class treinta {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int acumulado;
        acumulado = 0;
        //Definimos la iteración
        for (int contadorInicio=1;contadorInicio<=11; contadorInicio++){
            //Con este bucle for creamos el primer número a multiplicar
            for (int contadorTabla=0;contadorTabla<=10; contadorTabla++){
                //Con este bucle for creamos el número por el cual se multiplica y mostramos el resultado
                System.out.println(acumulado+"*"+contadorTabla+"="+
                        (acumulado*contadorTabla ));
            }
            acumulado++;
        }
    }
}
