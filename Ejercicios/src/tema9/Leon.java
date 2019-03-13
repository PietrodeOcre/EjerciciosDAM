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
public class Leon extends Animal{
    private String color;
    private String tamanio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Leon(String color, String tamanio, String nombre, int edad, LocalDate fecha) {
        super(nombre, edad, fecha);
        this.color = color;
        this.tamanio = tamanio;
    }

    
    
    
    
}
