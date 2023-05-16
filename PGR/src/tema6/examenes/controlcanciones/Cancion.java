package tema6.examenes.controlcanciones;

public class Cancion{

	private String nombre;
	private String artista;
	private int numReproducciones;
	
	public Cancion(String nombre, String artista, int numReproducciones) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.numReproducciones=numReproducciones;
	}
	
	public Cancion(String nombre, String artista) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.numReproducciones=0;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumReproducciones() {
		return numReproducciones;
	}

	public void setNumReproducciones(int numReproducciones) {
		this.numReproducciones = numReproducciones;
	}

	

}
