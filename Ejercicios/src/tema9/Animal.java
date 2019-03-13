/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author pietrodeocre
 */
public class Animal {
    private String nombre;
    private int edad;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Animal(String nombre, int edad, LocalDate fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }
    
   /* private static int calculoProximaVacunacion(){
        //LocalDate fechaMesSiguiente = new LocalDate.parse("01/"+fecha.getMonthValue()+"/"+fecha.getYear(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        //Period period = Period.between(fechaMesSiguiente, fecha);
        return period.getDays();
    }*/
    
}
