/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio5Clone;

/**
 *
 * @author pietrodeocre
 */
public class Camion implements Cloneable{
    //Atributos
    private String matricula, color, nombreConductor;
    private long kilometros;
    private Empresa empresa;
    private Persona persona;
    
    //Getters and Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public long getKilometros() {
        return kilometros;
    }

    public void setKilometros(long kilometros) {
        this.kilometros = kilometros;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }    
    
    
    
    //toString
    @Override
    public String toString() {
        return "Camion \n" + 
                "matricula: " + matricula + 
                "color: " + color + 
                "nombreConductor: " + nombreConductor +  
                "kilometros: " + kilometros +
                "Persona: " + persona +
                "Empresa: " + empresa;
    }
    
    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Camion camion = (Camion) super.clone();
        camion.persona = (Persona) this.persona.clone();
        camion.empresa = (Empresa) this.empresa.clone();
        return camion;
    }
    
    //equals
    @Override
    public boolean equals(Object camion){
        return (camion instanceof Camion) &&
                (((Camion)camion).getMatricula().equals(this.matricula)) &&
                (((Camion)camion).getPersona().equals(this.persona));
        
        
    }
}
