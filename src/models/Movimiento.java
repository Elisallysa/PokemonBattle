package models;

public class Movimiento {

	// Propiedades
	
	private int idMovimiento;
	private String nombre;
	private TipoPokemon tipo;
	private Categoria categoria;
	private int maxPP;
	private int actualPP;
	private int damage;
	private int cambiaAttack;
	private int cambiaDef;
	private int cambiaSpAttack;
	private int cambiaSpDef;
	private int cambiaSpeed;
	private Estado aplicaestado;
	
	
	// Constructor
	
	public Movimiento(int idMovimiento, String nombre, TipoPokemon tipo, Categoria categoria, int maxPP, int actualPP, int damage, int cambiaAttack,
			int cambiaDef, int cambiaSpAttack, int cambiaSpDef, int cambiaSpeed, Estado aplicaestado) {
		super();
		this.idMovimiento = idMovimiento;
		this.nombre = nombre;
		this.tipo = tipo;
		this.categoria = categoria;
		this.maxPP = maxPP;
		this.actualPP = actualPP;
		this.damage = damage;
		this.cambiaAttack = cambiaAttack;
		this.cambiaDef = cambiaDef;
		this.cambiaSpAttack = cambiaSpAttack;
		this.cambiaSpDef = cambiaSpDef;
		this.cambiaSpeed = cambiaSpeed;
		this.aplicaestado = aplicaestado;
	}
	
	public Movimiento(int idMovimiento) {
		super();
		this.idMovimiento = idMovimiento;
		this.nombre = "Placaje";
		this.tipo = tipo;
		this.categoria = categoria;
		this.maxPP = maxPP;
		this.actualPP = actualPP;
		this.damage = damage;
		this.cambiaAttack = cambiaAttack;
		this.cambiaDef = cambiaDef;
		this.cambiaSpAttack = cambiaSpAttack;
		this.cambiaSpDef = cambiaSpDef;
		this.cambiaSpeed = cambiaSpeed;
		this.aplicaestado = aplicaestado;
	}

	
	// Getters y setters
	
	public int getIdMovimiento() {
		return idMovimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoPokemon getTipo() {
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
		return cambiaAttack;
	}

	public int getCambiaDef() {
		return cambiaDef;
	}

	public int getCambiaSpAttack() {
		return cambiaSpAttack;
	}

	public int getCambiaSpDef() {
		return cambiaSpDef;
	}

	public int getCambiaSpeed() {
		return cambiaSpeed;
	}

	public Estado getAplicaestado() {
		return aplicaestado;
	}
		
	
	// Métodos
		
	
	
}
