/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjerciciosDos.EjercicioSiete;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pietrodeocre
 */
public class Date implements Cloneable{
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    private int segundo;
    
    //Constructor
    public Date (){
        
    }
    
    //Getters and Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Getter and Setter
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    //Finalize
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    //toString
    @Override
    public String toString() {
        return "Date{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }

    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Date &&
                (((Date)obj).getDia() == this.dia) &&
                (((Date)obj).getMes() == this.mes) &&
                (((Date)obj).getAnio() == this.anio) &&
                (((Date)obj).getHora() == this.hora) &&
                (((Date)obj).getMinuto() == this.minuto) &&
                (((Date)obj).getSegundo() == this.segundo)); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Método que compara si la fecha es menor que la del objeto
    public int compareTo(Date anotherDate){
        if (this.equals(anotherDate)){
            return 0;
        }else if (this.anio == anotherDate.anio){
            
            if (this.mes == anotherDate.mes){
                
                if (this.dia == anotherDate.dia){
                    
                    if (this.hora == anotherDate.hora){
                        
                        if (this.minuto == anotherDate.minuto){
                            
                            if (this.segundo == anotherDate.segundo){
                                
                            }else if (this.segundo > anotherDate.segundo){
                                return -1;
                            }
                        }else if(this.minuto > anotherDate.minuto){
                            return -1;
                        }
                    }else if (this.hora > anotherDate.hora){
                        return -1;
                    }
                }else if(this.dia > anotherDate.dia){
                    return -1;
                }
            }else if ( this.mes > anotherDate.mes){
                return -1;
            }
        }else if (this.anio > anotherDate.anio){
            return -1;
        }
        return 1;
        
    }
    
    public Date (int anio, int mes, int dia, int hora, int minuto, int segundo){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
         
    }
    
    //Devuelve true si el objeto fecha que llama el método es 
    //anterior a la fecha date del argumento
    public boolean before(Date date){
        if (compareTo(date) == -1){
            return true;
        }else{
            return false;
        }
        //return this.compareTo(date) == -1;
    }
    
    
    //Devuelve true si el objeto fecha que llama el método es 
    //posterior a la fecha date del argumento
    public boolean after(Date date){
        if (compareTo(date) == 1){
            return true;
        }else{
            return false;
        }
        //return this.compareTo(date) == 1;
    }
    
    public static void main (String[]args){
        Date dat = new Date(1980, 10, 16, 12, 25, 22);
        Date dat2 = new Date(1982, 2, 17, 12, 25, 22);
        
        Date dat3 = null;
        
        
        try {
            dat3 = (Date)dat.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        dat3.setAnio(1979);
        System.out.println(dat);
        System.out.println(dat2);
        System.out.println(dat3);
        
        System.out.println((dat.equals(dat2)));
        System.out.println((dat.compareTo(dat2)));
        
        System.out.println(dat.before(dat2));
        System.out.println(dat.before(dat3));
        
        
    }
    
}
