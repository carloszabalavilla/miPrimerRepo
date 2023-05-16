package tema6.examenes.controlcanciones;


import java.io.File;

import java.util.Set;

public class Principal {

	private Modelo modelo;
	private VentanaPrincipal vista;

	public Principal() {
		this.modelo = new Modelo(this);
		this.vista = new VentanaPrincipal(this);
		this.vista.setVisible(true);
		//comentar o descomentar seg�n se requiera
		this.modelo.addDatosPrueba();
		this.vista.actualizaComboProductor();
	}

	public static void main(String args[]) {
		new Principal();
	}

	public boolean addProductor(Productor productor) {
		return this.modelo.addProductor(productor);

	}

	public String getListadoTodasCanciones() {
		return this.modelo.getCanciones();
	}

	public String getListadoArtistasNumCanciones() {
		return this.modelo.artistasNumCanciones();
	}

	public String getListado3DiscograficasMasVisualizaciones() {
		return this.modelo.discograficasMasReproducciones();
	}

	public Set<Productor> getProductores() {
		return this.modelo.getProductores();
	}

	public boolean guardarCancion(String nombreCancion, String artista, Productor productor, int numReproducciones) {
		Cancion cancion = new Cancion(nombreCancion, artista, numReproducciones);
		return this.modelo.addCancion(productor, cancion);
	}

	//f) Escribe las canciones ordenadas alfab�ticamente en el txt, con el mismo formato que en el txt que se aporta. 
	//Este m�todo lanzar� las excepciones que pueda generar.
	public void escribirCancionesOrdenadasEnTxt(File fichero){
		
	}

	//g) Devuelve el n�mero de canciones que hay en el fichero txt que recibe.  Este m�todo lanzar� las excepciones que pueda generar.
	public int numCancionesLeidasDeTxt(File fichero){
		return 0;
	}
	
	//h) escribe el mapa de producciones en un archivo binario.  Este m�todo lanzar� las excepciones que pueda generar.
	public void escribirProduccionesEnBinario(File fichero){

	}
	
	//i) Lee el mapa de producciones del archivo binario y carga los datos en el modelo (en artistas y en producciones). 
	//(Llama al m�todo addProduccionesYArtistas de Modelo).  Este m�todo lanzar� las excepciones que pueda generar.
	public void leerYcargarProduccionesDeBinario(File fichero) {
				
	}

}
