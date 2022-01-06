package models;

import java.util.ArrayList;

public class Pokemon {

	// Propiedades
	
	private int numero;
	private String nombre;
	private TipoPokemon tipo1;
	private TipoPokemon tipo2;
	private Estado estado;
	private int attack;
	private int defense;
	private int specialAttack;
	private int specialDefense;
	private int speed;
	private ArrayList<Movimiento> movimientos;
	private int maxHP;
	private int actualHP;
	private int nivel;
	
	
	// Constructor
	public Pokemon(int numero, String nombre, TipoPokemon tipo1, TipoPokemon tipo2, Estado estado, int attack,
			int defense, int specialAttack, int specialDefense, int speed, ArrayList<Movimiento> movimientos,
			int maxHP, int actualHP, int nivel) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = estado;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.movimientos = movimientos;
		this.maxHP = maxHP;
		this.actualHP = actualHP;
		this.nivel = nivel;
	}

	
	// Getters y setters
	
	public int getNumero() {
		return numero;
	}


	public String getNombre() {
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


	public double getAttack(int baseStat, int statExp, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		/**
		 * C�lculo de Stats para las generaciones I y II
		 */
		int attack = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		
		return attack;
	}


	public double getDefense(int baseStat, int statExp, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		/**
		 * C�lculo de Stats para las generaciones I y II
		 */
		int defense = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return defense;
	}


	public double getSpecialAttack(int baseStat, int statExp, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		/**
		 * C�lculo de Stats para las generaciones I y II
		 */
		int specialAttack = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return specialAttack;
		
	}


	public double getSpecialDefense(int baseStat, int statExp, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		/**
		 * C�lculo de Stats para las generaciones I y II
		 */
		int specialDefense = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		
		return specialDefense;
	}


	public int getSpeed(int baseStat, int statExp, int level) {
		
		int dv;
		do {
			dv = (int)(Math.random()*18);
		}while(dv>15 || dv==0);
		
		/**
		 * C�lculo de Stats para las generaciones I y II
		 */
		int speed = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+5;
		
		return speed;
	}


	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}


	public double getMaxHP(int baseStat, int statExp, int level) {
		
		/**
		 * In generations I and II, the HP IV is calculated by taking the least significant bit or LSB (the final binary digit) of the Attack,
		 * Defense, Speed, and Special IVs, then creating a binary string by placing them in that order.
		 */
		
		int attackLSB;
		int defenseLSB;
		int speedLSB;
		int specialLSB;
		
		
		if (this.attack%2==0) {
			attackLSB=0;
		}else {
			attackLSB=1;
		}
		
		if (this.defense%2==0) {
			defenseLSB=0;
		}else {
			defenseLSB=1;
		}
		
		if (this.speed%2==0) {
			speedLSB=0;
		}else {
			speedLSB=1;
		}
		
		if (((this.specialAttack+this.specialDefense)/2)%2==0) {
			specialLSB=0;
		}else {
			specialLSB=1;
		}
		
		String concatLSB = String.valueOf(attackLSB+""+defenseLSB+""+speedLSB+""+specialLSB);
		int dv = Integer.parseInt(concatLSB, 2); // Transformo la cadena binaria en un n�mero decimal.
		
		/**
		 * C�lculo de HP para las generaciones I y II
		 */
		int maxHP = ((((baseStat+dv)*2+((int)(Math.sqrt(statExp))/4))*level)/100)+level+10;
		
		return maxHP;
	}


	public double getActualHP() {
		return actualHP;
	}


	public int getNivel() {
		return nivel;
	}
	
	// M�todos
	
	public Movimiento elegirMovimiento() {
		
	}
	
	public void mostrarMovimientos() {
		
	}


	public int getMaxHP() {
		return maxHP;
	}
	
}
