/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioRepaso;

import java.util.Objects;

/**
 *
 * @author pietrodeocre
 */
public class Expediente implements Cloneable{
    private String id;
    private String fechaExpediente;
    private Asignatura asignatura;
    
    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaExpediente() {
        return fechaExpediente;
    }

    public void setFechaExpediente(String fechaExpediente) {
        this.fechaExpediente = fechaExpediente;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Expediente expediente = (Expediente)super.clone();
        expediente.asignatura = (Asignatura)this.asignatura.clone();
        return expediente;
    }
    
    //toString
    @Override
    public String toString() {
        return "Expediente{" + "id=" + id + ", fechaExpediente=" + fechaExpediente + ", asignatura=" + asignatura + '}';
    }
    
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }        
        return obj instanceof Expediente &&
                ((Expediente)obj) != null &&
                this.asignatura != null &&
                ((Expediente)obj).equals(this.asignatura);
    }
    
    //finalize
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
  

    
    

    
}
