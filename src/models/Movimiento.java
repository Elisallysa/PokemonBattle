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
	private int power;
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
	/**
	 * Constructor de Movimiento.
	 * 
	 * @param idMovimiento           - int para identificar el Movimiento
	 * @param nombre                 - nombre almacenado en una lista enum con todos
	 *                               los movimientos
	 * @param tipo                   - tipo de movimiento, almacenado en una lista
	 *                               de enum con todos los tipos
	 * @param categoria              - categoría de ataque, almacenada en una lista
	 *                               de enum con las 3 categorías de movimiento
	 * @param maxPP                  - Puntos de Movimiento. Cada vez que usas un
	 *                               movimiento, se resta -1
	 * @param actualPP               - PP actuales
	 * @param power                  - poder del ataque
	 * @param cambiaAttackAtacante   - ???
	 * @param cambiaDefAtacante      - ???
	 * @param cambiaSpAttackAtacante - ???
	 * @param cambiaSpDefAtacante    - ???
	 * @param cambiaSpeedAtacante    - ???
	 * @param cambiaAttackAtacado    - ??? CÓMO SE SUPONE QUE DEBERÍA USAR ESTOS
	 *                               ATRIBUTOS???
	 * @param cambiaDefAtacado       - ???
	 * @param cambiaSpAttackAtacado  - ???
	 * @param cambiaSpDefAtacado     - ???
	 * @param cambiaSpeedAtacado     - ???
	 * @param aplicaestado           - ???
	 */
	public Movimiento(int idMovimiento, ListaMovimientos nombre, Tipos tipo, Categoria categoria, int maxPP,
			int actualPP, int power, int cambiaAttackAtacante, int cambiaDefAtacante, int cambiaSpAttackAtacante,
			int cambiaSpDefAtacante, int cambiaSpeedAtacante, int cambiaAttackAtacado, int cambiaDefAtacado,
			int cambiaSpAttackAtacado, int cambiaSpDefAtacado, int cambiaSpeedAtacado, Estados aplicaestado) {
		super();
		this.idMovimiento = idMovimiento;
		this.nombre = nombre;
		this.tipo = tipo;
		this.categoria = categoria;
		this.maxPP = maxPP;
		this.actualPP = actualPP;
		this.power = power;
		this.cambiaAttackAtacante = cambiaAttackAtacante;
		this.cambiaDefAtacante = cambiaDefAtacante;
		this.cambiaSpAttackAtacante = cambiaSpAttackAtacante;
		this.cambiaSpDefAtacante = cambiaSpDefAtacante;
		this.cambiaSpeedAtacante = cambiaSpeedAtacante;
		this.cambiaAttackAtacado = cambiaAttackAtacado;
		this.cambiaDefAtacado = cambiaDefAtacado;
		this.cambiaSpAttackAtacado = cambiaSpAttackAtacado;
		this.cambiaSpDefAtacado = cambiaSpDefAtacado;
		this.cambiaSpeedAtacado = cambiaSpeedAtacado;
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

	public int getPower() {
		return power;
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

	public void setActualPP(int actualPP) {
		this.actualPP = actualPP;
	}

	// Métodos
	/**
	 * Método que calcula el daño infligido
	 * 
	 * @param atacante - Pokemon que usa el movimiento
	 * @param atacado  - Pokemon que recibe el movimiento
	 * @return - double con el daño infligido
	 */
	public double resultingDamage(Pokemon atacante, Pokemon atacado) {

		double resultingDamage = (((((2 * atacante.getNivel() / 5) + 2) * this.getPower()
				* (this.effectiveAttack(atacante) / this.effectiveDefense(atacado))) / 50) + 2);
		return resultingDamage * getEffectiveness(atacado);
	}

	/**
	 * Método que elige el ataque efectivo si se trata de un ataque físico o
	 * especial.
	 * 
	 * @param poke Pokemon que usa el Movimiento
	 * @return el ataque normal del Pokemon si es un ataque físico o el ataque
	 *         especial si es un ataque especial.
	 */
	public double effectiveAttack(Pokemon poke) {

		if (this.categoria.equals(Categoria.físico)) {
			return poke.getAttack();
		} else if (this.categoria.equals(Categoria.especial)) {
			return poke.getBaseSpecialAttack();
		} else {
			return 1;
		}
	}

	/**
	 * Método que elige la defensa efectiva si se trata de un ataque físico o
	 * especial.
	 * 
	 * @param poke Pokemon que recibe el Movimiento
	 * @return la defensa normal del Pokemon si es un ataque físico o la defensa
	 *         especial si es un ataque especial.
	 */
	public double effectiveDefense(Pokemon poke) {

		if (this.categoria.equals(Categoria.físico)) {
			return poke.getBaseDefense();
		} else if (this.categoria.equals(Categoria.especial)) {
			return poke.getBaseSpecialDefense();
		} else {
			return 1;
		}
	}

	/**
	 * Método que determina la efectividad de un Movimiento.
	 * 
	 * @param atacado - Pokemon que recibe el Movimiento
	 * @return un valor que multiplicará el daño del Movimiento.
	 */
	public double getEffectiveness(Pokemon atacado) {

		double effectiveness = 1;

		switch (atacado.getTipo1()) {
		case Agua:

			if (this.getTipo().equals(Tipos.Agua)) {
				effectiveness = 0.5;
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				effectiveness = 0.5;
			} else if (this.getTipo().equals(Tipos.Planta)) {
				effectiveness = 2;
			}

			break;
		case Fuego:

			if (this.getTipo().equals(Tipos.Agua)) {
				effectiveness = 2;
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				effectiveness = 0.5;
			} else if (this.getTipo().equals(Tipos.Planta)) {
				effectiveness = 0.5;
			}

			break;
		case Planta:

			if (this.getTipo().equals(Tipos.Agua)) {
				effectiveness = 0.5;
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				effectiveness = 2;
			} else if (this.getTipo().equals(Tipos.Planta)) {
				effectiveness = 0.5;
			}

			break;

		default:
			effectiveness = 1;
			break;
		}

		return effectiveness;
	}

	/**
	 * Método que muestra por pantalla la efectividad del Movimiento elegido.
	 * 
	 * @param atacado - Pokemon que recibe el ataque
	 */
	public void isEffective(Pokemon atacado) {

		switch (atacado.getTipo1()) {
		case Agua:

			if (this.getTipo().equals(Tipos.Agua)) {
				System.out.println("No es muy efectivo.");
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				System.out.println("No es muy efectivo.");
			} else if (this.getTipo().equals(Tipos.Planta)) {
				System.out.println("¡Es superefectivo!");
			}

			break;
		case Fuego:

			if (this.getTipo().equals(Tipos.Agua)) {
				System.out.println("¡Es superefectivo!");
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				System.out.println("No es muy efectivo.");
			} else if (this.getTipo().equals(Tipos.Planta)) {
				System.out.println("No es muy efectivo.");
			}

			break;
		case Planta:

			if (this.getTipo().equals(Tipos.Agua)) {
				System.out.println("No es muy efectivo.");
			} else if (this.getTipo().equals(Tipos.Fuego)) {
				System.out.println("¡Es superefectivo!");
			} else if (this.getTipo().equals(Tipos.Planta)) {
				System.out.println("No es muy efectivo.");
			}

			break;

		default:
			break;
		}
	}

	/**
	 * Método que aplica cambios de stats
	 * 
	 * @param atacante - Pokemon que usa el movimiento
	 * @param atacado  - Pokemon que recibe el movimiento
	 */
	public void cambioStats(Pokemon atacante, Pokemon atacado) {

		switch (this.getNombre()) {
		case DRENADORAS:
			double drenaje = atacado.getActualHP() * 0.125;
			atacado.setActualHP(atacado.getActualHP() - drenaje);
			atacante.setActualHP(atacante.getActualHP() + drenaje);
			System.out.println(atacante.getNombre() + " ha robado HP a " + atacado.getNombre());
			break;
		case GRUÑIDO:
			atacado.setBaseAttack(atacado.getBaseAttack() - 1);
			System.out.println("Ha bajado el ataque de " + atacado.getNombre());
			break;
		case REFUGIO:
			atacante.setBaseDefense(atacante.getBaseDefense() + 1);
			System.out.println("Ha subido la defensa de " + atacante.getNombre());
			break;
		case LÁTIGO:
			atacado.setBaseDefense(atacado.getBaseDefense() - 1);
			System.out.println("Ha bajado la defensa de " + atacado.getNombre());
			break;

		default:
			break;
		}

	}

	/**
	 * Método que aplica cambios de estado
	 * 
	 * @param atacado - Pokemon que recibe el movimiento
	 */
	public void cambioEstado(Pokemon atacado) {

		// La probabilidad de quemar al rival/curarse es de 1 entre 5.
		if (this.getNombre().equals(ListaMovimientos.ASCUAS) && !atacado.getEstado().equals(Estados.quemado)) {
			int random = (int) (Math.random() * 4.9);
			if (random == 0) {
				atacado.setEstado(Estados.quemado);
				System.out.println("¡Oh, no! " + atacado.getNombre() + " está quemado.");
			}
		} else if (this.getNombre().equals(ListaMovimientos.ASCUAS) && atacado.getEstado().equals(Estados.quemado)) {
			System.out.println(atacado.getNombre() + "sigue quemado.");
		} else if (this.getNombre().equals(ListaMovimientos.ASCUAS) && atacado.getEstado().equals(Estados.quemado)) {
			int random = (int) (Math.random() * 4.9);
			if (random == 0) {
				atacado.setEstado(Estados.sin_estado);
				System.out.println(atacado.getNombre() + " ya no está quemado.");
			}
		}

	}

}
