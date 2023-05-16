package tema6.examenes.controlpokemon;

import java.util.*;

public class Principal 
{
	private Pokedex modelo;
	private VentanaPpal vista;

	public Principal() {
     this.modelo = new Pokedex(this);
     this.vista = new VentanaPpal(this);
     this.vista.setVisible(true);
	}

	public static void main(String args[]) {
		new Principal();
	}

	public boolean guardaPokemon(Pokemon pok) {

		return this.modelo.guardaPokemon(pok);
	}

	public LinkedList<Pokemon> getListaPokemons() {

		return this.modelo.getListaPokemons();
	}

	public void borraPokemon(String pok) {
		this.modelo.borraPokemon(pok);

	}

	public boolean guardaCombate(String ganador, String perdedor) {

		return this.modelo.guardaCombate(ganador, perdedor);
	}

	public String getListadoTodos() {

		return this.modelo.getListadoTodos();
	}

	public String getListadoAlfabeticoMayores(int m�nimo) {

		return this.modelo.getListadoAlfabeticoMayores(m�nimo);
	}

	public String getListadoMayores(int m�nimo) {

		return this.modelo.getListadoMayores(m�nimo);
	}

	public String getListadoCombates() {

		return this.modelo.getListadoCombates();
	}
}
