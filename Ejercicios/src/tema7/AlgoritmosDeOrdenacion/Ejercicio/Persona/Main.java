/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.AlgoritmosDeOrdenacion.Ejercicio.Persona;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main (String[] args){
        
        
        
        Empleado[] listaEmpleado = new Empleado[10];
        Empleado[] listaEmpleado2 = new Empleado[10];
        
        
        
      
        Empresa empresa = new Empresa("Indra");
        Empresa empresa2 = new Empresa("Shield");
        
        empresa.setListaEmpleado(listaEmpleado);
        empresa.getListaEmpleado()[0].setNombre("Manuel");
        empresa.getListaEmpleado()[1].setNombre("Pedro");
        empresa.getListaEmpleado()[2].setNombre("Samuel");
        empresa.getListaEmpleado()[3].setNombre("Luis");
        empresa.getListaEmpleado()[4].setNombre("Alberto");
        empresa.getListaEmpleado()[5].setNombre("Javier");
        empresa.getListaEmpleado()[6].setNombre("Domingo");
        
        empresa2.setListaEmpleado(listaEmpleado2);
        empresa2.getListaEmpleado()[0].setNombre("Miguel");
        empresa2.getListaEmpleado()[1].setNombre("Enrique");
        empresa2.getListaEmpleado()[2].setNombre("Angel");
        empresa2.getListaEmpleado()[3].setNombre("Manuel");
        empresa2.getListaEmpleado()[4].setNombre("Manuel");
        empresa2.getListaEmpleado()[5].setNombre("Manuel");
        empresa2.getListaEmpleado()[6].setNombre("Manuel");
        
        System.out.println(empresa);
        System.out.println(empresa2);
        
    }

}
