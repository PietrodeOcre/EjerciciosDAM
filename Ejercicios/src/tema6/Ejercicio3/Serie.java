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
public class Serie {
    private String titulo, genero, creador;
    private int temporada;
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
    
    //Creador
    public String getCreador(){
        return this.creador;
    }
    
    public void setCreador(String creador){
        this.creador=creador;
    }
    
    //Temporada
    public int getTemporada(){
        if (this.temporada==0){
            return this.temporada=3;
        }else{
            return this.temporada;
        }
    }
    
    public void setTemporada(int temporada){
        this.temporada=temporada;
    }
    
    
    
    
}
