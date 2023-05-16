package tema6.examenes.controlcanciones;

public class Cancion{

	private String nombre;
	private String artista;
	private int numReproducciones;

	/**
	 *
	 * @param nombre
	 * @param artista
	 * @param numReproducciones
	 */
	public Cancion(String nombre, String artista, int numReproducciones) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.numReproducciones=numReproducciones;
	}

	/**
	 *
	 * @param nombre
	 * @param artista
	 */
	public Cancion(String nombre, String artista) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.numReproducciones=0;
	}

	/**
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *
	 * @return artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 *
	 * @param artista String
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 *
	 * @return numReproducciones
	 */
	public int getNumReproducciones() {
		return numReproducciones;
	}

	/**
	 *
	 * @param numReproducciones
	 */
	public void setNumReproducciones(int numReproducciones) {
		this.numReproducciones = numReproducciones;
	}
}
