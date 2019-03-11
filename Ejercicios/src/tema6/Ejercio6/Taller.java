/*
 * Clase de un Taller
 */
package tema6.Ejercio6;

/**
 *
 * @author pietrodeocre
 */
public class Taller implements Cloneable{
    
    //Definimos las variables
    private String cif, direccion, provincia, municipio, nombre;
    private Empleado empleado;
    
    //Definimos los setter.
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void setCif(String cif){
        this.cif = cif;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
    
    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Definimos los getters
    public Empleado getEmpleado() {
        return this.empleado;
    }

    public String getCif(){
        return this.cif;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    public String getMunicipio(){
        return this.municipio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    //Método de toString que devuelve el contenido del objeto en un String.
    @Override  //Significa que va a ser sobreescrito en la superclase
    //Lo definimos con throws para que no aparezcan excepciones
    //Obligarotio poner throws CloneNotSupportedException para
    //evitar poner el try catch en el Main
    public String toString() {
	return "Clase Taller: \n" +
                " Nombre: "+ this.nombre + "\n" +
                " CIF: "+ this.cif + "\n" +
                " Dirección: "+ this.direccion + "\n" +
                " Provincia: "+ this.provincia + "\n" + 
                " Município: "+ this.municipio + "\n" +
                " Empleado: " + this.empleado;
    }

    //Método clone; lo sobreescribimos para que poder hacer clones del objeto.
    @Override
    public Object clone() throws CloneNotSupportedException {
        Taller taller = (Taller)super.clone();
        //taller.empleado = (Empleado)this.empleado.clone();
        return (Object)taller;
    }
    
    
    //Sobreescribimos el metodo equals para indicar a java como 
    //debe comprar el objeto en cuestión
    @Override
    public boolean equals(Object taller){
        if((taller instanceof Taller) && (((Taller)taller).getCif()==this.cif)){
            return true;
        }else{
            return false;
        }
    }
    
}
