/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.AlgoritmosDeOrdenacion.Ejercicio.Persona;

/**
 *
 * @author pietrodeocre
 */
public class MainClass {
    
    static class Empleado implements Comparable<Empleado>{
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
            if (this.identificador < t.identificador){
                return -1;
            }
            if (this.identificador > t.identificador){
                return 1;
            }
            return 0;
        }
        
        
        
    }
    
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
        private static Empleado[] empleado;
        
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
            Empresa.empleado = empleado;
        }
        
        
        
        //Constructor

        public Empresa(String nombre, Empleado[] empleado) {
            this.identificador = id++;
            this.nombre = nombre;
            Empresa.empleado = empleado;
        }
        
    
        //toString
        @Override
        public String toString() {
            return "Empresa{" + "identificador=" + this.identificador + ", nombre=" + this.nombre + ", Empleado{" + listaEmpleado(Empresa.empleado) +'}';
        }
        
        //compareTo
        public int compareTo(Empresa o) {
        return -this.nombre.compareTo(o.getNombre());
        }
        
        //método para crear un string con todos los empleados
        public static StringBuffer listaEmpleado(Empleado[] empleado){
            
            StringBuffer listaEmpleado = new StringBuffer();
            
            for (int i = 0; i < 10; i++) {
                listaEmpleado.append(empleado[i].nombre).append(" ");
            }
            
            return listaEmpleado;
        }
        
        //Método que devuelve un array de nombres de empleados de la empresa
        private static StringBuffer[] listaEmpleadoArray (StringBuffer lista){
            
            //StringBuffer[] listaNombre = new String[10];
            
             
            //lista = listaEmpleado(this.getEmpleado());
            
            for (int i = 0; i < 10; i++) {
                
            }
            
            
            return listaNombre;
        }
        
        
    }
    
    
    public static void main (String[] args){
        
        Empleado[] listaEmpleados = new Empleado[10];
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
        
        imprimeArrayPersona(listaEmpleados);
        
        Empresa empresa0 = new Empresa("Indra", listaEmpleados);
        
        System.out.println(empresa0);
        
        
        
        
    }
    
    
}
