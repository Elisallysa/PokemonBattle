package models;

import java.util.ArrayList;

public class Equipo {

	// Propiedades
	
	protected ArrayList<Pokemon> pokEquipo;

	
	// Constructor
	public Equipo() {
		pokEquipo = new ArrayList<>();
	}
	
		
	// Getters y setters
		
	
	
	// Métodos
		
	public void addPokemon (Pokemon p) {
		this.pokEquipo.add(p);
	}
}
