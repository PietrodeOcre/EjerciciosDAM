/*
Máximo cuatro platanos
identificador, nombre y tamaño
 */
package tema8.Fruteria;

/**
 *
 * @author pietrodeocre
 */
public class Platano implements Comparable<Platano>{
    //Atributos
    static int id=0;
    private int identificador;
    private String nombre;
    private String tamanio;
    
    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Platano{" + "identificador=" + identificador + ", nombre=" + nombre + ", tamanio=" + tamanio + '}';
    }
    
    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Constructor
    public Platano(){
        this.identificador = ++id;
    }

    //Constuctor
    public Platano(String nombre, String tamanio) {
        this();
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    
    @Override
    public int compareTo(Platano p){
        return this.identificador-p.getIdentificador();
        //Ordena crecientemente
        //return -this.id-p.getId();
        //Ordena decrecientemente
    }
    
    
    
    
}
