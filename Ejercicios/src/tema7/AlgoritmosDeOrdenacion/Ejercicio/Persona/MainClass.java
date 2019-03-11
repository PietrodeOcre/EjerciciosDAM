/*
una clase empresa con id auto numerico y nombre
un empleado con 10 posiciones que se tiene que poder comparar con 
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

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author pietrodeocre
 */
public class MainClass {
    //CLase Empleado 
    static class Empleado implements Comparable<Empleado>{
        //Definimos atributos
        public String nombre;
        static int id;
        public int identificador;
        public String dni;
        
        //toString
        @Override
        public String toString() {
            return "Empleado{" + "nombre=" + nombre + ", identificador=" + identificador + ", dni=" + dni + '}';
        }
        
        //Getters and Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getIdentificador() {
            return identificador;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }
        
        
        //Constructor 
        public Empleado(String nombre, String dni){
            this.identificador = id++;
            this.nombre = nombre;
            this.dni = dni;
        }


        //compareTo
        @Override
        public int compareTo(Empleado t) {           
            return this.nombre.compareTo(t.getNombre());
        }
        

    }
    //Este método imprime un array de personas
    static void imprimeArrayPersona(Empleado[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+ "->  id."+ array[i].getIdentificador() + " - Nombre: " +array[i].getNombre() + " - DNI: "+ array[i].getDni());
        }
    }
    
    static class Empresa{
        //Clase empresa con estos atributos
        static int id;
        private int identificador;
        private String nombre;
        private Empleado[] empleado;
        
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

        public Empleado[] getEmpleado() {
            return empleado;
        }

        public void setEmpleado(Empleado[] empleado) {
            this.empleado = empleado;
        }
        
        
        
        //Constructor

        public Empresa(String nombre, Empleado[] empleado) {
            this.identificador = id++;
            this.nombre = nombre;
            this.empleado = empleado;
        }
        
    
        //toString
        @Override
        public String toString() {
            return "Empresa{" + "identificador=" + this.identificador + ", nombre=" + this.nombre + ", Empleado{" + listaEmpleado(this.empleado) +'}';
        }
        
        //compareTo
        public int compareTo(Empresa t) {
            return -(this.identificador-t.getIdentificador());
        }
        
        //método para crear un string con todos los empleados
        public static StringBuffer listaEmpleado(Empleado[] empleado){
            
            //creamos un StringBuffer para concatenar los nombres
            StringBuffer listaEmpleado = new StringBuffer();
            
            for (int i = 0; i < 10; i++) {
                if (empleado[i] != null){
                    //Usamos append para concatenar los nombres de los empleados de la empresa
                    listaEmpleado.append(empleado[i].nombre).append(",");
                }
            }
            listaEmpleado.substring(0, listaEmpleado.length()-1);
            
            return listaEmpleado;
        }
        
        //Método que devuelve un array de nombres de empleados de la empresa
        private static String[] listaEmpleadoArray (String listado){
            
            //Creamos un array de String para poner los nombres de los empleados dentro
            String[] listaNombre = new String[10];
            //Creamos un token para poder separar los nombres del array
            StringTokenizer lista;
            lista = new StringTokenizer(listado, ",");

            for (int i = 0; i < 10; i++) {
                //Asignamos cada token de la lista a una posición del array
                
                listaNombre[i] = lista.nextToken();
            }

            return listaNombre;
        }
        
        //Método que imprime los nombres separados por comas
         private static void listaEmpleado (String listado){
            
            //Creamos un array de String para poner los nombres de los empleados dentro
            
            //Creamos un token para poder separar los nombres del array
            StringTokenizer lista;
            lista = new StringTokenizer(listado, ",");

            //Asignamos cada token de la lista a una posición del array
             /*for (int i = 0; i < 10; i++) {
                 
                 System.out.print(lista.nextToken() + ",");
             }*/
             
             while (lista.hasMoreTokens()){
                 String cadena = lista.nextToken();
                 System.out.println(cadena);
             }
            
        }
            
    }
    
    
    public static void main (String[] args){
        
        //Creamos un array de empleados
        Empleado[] listaEmpleados = new Empleado[10];
        
        //Asignamos objetos a cada posición
        listaEmpleados[0] = new Empleado("Manuel", "30965835V");
        listaEmpleados[1] = new Empleado("Miguel", "30965835V");
        listaEmpleados[2] = new Empleado("Pedro", "30965835V");
        listaEmpleados[3] = new Empleado("Samuel", "30965835V");
        listaEmpleados[4] = new Empleado("Vanesa", "30965835V");
        listaEmpleados[5] = new Empleado("Alberto", "30965835V");
        listaEmpleados[6] = new Empleado("Roberto", "30965835V");
        listaEmpleados[7] = new Empleado("Carlos", "30965835V");
        listaEmpleados[8] = new Empleado("Ernesto", "30965835V");
        listaEmpleados[9] = new Empleado("Javier", "30965835V");

        /*Empleado[] empleados = {
            empleado1, empleado2, empleado3, null,null,null, null,
            null,null,null
        }*/
                
        //Imprimimos el array sin ordenar
        imprimeArrayPersona(listaEmpleados);
        
        //Creamos el objeto de la empresa
        Empresa empresa0 = new Empresa("Indra", listaEmpleados);
        
        //Usamos la clase array para ordenar el array de mayor a menos
        Arrays.sort(listaEmpleados);

        //Imprimimos de nuevo el array
        imprimeArrayPersona(listaEmpleados);
        
        //Imprimimos la empresa
        System.out.println(empresa0);
        
        //Guardamos en un string la lista de nombres de un objeto empresa
        String listado = Empresa.listaEmpleado(empresa0.empleado).toString();
        
        System.out.println(listado);//Imprimimos el listado como un string
        
        //Imprimimos el array de los nombres de los empleados de la empresa
        System.out.println(Arrays.toString(Empresa.listaEmpleadoArray(listado)));
        
        //Método que imprime los empleados de una empresa separados por comas
        Empresa.listaEmpleado(listado);
        
        /*Empresa[] listaEmpresa = new Empresa[4];
        
        listaEmpresa[0] = new Empresa("Intel", listaEmpleados);
        listaEmpresa[1] = new Empresa("AMD", listaEmpleados);
        listaEmpresa[2] = new Empresa("Asus", listaEmpleados);
        listaEmpresa[3] = new Empresa("Shaphire", listaEmpleados);
        System.out.println(Arrays.toString(listaEmpresa));
        Arrays.sort(listaEmpresa);
        System.out.println(Arrays.toString(listaEmpresa));*/
        
        
    }
    
    
}
