package models;

import java.util.ArrayList;

import enums.Estados;
import enums.ListaMovimientos;
import enums.Pokedex;
import enums.Tipos;

public class Pokemon {

	// Propiedades
	private int id;
	private Pokedex nombre;
	private Tipos tipo1, tipo2;
	private Estados estado;
	private int baseSpeed, nivel, baseHP;
	private double baseAttack, baseDefense, baseSpecialAttack, baseSpecialDefense, maxHP, actualHP;
	private ArrayList<Movimiento> movimientos;

	// Constructor
	/**
	 * Constructor de Pokemon.
	 * 
	 * @param id                 - entero que sirve de identificador en Pokedex.
	 * @param nombre             - enum del nombre del Pokemon almacenado con el
	 *                           resto de Pokemon.
	 * @param tipo1              - enum que representa el tipo de Pokemon.
	 * @param tipo2              - enum que representa el tipo2 (si lo tiene) de
	 *                           Pokemon.
	 * @param estado             - estados especiales. Lo inicializaremos sin estado
	 *                           particular.
	 * @param baseAttack         - double con el ataque base
	 * @param baseDefense        - double con la defensa base
	 * @param baseSpecialAttack  - double con el ataque especial base
	 * @param baseSpecialDefense - double con la defensa especial base
	 * @param baseSpeed          - double con la velocidad base
	 * @param movimientos        - ArrayList que almacena los ataques del Pokémon
	 * @param baseHP             - double con los puntos de vida base
	 * @param maxHP              - double calculado con una fórmula con la que se
	 *                           obtienen los puntos de vida máximos
	 * @param actualHP           - inicializaremos el Pokemon con los mismos puntos
	 *                           de vida actuales que los máximos
	 * @param nivel              - int que representa el nivel del Pokemon
	 */
	public Pokemon(int id, Pokedex nombre, Tipos tipo1, Tipos tipo2, Estados estado, double baseAttack,
			double baseDefense, double baseSpecialAttack, double baseSpecialDefense, int baseSpeed,
			ArrayList<Movimiento> movimientos, int baseHP, double maxHP, double actualHP, int nivel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = Estados.sin_estado;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpecialAttack = baseSpecialAttack;
		this.baseSpecialDefense = baseSpecialDefense;
		this.baseSpeed = baseSpeed;
		this.movimientos = movimientos;
		this.baseHP = baseHP;
		this.maxHP = this.getMaxHP();
		this.actualHP = this.getMaxHP();
		this.nivel = nivel;
	}

	// Getters y setters
	public int getid() {
		return id;
	}

	public Pokedex getNombre() {
		return nombre;
	}

	public Tipos getTipo1() {
		return tipo1;
	}

	public Tipos getTipo2() {
		return tipo2;
	}

	public Estados getEstado() {
		return estado;
	}

	/**
	 * NO SE HA USADO Getter que calcula el ataque del Pokemon.
	 * 
	 * @return double con ataque del pokemon.
	 */
	public double getAttack() {

		int dv;
		do {
			dv = (int) (Math.random() * 18);
		} while (dv > 15 || dv == 0);

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		double attack = ((((this.baseAttack + dv) * 2 + ((int) (Math.sqrt(statExp)) / 4)) * this.nivel) / 100) + 5;

		return attack;
	}

	/**
	 * NO SE HA USADO Método con el que se obtiene la defensa del Pokemon
	 * 
	 * @return un double con la defensa del Pokemon
	 */
	public double getDefense() {

		int dv;
		do {
			dv = (int) (Math.random() * 18);
		} while (dv > 15 || dv == 0);

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		double defense = ((((this.baseDefense + dv) * 2 + ((int) (Math.sqrt(statExp)) / 4)) * this.nivel) / 100) + 5;

		return defense;
	}

	/**
	 * NO SE HA USADO Método con el que se obtiene el ataque especial del Pokemon
	 * 
	 * @return un double con el ataque especial del Pokemon
	 */
	public double getSpecialAttack() {

		int dv;
		do {
			dv = (int) (Math.random() * 18);
		} while (dv > 15 || dv == 0);

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		double specialAttack = ((((this.baseSpecialAttack + dv) * 2 + ((int) (Math.sqrt(statExp)) / 4)) * this.nivel)
				/ 100) + 5;

		return specialAttack;

	}

	/**
	 * NO SE HA USADO Método con el que se obtiene la defensa especial del Pokemon
	 * 
	 * @return un double con la deefensa especial del Pokemon
	 */
	public double getSpecialDefense() {

		int dv;
		do {
			dv = (int) (Math.random() * 18);
		} while (dv > 15 || dv == 0);

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		double specialDefense = ((((this.baseSpecialDefense + dv) * 2 + ((int) (Math.sqrt(statExp)) / 4)) * this.nivel)
				/ 100) + 5;

		return specialDefense;
	}

