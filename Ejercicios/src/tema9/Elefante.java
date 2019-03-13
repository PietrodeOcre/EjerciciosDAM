/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.time.LocalDate;

/**
 *
 * @author pietrodeocre
 */
public class Elefante extends Animal{
    private String color;
    private String especie;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    

    public Elefante(String color, String especie, String nombre, int edad, LocalDate fecha) {
        super(nombre, edad, fecha);
        this.color = color;
        this.especie = especie;
    }

    
    
    
    
}
