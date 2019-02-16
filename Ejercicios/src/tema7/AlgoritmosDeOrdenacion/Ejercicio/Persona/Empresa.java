/* 
una clase empresa con id auto numerico y nombre
un empleado con 10 posiciones que se tiene que poder comprar con 
id.decreciente
tiene que usar esta cabecera con un metodo que devuelve todos los 
nombres de los empleados separado con comas en un strinfbuffer pero no los imprime
y debuelve seguramente usando tokens
Habra otro metodo void que escribe nombres por pantalla el stringbuffer anterior
usando el string tokenaizer


En la clase empleado tendrá un id autonumerico, un nombre, un dni String, 
se pueden comaprar tambien osea que hay que sobreescribir el compareTo se compara 
por el nombre de manera creciente.

Crea una clase main con todaslas pruebas.


 */
package tema7.AlgoritmosDeOrdenacion.Ejercicio.Persona;

import java.util.Scanner;
import tema6.EjerciciosDos.EjercicioSeis.Empleado;


/**
 *
 * @author pietrodeocre
 */
public class Empresa implements Comparable<Empresa>, Cloneable{
    //Clase empresa con estos atributos
    private static int id;
    private int identificador;
    private String nombre;
    private Empleado empleado = new Empleado();

    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    
    //Sobreescribe el método compareTo()
    @Override
    public int compareTo(Empresa o) {
        return -this.nombre.compareTo(o.getNombre());
    }
    
    //Constructor
    public Empresa(String nombre){
        this.identificador = id++;
        this.nombre = nombre;        
    }
    
    //Añadir empleados
    public static Empleado[] añadirEmpleado(){

        Scanner sc = new Scanner(System.in);
                
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[]=new Empleado[10];
 
        //Creamos 10 empleados por defecto
        for (int i=0;i<arrayObjetos.length;i++){
            System.out.println("Escribe el nombre del empleado: ");
            String nombre = sc.nextLine();
            arrayObjetos[i]=new Empleado();
        }
        
        return arrayObjetos;
        
    }
    
    //Método para crear array de nombres de empleados separados por comas
    public static StringBuffer listado(Empleado empleado){
        
        StringBuffer empleadoLista = new StringBuffer();
        
        for (int i=0; i<10; i++){
            //empleadoLista.append(empleado[i].getNombre());
        }
        
        
        return empleadoLista;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empresa{" + "identificador=" + identificador + ", nombre=" + nombre + ", empleado=" + empleado + '}';
    }
    
    //Clone

    @Override
    public Object clone() throws CloneNotSupportedException {
        Empresa empresa = (Empresa)super.clone();
        empresa.empleado = (Empleado)this.empleado.clone();
        return (Object)empresa; 
    }
    
}
