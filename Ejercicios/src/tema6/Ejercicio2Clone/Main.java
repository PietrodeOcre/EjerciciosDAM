/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio2Clone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[]args){
        
        //Creamos de abajo a arriba los objetos correspondientes
        Rectorado rectorado1 = new Rectorado();
        
        
        rectorado1.setNombre("Rectorado1");
        rectorado1.setIdRectorado(1);
        rectorado1.setNumDepartamento(5);
        
        Universidad universidad1= new Universidad();
        universidad1.setIdUniversidad(1);
        universidad1.setNombre("Carlos III");
        universidad1.setRectorado(rectorado1);
        
        Alumno alumno1 = new Alumno();
        
        alumno1.setNombre("Manuel");
        alumno1.setEdad(30);
        alumno1.setIdAlumno(1);
        alumno1.setUniversidad(universidad1);
        
        Alumno alumno2 = null;
        
        try {
            
            alumno2 = (Alumno)alumno1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        alumno2.getUniversidad().getRectorado().setNombre("Rectorado2");
        
        
        
        
        System.out.println(alumno1);
        System.out.println(alumno2);
        
        
        System.out.println(alumno1.equals(alumno2));
        
        alumno2.getUniversidad().getRectorado().setNombre("Rectorado1");
        System.out.println(alumno1.equals(alumno2));
    }
}
