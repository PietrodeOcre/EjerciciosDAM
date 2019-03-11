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
public class Empresa implements Cloneable{
    //Atributos
    private String cif, nombreEmpresa, localizacion;
    
    //Getters and Setters
    public String getCif(){
        return this.cif;
    }
    
    public String getNombreEmpresa(){
        return this.nombreEmpresa;
    }
    
    public String getLocalizacion(){
        return this.localizacion;
    }
    
    public void setCif(String cif){
        this.cif = cif;
    }
    
    public void setNombreEmpresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    //toString
    @Override
    public String toString(){
        return "Clase Empresa \n" + 
                "Nombre: " +this.nombreEmpresa +
                "Localización: " +this.localizacion +
                "CIF: " +this.cif;
    }
    
    //Clone
    @Override
    public Object clone()throws CloneNotSupportedException{
        /*Empresa empresa = (Empresa)super.clone();
        return (Object)empresa;*/
        return super.clone();
    }
    
    //equals
    @Override
    public boolean equals(Object empresa){
        return (empresa instanceof Empresa) &&
                (((Empresa)empresa).getCif().equals(this.cif)) &&
                (((Empresa)empresa).getNombreEmpresa().equals(this.nombreEmpresa));
    }
    
}
