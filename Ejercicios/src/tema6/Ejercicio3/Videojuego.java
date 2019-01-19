/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio3;

/**
 *
 * @author pietrodeocre
 */
public class Videojuego {
    private String titulo, genero, compania;
    private int horasEstimadas;
    private boolean entregado;
    
    //Titulo
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    //Género
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    //Compañía
    public String getCompania(){
        return this.compania;
    }
    
    public void setCompania(String compania){
        this.compania=compania;
    }
    
    //Temporada
    public int getHorasEstimadas(){
        if (this.horasEstimadas==0){
            return this.horasEstimadas=10;
        }else{
            return this.horasEstimadas;
        }
    }
    
    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas=horasEstimadas;
    }
    
    
}
