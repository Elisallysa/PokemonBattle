package models;

public class Combate {

	// Propiedades
	
	private EntrenadorCPU entrenadorCPU;
	private EntrenadorHumano entrenadorHumano;
	private Equipo equipo1;
	private Equipo equipo2;
	
	// Constructor
	
	public Combate() {
		super();
		this.entrenadorCPU = new EntrenadorCPU(getEntrenadorCPU().generateName(), equipo2);
		this.entrenadorHumano = entrenadorHumano;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	// Getters y setters
		
	public EntrenadorCPU getEntrenadorCPU() {
		return entrenadorCPU;
	}

	public EntrenadorHumano getEntrenadorHumano() {
		return entrenadorHumano;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEntrenadorHumano(EntrenadorHumano entrenadorHumano) {
		this.entrenadorHumano = entrenadorHumano;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
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
