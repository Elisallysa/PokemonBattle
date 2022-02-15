package utils;

import models.EntrenadorCPU;
import models.EntrenadorHumano;
import models.Equipo;

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
	
	public boolean empiezaCPU() {
		int speedPokeCPU = entrenadorCPU.getEquipo().getFirstPokemon().getSpeed();
		int speedPokeEntrenador = entrenadorHumano.getEquipo().getFirstPokemon().getSpeed();
		
		if (speedPokeCPU > speedPokeEntrenador) {
			return true;
		}else {
			return false;
		}
	}
	
	public void aplicarMovimiento() {
		
	}
	
	public boolean isFinished() {
		return true;
	}
	
	public void eligeAtaque() {
		
	}
	
}
