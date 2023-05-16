package tema6.examenes.controlcanciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Modelo {

	private ArrayList<String> artistas;
	private HashMap<Productor, HashSet<Cancion>> producciones;

	public Modelo(Principal principal) {
		super();
		artistas = new ArrayList<String>();
		producciones = new HashMap<>();
	}

	public ArrayList<String> getArtistas() {
		return artistas;
	}

	public void setArtistas(ArrayList<String> artistas) {
		this.artistas = artistas;
	}

	public HashMap<Productor, HashSet<Cancion>> getProducciones() {
		return producciones;
	}

	public void setProducciones(HashMap<Productor, HashSet<Cancion>> producciones) {
		this.producciones = producciones;
	}

	public void addArtista(String a) {
		if (!this.artistas.contains(a)) {
			this.artistas.add(a);
		}
	}

	public boolean addProductor(Productor productor) {
		boolean res = false;
		if (!this.producciones.containsKey(productor)) {
			this.producciones.put(productor, new HashSet<Cancion>());
			res = true;
		}
		return res;
	}

	public Set<Productor> getProductores() {
		return this.producciones.keySet();
	}

	public boolean addCancion(Productor productor, Cancion cancion) {
		this.addArtista(cancion.getArtista());
		this.addProductor(productor);
		return this.producciones.get(productor).add(cancion);
	}

	public void addDatosPrueba() {
		// "Def Jam", "Finneas", "Mad Records", "Pasarela", "Sonografic"
		Productor productor1 = new Productor("Rick Rubin", "Def Jam");
		Productor productor2 = new Productor("Russell Simmons", "Def Jam");
		Productor productor3 = new Productor("Finneas O'Connell", "Finneas");
		Productor productor4 = new Productor("Scott Storch", "Mad Records");
		Productor productor5 = new Productor("Jorge Acosta", "Pasarela");
		Productor productor6 = new Productor("Laura Sonido", "Pasarela");
		// Productor productor7 = new Productor("Carmen Garc�a","Pasarela");

		HashSet<Cancion> canciones1 = new HashSet<>();
		canciones1.add(new Cancion("Bam Bam", "Camila Cabello", 60500000));
		canciones1.add(new Cancion("Stranger Things", "Leiva", 1375200));
		canciones1.add(new Cancion("Lo mal que estoy", "El Kanka", 4649791));
		canciones1.add(new Cancion("Hist�ricos", "Leiva", 3760999));
		this.producciones.put(productor1, canciones1);

		HashSet<Cancion> canciones2 = new HashSet<>();
		canciones2.add(new Cancion("Miedo", "Amaia", 13000200));
		canciones2.add(new Cancion("Terriblemente Cruel", "Leiva", 2788210));
		this.producciones.put(productor2, canciones2);

		HashSet<Cancion> canciones3 = new HashSet<>();
		canciones3.add(new Cancion("Este tren", "Rozal�n", 4304555));
		canciones3.add(new Cancion("La Gitana", "India Mart�nez", 13222111));
		this.producciones.put(productor3, canciones3);

		HashSet<Cancion> canciones4 = new HashSet<>();
		canciones4.add(new Cancion("A lo cubano", "Orishas", 10545888));
		canciones4.add(new Cancion("En el coche", "Aitana", 5900300));
		this.producciones.put(productor4, canciones4);

		HashSet<Cancion> canciones5 = new HashSet<>();
		canciones5.add(new Cancion("La ni�a", "Mar�a Pelaez", 3405500));
		this.producciones.put(productor5, canciones5);

		HashSet<Cancion> canciones6 = new HashSet<>();
		canciones6.add(new Cancion("KESI", "Camilo", 70300000));
		canciones6.add(new Cancion("Indigo", "Camilo", 147520033));
		this.producciones.put(productor6, canciones6);

		this.artistas.add("Camila Cabello");
		this.artistas.add("Leiva");
		this.artistas.add("El Kanka");
		this.artistas.add("Amaia");
		this.artistas.add("Rozal�n");
		this.artistas.add("India Mart�nez");
		this.artistas.add("Orishas");
		this.artistas.add("Aitana");
		this.artistas.add("Mar�a Pelaez");
		this.artistas.add("Camilo");

	}

	// a) Devuelve un String con las canciones con el formato con el que aparece al
	// darle al check "Listar canciones" -> bot�n "Listar"
	public String getCanciones() {
		return ;
	}

	// b) Devuelve un String con todos los artistas y su n�mero de canciones con el
	// formato con el que aparece al darle al check
	// "Artistas y su n�mero de canciones" -> bot�n "Listar"
	public String artistasNumCanciones() {
		return "";
	}

	// c) Devuelve una cadena con las tres discogr�ficas con mayor n�mero de
	// reproducciones entre todas sus canciones con
	// el formato con el que aparece al darle al check "Productoras con m�s
	// reproducciones" -> bot�n "Listar"
	public String discograficasMasReproducciones() {
		return "";
	}

	// d) Devuelve todas las canciones ordenadas por el orden natural de las
	// canciones, que es alfab�ticamente por su nombre.
	public Set<Cancion> getCancionesOrdenadas() {
		return null;
	}

	// e) A�ade el productor, sus canciones, y los artistas de las canciones al
	// modelo.
	public void addProduccionesYArtistas(HashMap<Productor, HashSet<Cancion>> produccionesNuevas) {

	}
}
