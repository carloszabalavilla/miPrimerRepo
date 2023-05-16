package tema6.examenes.controlcanciones;

import java.util.Objects;

public class Productor {

	private String nombre;
	private String discografica;

	public Productor(String nombre, String discografica) {
		super();
		this.nombre = nombre;
		this.discografica=discografica;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getDiscografica() {
		return discografica;
	}
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}
	@Override
	public int hashCode() {
		return Objects.hash(discografica, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productor other = (Productor) obj;
		return Objects.equals(discografica, other.discografica) && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return nombre + " -" + discografica;
	}
	

}
