package tema6.EjerciciosProfe;

public class Persona implements Cloneable{

	private String nombre;
	private String apellidos;
	private char sexo;
	private String dni;
	private short edad;
	private String colorDePelo;
	private Empresa empresa;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public short getEdad() {
		return edad;
	}
	public void setEdad(short edad) {
		this.edad = edad;
	}
	public String getColorDePelo() {
		return colorDePelo;
	}
	public void setColorDePelo(String colorDePelo) {
		this.colorDePelo = colorDePelo;
	}
	public String toString() {
		return "nombre:" + nombre + "\n" +
			   "apellidos:" + apellidos + "\n" + 
			   "sexo:" + sexo + "\n" + 
			   "edad:" + edad +  "\n" +
			   "dni:" + dni+  "\n" +
			   "color de pelo:" + colorDePelo + "\n" +
			   "nombre Empresa: " + empresa.getNombre() + "\n" + 
			   "cif Empresa:" + empresa.getCif() + "\n" +
			   "direccion Empresa:" + empresa.getDireccion();
		
	}

	public static void main(String []args) {
		Persona persona = new Persona();
		
		persona.nombre = "Maria";
		persona.apellidos ="garc�a";
		persona.dni = "45345454D";
		persona.edad = 30;
		persona.sexo = 'M';
		persona.colorDePelo = "negro";
		Empresa empresa = new Empresa();
		empresa.setCif("423434Y");
		empresa.setDireccion("Calle Via de los Poblados");
		empresa.setNombre("Colegio SMA");
		persona.setEmpresa(empresa);
		

		Persona persona2=null;

		try {
				persona2 = (Persona)persona.clone();
		} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		persona2.getEmpresa().setDireccion("ja");
		
		System.out.println(persona);
		System.out.println(persona2);

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Persona persona = (Persona)super.clone();
		persona.empresa = (Empresa)empresa.clone();
		return (Object)persona;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
