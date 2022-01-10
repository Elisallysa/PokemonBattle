package models;

public class Combate {

	// Propiedades
	
	private EntrenadorCPU entrenadorCPU;
	private EntrenadorHumano entrenadorHumano;
	
	// Constructor
	
	public Combate() {
		super();
		this.entrenadorCPU = new EntrenadorCPU(null, null);
		this.entrenadorHumano = entrenadorHumano;
	}

	// Getters y setters
		
	public EntrenadorCPU getEntrenadorCPU() {
		return entrenadorCPU;
	}

	public EntrenadorHumano getEntrenadorHumano() {
		return entrenadorHumano;
	}

	public void setEntrenadorHumano(EntrenadorHumano entrenadorHumano) {
		this.entrenadorHumano = entrenadorHumano;
	}
	
	// Métodos
	
	public Equipo empiezaTurno() {
		
	}
	
	public void aplicarMovimiento() {
		
	}
	
	public boolean isFinished() {
		return true;
	}
	
}
