package tema6.examenes.controlpokemon;

import java.util.Objects;

public class Pokemon implements Comparable<Pokemon> {
    private String nombre;
    private String tipo;
    private int generaci�n;
    private String estadoEvolutivo;
    private int puntos;

    public Pokemon(String nombre, String tipo, int generaci�n, String estadoEvolutivo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
        this.generaci�n = generaci�n;
        this.estadoEvolutivo = estadoEvolutivo;
        this.puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGeneraci�n() {
        return generaci�n;
    }

    public void setGeneraci�n(int generaci�n) {
        this.generaci�n = generaci�n;
    }

    public String getEstadoEvolutivo() {
        return estadoEvolutivo;
    }

    public void setEstadoEvolutivo(String estadoEvolutivo) {
        this.estadoEvolutivo = estadoEvolutivo;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") " + generaci�n + "� Generaci�n, " + estadoEvolutivo + " Puntos: " + puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pokemon pokemon = (Pokemon) o;

        return Objects.equals(nombre, pokemon.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public int compareTo(Pokemon o) {
        return 0;
    }
}
