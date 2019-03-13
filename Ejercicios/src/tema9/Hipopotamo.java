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
public class Hipopotamo extends Animal{
    private String paisOrigen;
    private float peso;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Hipopotamo(String paisOrigen, float peso, String nombre, int edad, LocalDate fecha) {
        super(nombre, edad, fecha);
        this.paisOrigen = paisOrigen;
        this.peso = peso;
    }
    
    
}
