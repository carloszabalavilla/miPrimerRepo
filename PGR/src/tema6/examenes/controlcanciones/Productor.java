package tema6.examenes.controlcanciones;

import java.util.Objects;

public class Productor {

	private String nombre;
	private String discografica;

	/**
	 *
	 * @param nombre
	 * @param discografica
	 */
	public Productor(String nombre, String discografica) {
		super();
		this.nombre = nombre;
		this.discografica=discografica;
	}

	/**
	 *
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *
	 * @return
	 */
	public String getDiscografica() {
		return discografica;
	}

	/**
	 *
	 * @param discografica
	 */
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int hashCode() {
		return Objects.hash(discografica, nombre);
	}

	/**
	 *
	 * @param obj
	 * @return
	 */
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

	/**
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return nombre + " -" + discografica;
	}
	

}
