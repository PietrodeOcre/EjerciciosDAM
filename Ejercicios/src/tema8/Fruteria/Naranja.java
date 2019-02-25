/*
Máximo siete naranjas.
identificador, color y tamaño.
 */
package tema8.Fruteria;

/**
 *
 * @author pietrodeocre
 */
public class Naranja implements Comparable<Naranja>{
    //Atributos
    static byte id=0;
    private byte identificador;
    private String nombre;
    private String color;
    private String tamanio;
    
    
    //Getters and Setters
    public byte getIdentificador() {
        return identificador;
    }

    public void setIdentificador(byte identificador) {
        this.identificador = identificador;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //toString 
    @Override
    public String toString() {
        return "Naranja{" + "identificador=" + identificador + ", nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + '}'; 
    }

    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Constructor
    public Naranja(){
        this.identificador = ++id;
    }
    //Construtor
    public Naranja(String nombre, String color, String tamanio) {
        this();
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
    }

    //compareTo
    @Override
    public int compareTo(Naranja o) {
        return this.nombre.compareTo(o.getNombre());
        
    }
    
}
