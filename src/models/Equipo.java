package models;

import java.util.ArrayList;

public class Equipo {

	// Propiedades
	
	protected ArrayList<Pokemon> pokEquipo;

	
	// Constructor
	public Equipo() {
		pokEquipo = new ArrayList<Pokemon>();
	}
	
		
	// Getters y setters
		
	
	
	// Métodos
		
	public void addPokemon (Pokemon p) {
		this.pokEquipo.add(p);
	}
	
	public Pokemon getFirstPokemon () {
		Pokemon firstPoke = this.pokEquipo.get(0);
		return firstPoke;
	}

	@Override
	public String toString() {
		return "Equipo [pokEquipo=" + pokEquipo + "]";
	}
	
	
}
