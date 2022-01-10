package models;

public abstract class AbstractEntrenador {


	// Atributos
	
	protected String nombre;
	protected Equipo equipo;
	
	
	// Constructor
	
	public AbstractEntrenador(String nombre, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.equipo = new Equipo ();
	}

		
	// Getters y setters
		
	public String getNombre() {
		return nombre;
	}

	public Equipo getEquipo() {
		return equipo;
	}
	
	// Métodos
		
	
}
