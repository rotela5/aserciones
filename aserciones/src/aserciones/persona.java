package aserciones;

public class persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		private String nombre;
		private String apellido;
		private int a�oNacimiento;
		public persona(String nombre, String apellido, int a�oNacimiento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.a�oNacimiento = a�oNacimiento;
		}
		public persona() {
			super();
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getA�oNacimiento() {
			return a�oNacimiento;
		}
		public void setA�oNacimiento(int a�oNacimiento) {
			this.a�oNacimiento = a�oNacimiento;
		}

	

		
public void imprime() {
	assert nombre!=null && apellido!=null:"no debe ser nulo";
	assert nombre.length() > 1 &&
	 apellido.length() >1:"el nombre y apellido debe contener mas de dos letras";
	assert a�oNacimiento > 1920:"debe ser mayo a 1920";
System.out.println("datos de la persona: "+nombre+" "+apellido+" "+a�oNacimiento);	
}


}
