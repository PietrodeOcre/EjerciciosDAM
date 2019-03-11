/*
 * Clase para empleados.
 */
package tema6.Ejercio6;

/**
 *
 * @author pietrodeocre
 */
public class Empleado implements Cloneable{
    private String nombre, tallerDondeTrabaja;
    private byte edad;
    private long numeroSS;
    private char sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTallerDondeTrabaja() {
        return tallerDondeTrabaja;
    }

    public void setTallerDondeTrabaja(String tallerDondeTrabaja) {
        this.tallerDondeTrabaja = tallerDondeTrabaja;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public long getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(long numeroSS) {
        this.numeroSS = numeroSS;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //Método de toString que devuelve el contenido del objeto en un String.
    //Significa que va a ser sobreescrito en la superclase
    //Lo definimos con throws para que no aparezcan excepciones
    //Obligarotio poner throws CloneNotSupportedException para
    //evitar poner el try catch en el Main
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", tallerDondeTrabaja=" + tallerDondeTrabaja + ", edad=" + edad + ", numeroSS=" + numeroSS + ", sexo=" + sexo + '}';
    }
    
    //Método clone; lo sobreescribimos para que poder hacer clones del objeto
    @Override
    public Object clone() throws CloneNotSupportedException {
        Empleado empleado = (Empleado)super.clone();
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    //Sobreescribimos el metodo equals para indicar a java como 
    //debe comprar el objeto en cuestión
    @Override
    public boolean equals(Object empleado){
        if((empleado instanceof Empleado) && (((Empleado)empleado).nombre==this.nombre)
                && (((Empleado)empleado).tallerDondeTrabaja==this.tallerDondeTrabaja)){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
