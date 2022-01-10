package models;

import java.util.ArrayList;

import enums.Pokedex;

public class Pokemon {

	// Propiedades
	
	private int id;
	private Pokedex nombre;
	private TipoPokemon tipo1, tipo2;
	private Estado estado;
	private int baseSpeed, actualHP, nivel, baseHP, maxHP;
	private double baseAttack, baseDefense, baseSpecialAttack, baseSpecialDefense;
	private ArrayList<Movimiento> movimientos;
	
	
	
	// Constructor
	public Pokemon(int id, Pokedex nombre, TipoPokemon tipo1, TipoPokemon tipo2, Estado estado, double baseAttack,
			double baseDefense, double baseSpecialAttack, double baseSpecialDefense, int baseSpeed, ArrayList<Movimiento> movimientos,
			int baseHP, int maxHP, int actualHP, int nivel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = estado;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpecialAttack = baseSpecialAttack;
		this.baseSpecialDefense = baseSpecialDefense;
		this.baseSpeed = baseSpeed;
		this.movimientos = movimientos;
		this.baseHP = baseHP;
		this.maxHP = this.getMaxHP(this.baseHP, this.nivel);
		this.actualHP = actualHP;
		this.nivel = nivel;
	}

	
	// Getters y setters
	
	public int getid() {
		return id;
	}


	public Pokedex getNombre() {
		return nombre;
	}


	public TipoPokemon getTipo1() {
		return tipo1;
	}


	public TipoPokemon getTipo2() {
		return tipo2;
	}


	public Estado getEstado() {
		return estado;
	}


	public double getAttack(int baseAttack, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int attack = ((((baseAttack+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		
		return attack;
	}


	public double getDefense(int baseDefense, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int defense = ((((baseDefense+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return defense;
	}


	public double getSpecialAttack(int baseSpecialAttack, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int specialAttack = ((((baseSpecialAttack+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return specialAttack;
		
	}


	public double getSpecialDefense(int baseSpecialDefense, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int specialDefense = ((((baseSpecialDefense+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		
		return specialDefense;
	}


	public int getSpeed(int baseSpeed, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int speed = ((((baseSpeed+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return speed;
	}


	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}


	public int getMaxHP(int baseHP, int level) {
		
		/**
		 * In generations I and II, the HP IV is calculated by taking the least significant bit or LSB (the final binary digit) of the Attack,
		 * Defense, Speed, and Special IVs, then creating a binary string by placing them in that order.
		 */
		
		int attackLSB;
		int defenseLSB;
		int speedLSB;
		int specialLSB;
		
		int statExp = 5000; //Establecemos la Stat Experience a 5000 para todos los Pokémon.
		
		
		if (this.baseAttack%2==0) {
			attackLSB=0;
		}else {
			attackLSB=1;
		}
		
		if (this.baseDefense%2==0) {
			defenseLSB=0;
		}else {
			defenseLSB=1;
		}
		
		if (this.baseSpeed%2==0) {
			speedLSB=0;
		}else {
			speedLSB=1;
		}
		
		if (((this.baseSpecialAttack+this.baseSpecialDefense)/2)%2==0) {
			specialLSB=0;
		}else {
			specialLSB=1;
		}
		
		String concatLSB = String.valueOf(attackLSB+""+defenseLSB+""+speedLSB+""+specialLSB);
		int dv = Integer.parseInt(concatLSB, 2); // Transformo la cadena binaria en un número decimal.
		
		/**
		 * Cálculo de HP para las generaciones I y II
		 */
		int maxHP = (int)((((baseHP+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+level+10;
		
		return maxHP;
	}


	public double getActualHP() {
		return actualHP;
	}


	public int getNivel() {
		return nivel;
	}
	
	// Métodos
	
	public Movimiento elegirMovimiento() {
		
	}
	
	public void mostrarMovimientos() {
		
	}


	public int getMaxHP() {
		return maxHP;
	}
	
}
