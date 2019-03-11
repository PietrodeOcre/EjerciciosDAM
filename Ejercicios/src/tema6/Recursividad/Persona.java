/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Recursividad;

/**
 *
 * @author pietrodeocre
 */
public class Persona {
    static int cont;
    private int identificador;
	private String dni;
	private String direccion;
	private int edad;
        
   

	//Getters and Setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        

	private String concatenaCALLE(){
            String respuesta = "CALLE " + getDireccion();
            return respuesta;
	}

	private int incrementaEn20(){
            int respuesta = this.getEdad() + 20;
            return respuesta;
	}

	//toString

    @Override
    public String toString() {
        return "Persona{" + "identificador=" + identificador + ", dni=" + dni + ", direccion=" + direccion + ", edad=" + edad + '}';
    }

	
    
    public Persona(){
       this.identificador = cont++;
        }

	public static void main(String[] args){
		Persona persona1 = new Persona();
                Persona persona2 = new Persona();

		persona1.setDni("30965832-V");
		persona1.setDireccion("lagarta n4");
		persona1.setEdad(25);

		System.out.println(persona1.toString());

		persona1.setDireccion(persona1.concatenaCALLE());
		persona1.setEdad(persona1.incrementaEn20());

		System.out.println(persona1.toString());
                System.out.println(persona2.toString());
	}
        
        
        
}
