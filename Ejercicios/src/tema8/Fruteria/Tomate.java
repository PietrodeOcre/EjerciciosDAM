/*
Máximo diez tomates.
identificador, nombre, color y textura.
 */
package tema8.Fruteria;

/**
 *
 * @author pietrodeocre
 */
public class Tomate implements Comparable<Tomate>{
    //Atributos
    static byte id=0;
    private byte identificador;
    private String nombre;
    private String color;
    private String textura;
    
    //Getters and Setters
    public byte getIdentificador() {
        return identificador;
    }

    public void setIdentificador(byte identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
    
    //toString
    @Override
    public String toString() {
        return "Tomate{" + "identificador=" + identificador + ", nombre=" + nombre + ", color=" + color + ", textura=" + textura + '}';
    }
    
    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Constructor
    public Tomate(){
        this.identificador = ++id;
    }

    //Constructor
    public Tomate(String nombre, String color, String textura) {
        this();
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }
    
    @Override
    public int compareTo(Tomate p){
        return this.identificador-p.getIdentificador();
        //Ordena crecientemente
        //return -this.id-p.getId();
        //Ordena decrecientemente
    }
    
    
}
