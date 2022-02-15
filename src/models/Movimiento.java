package models;

import enums.Categoria;
import enums.Estados;
import enums.ListaMovimientos;
import enums.Tipos;

public class Movimiento {

	// Propiedades
	
	private int idMovimiento;
	private ListaMovimientos nombre;
	private Tipos tipo;
	private Categoria categoria;
	private int maxPP;
	private int actualPP;
	private int damage;
	private int cambiaAttackAtacante;
	private int cambiaDefAtacante;
	private int cambiaSpAttackAtacante;
	private int cambiaSpDefAtacante;
	private int cambiaSpeedAtacante;
	private int cambiaAttackAtacado;
	private int cambiaDefAtacado;
	private int cambiaSpAttackAtacado;
	private int cambiaSpDefAtacado;
	private int cambiaSpeedAtacado;
	private Estados aplicaEstado;
	
	// Constructor
	
	public Movimiento(int idMovimiento, ListaMovimientos nombre, Tipos tipo, Categoria categoria, int maxPP, int actualPP, int damage, int cambiaAttackAtacante,
			int cambiaDefAtacante, int cambiaSpAttackAtacante, int cambiaSpDefAtacante, int cambiaSpeedAtacante, int cambiaAttackAtacado,
			int cambiaDefAtacado, int cambiaSpAttackAtacado, int cambiaSpDefAtacado, int cambiaSpeedAtacado, Estados aplicaestado) {
		super();
		this.idMovimiento = idMovimiento;
		this.nombre = nombre;
		this.tipo = tipo;
		this.categoria = categoria;
		this.maxPP = maxPP;
		this.actualPP = actualPP;
		this.damage = damage;
		this.cambiaAttackAtacante = cambiaAttackAtacante;
		this.cambiaDefAtacante = cambiaDefAtacante;
		this.cambiaSpAttackAtacante = cambiaSpAttackAtacante;
		this.cambiaSpDefAtacante = cambiaSpDefAtacante;
		this.cambiaSpeedAtacante = cambiaSpeedAtacante;
		this.cambiaAttackAtacado =cambiaAttackAtacado;
		this.cambiaDefAtacado=cambiaDefAtacado;
		this.cambiaSpAttackAtacado=cambiaSpAttackAtacado;
		this.cambiaSpDefAtacado=cambiaSpDefAtacado;
		this.cambiaSpeedAtacado=cambiaSpeedAtacado;
		this.aplicaEstado = aplicaestado;
	}

	
	// Getters y setters
	
	public int getIdMovimiento() {
		return idMovimiento;
	}

	public ListaMovimientos getNombre() {
		return nombre;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public int getActualPP() {
		return actualPP;
	}

	public int getDamage() {
		return damage;
	}

	public int getCambiaAttack() {
		return cambiaAttackAtacante;
	}

	public int getCambiaDef() {
		return cambiaAttackAtacante;
	}

	public int getCambiaSpAttack() {
		return cambiaSpAttackAtacante;
	}

	public int getCambiaSpDef() {
		return cambiaSpDefAtacante;
	}

	public int getCambiaSpeed() {
		return cambiaSpeedAtacante;
	}

	public Estados getAplicaestado() {
		return aplicaEstado;
	}


	public int getCambiaDefAtacante() {
		return cambiaDefAtacante;
	}


	public void setCambiaDefAtacante(int cambiaDefAtacante) {
		this.cambiaDefAtacante = cambiaDefAtacante;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public int getCambiaAttackAtacado() {
		return cambiaAttackAtacado;
	}


	public void setCambiaAttackAtacado(int cambiaAttackAtacado) {
		this.cambiaAttackAtacado = cambiaAttackAtacado;
	}


	public int getCambiaDefAtacado() {
		return cambiaDefAtacado;
	}


	public void setCambiaDefAtacado(int cambiaDefAtacado) {
		this.cambiaDefAtacado = cambiaDefAtacado;
	}


	public int getCambiaSpAttackAtacado() {
		return cambiaSpAttackAtacado;
	}


	public void setCambiaSpAttackAtacado(int cambiaSpAttackAtacado) {
		this.cambiaSpAttackAtacado = cambiaSpAttackAtacado;
	}


	public int getCambiaSpDefAtacado() {
		return cambiaSpDefAtacado;
	}


	public void setCambiaSpDefAtacado(int cambiaSpDefAtacado) {
		this.cambiaSpDefAtacado = cambiaSpDefAtacado;
	}


	public int getCambiaSpeedAtacado() {
		return cambiaSpeedAtacado;
	}


	public void setCambiaSpeedAtacado(int cambiaSpeedAtacado) {
		this.cambiaSpeedAtacado = cambiaSpeedAtacado;
	}
		
	
	// Métodos
		
	
	
}
