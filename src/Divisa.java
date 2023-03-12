public class Divisa {

	private String nombre;
	private double cambio;


	public Divisa(String nombre) {
		this.nombre = nombre;
	}

	public Divisa(String nombre, double cambio) {
		this.nombre = nombre;
		this.cambio = cambio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return nombre + " - " + cambio;
	}
}