	/**
	 * NO SE HA USADO Método con el que se obtiene la velocidad del Pokemon
	 * 
	 * @return un double con la velocidad del Pokemon
	 */
	public int getSpeed() {

		int dv;
		do {
			dv = (int) (Math.random() * 18);
		} while (dv > 15 || dv == 0);

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		/**
		 * Cálculo de Stats para las generaciones I y II
		 */
		int speed = ((((this.baseSpeed + dv) * 2 + ((int) (Math.sqrt(statExp)) / 4)) * this.nivel) / 100) + 5;

		return speed;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public double getActualHP() {
		return actualHP;
	}

	public int getNivel() {
		return nivel;
	}

	// Métodos
	public Movimiento elegirMovimiento() {
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBaseSpeed() {
		return baseSpeed;
	}

	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}

	public int getBaseHP() {
		return baseHP;
	}

	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	public double getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(double baseAttack) {
		this.baseAttack = baseAttack;
	}

	public double getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(double baseDefense) {
		this.baseDefense = baseDefense;
	}

	public double getBaseSpecialAttack() {
		return baseSpecialAttack;
	}

	public void setBaseSpecialAttack(double baseSpecialAttack) {
		this.baseSpecialAttack = baseSpecialAttack;
	}

	public double getBaseSpecialDefense() {
		return baseSpecialDefense;
	}

	public void setBaseSpecialDefense(double baseSpecialDefense) {
		this.baseSpecialDefense = baseSpecialDefense;
	}

	public void setNombre(Pokedex nombre) {
		this.nombre = nombre;
	}

	public void setTipo1(Tipos tipo1) {
		this.tipo1 = tipo1;
	}

	public void setTipo2(Tipos tipo2) {
		this.tipo2 = tipo2;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public void setActualHP(double d) {
		this.actualHP = d;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setMaxHP(double d) {
		this.maxHP = d;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	/**
	 * Método para obtener los puntos de vida máximos
	 * 
	 * @return - double con los puntos de vida máximos
	 */
	public double getMaxHP() {

		/**
		 * In generations I and II, the HP IV is calculated by taking the least
		 * significant bit or LSB (the final binary digit) of the Attack, Defense,
		 * Speed, and Special IVs, then creating a binary string by placing them in that
		 * order.
		 */

		int attackLSB;
		int defenseLSB;
		int speedLSB;
		int specialLSB;

		int statExp = 5000; // Establecemos la Stat Experience a 5000 para todos los Pokémon.

		if (this.baseAttack % 2 == 0) {
			attackLSB = 0;
		} else {
			attackLSB = 1;
		}

		if (this.baseDefense % 2 == 0) {
			defenseLSB = 0;
		} else {
			defenseLSB = 1;
		}

		if (this.baseSpeed % 2 == 0) {
			speedLSB = 0;
		} else {
			speedLSB = 1;
		}

		if (((this.baseSpecialAttack + this.baseSpecialDefense) / 2) % 2 == 0) {
			specialLSB = 0;
		} else {
			specialLSB = 1;
		}

		String concatLSB = String.valueOf(attackLSB + "" + defenseLSB + "" + speedLSB + "" + specialLSB);
		int dv = Integer.parseInt(concatLSB, 2); // Transformo la cadena binaria en un número decimal.

		/**
		 * Cálculo de HP para las generaciones I y II No puedo llamar a this.nivel por
		 * alguna razón, así que he establecido nivel 10:
		 */
		double maxHP = ((((this.baseHP + dv) * 2 + (((int) (Math.sqrt(statExp)) / 4))) * 10) / 100) + 10 + 10;

		return maxHP;
	}

	/**
	 * Método que comprueba si el Pokemon está quemado. En ese caso le quita un 10%
	 * de HP
	 */
	public void checkEstado() {
		if (this.estado.equals(Estados.quemado)) {
			this.setActualHP(this.actualHP - this.actualHP * 0.1);
			System.out.println(this.getNombre() + "está quemado y ha perdido HP.");
		}
	}

	/**
	 * Método que indica si el Pokemon se ha desmayado y le cambia el estado a
	 * debilitado.
	 * 
	 * @return true: está desmayado; false: no está desmayado
	 */
	public boolean fainted() {
		if (this.actualHP <= 0) {
			this.estado = Estados.debilitado;
			return true;
		} else {
			return false;
		}
	}
}
