package tema6.examenes.controlpokemon;

import tema6.examenes.controlpokemon.Pokemon;
import tema6.examenes.controlpokemon.Principal;

import java.util.*;

public class Pokedex {
    private LinkedList<Pokemon> listaPokemons;
    private HashMap<Pokemon, LinkedList<Pokemon>> combates;
    private Principal controlador;


    public Pokedex(Principal controlador) {
        // TODO Auto-generated method stub

    }


    public boolean guardaPokemon(Pokemon pok) {
        // TODO Auto-generated method stub
        // devuelve true si se ha guardado realmente; false si ya estaba
        return false;
    }


    public LinkedList<Pokemon> getListaPokemons() {
        return listaPokemons;
    }


    public void setListaPokemons(LinkedList<Pokemon> listaPokemons) {
        this.listaPokemons = listaPokemons;
    }


    public HashMap<Pokemon, LinkedList<Pokemon>> getCombates() {
        return combates;
    }


    public void setCombates(HashMap<Pokemon, LinkedList<Pokemon>> combates) {
        this.combates = combates;
    }


    public void borraPokemon(String pok) {
        listaPokemons.remove(pok);
    }


    public boolean guardaCombate(String ganador, String perdedor) {
        // TODO Auto-generated method stub
        // false si ese combate ya estaba.
        return false;
    }


    public String getListadoTodos() {
        // TODO Auto-generated method stub
        return null;
    }


    public String getListadoAlfabeticoMayores(int minimo) {
        // TODO Auto-generated method stub
        return null;
    }


    public String getListadoMayores(int minimo) {
        // TODO Auto-generated method stub
        return null;
    }


    public String getListadoCombates() {
        // TODO Auto-generated method stub
        return null;
    }


}
