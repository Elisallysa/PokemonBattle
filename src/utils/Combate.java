package utils;

import java.util.ArrayList;
import java.util.Scanner;

import models.EntrenadorCPU;
import models.EntrenadorHumano;
import models.Equipo;
import models.Movimiento;
import models.Pokemon;

public class Combate {

	// Propiedades
	private EntrenadorCPU entrenadorCPU;
	private EntrenadorHumano entrenadorHumano;

	// Constructores
	/**
	 * Constructor sin parámetros que crea un combate y reserva memoria para los dos
	 * entrenadores.
	 */
	public Combate() {
		super();
		this.entrenadorCPU = new EntrenadorCPU(null, null);
		this.entrenadorHumano = new EntrenadorHumano(null, null);
	}

	/**
	 * Constructor del combate.
	 * 
	 * @param entrenadorCPU    - Jugador CPU que elige movimientos de forma
	 *                         aleatoria
	 * @param entrenadorHumano - Usuario que jugará la partida.
	 */
	public Combate(EntrenadorCPU entrenadorCPU, EntrenadorHumano entrenadorHumano) {
		super();
		this.entrenadorCPU = entrenadorCPU;
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

	public void setEntrenadorCPU(EntrenadorCPU entrenadorCPU) {
		this.entrenadorCPU = entrenadorCPU;
	}

	// Métodos

	/**
	 * Método que determina mediante la velocidad del Pokémon elegido si empieza el
	 * compate el CPU o el entrenador humano.
	 * 
	 * @return true: empieza el CPU (su Pokémon es más rápido); false: empieza el
	 *         entrenador humano (su Pokémon es más rápido).
	 */
	public boolean empiezaCPU() {
		int speedPokeCPU = entrenadorCPU.getEquipo().getFirstPokemon().getSpeed();
		int speedPokeEntrenador = entrenadorHumano.getEquipo().getFirstPokemon().getSpeed();

		if (speedPokeCPU > speedPokeEntrenador) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que muestra si el Movimiento es efectivo o no, aplica daño, aplica
	 * cambios de estado y de stats.
	 * 
	 * @param mov - Movimiento usado en combate.
	 */
	public void aplicaMovimiento(Movimiento mov) {
		Pokemon atacante = this.entrenadorHumano.getEquipo().getFirstPokemon();
		Pokemon atacado = this.entrenadorCPU.getEquipo().getFirstPokemon();
		System.out.println("Tu " + atacante.getNombre() + " ha usado " + mov.getNombre());
		mov.isEffective(atacado);
		mov.setActualPP(mov.getActualPP() - 1);
		atacado.setActualHP(atacado.getActualHP() - mov.resultingDamage(atacante, atacado));
		mov.cambioEstado(atacado);
		mov.cambioStats(atacante, atacado);
	}

	public boolean isFinished() {
		return true;
	}

	/**
	 * Método con el que el entrenador humano elige el ataque que va a usar su
	 * Pokémon.
	 */
	public void eligeAtaque() {
		ArrayList<Movimiento> movimientos = this.entrenadorHumano.getEquipo().getFirstPokemon().getMovimientos();

		if (movimientos.get(0).getActualPP() != 0 || movimientos.get(1).getActualPP() != 0
				|| movimientos.get(2).getActualPP() != 0 || movimientos.get(3).getActualPP() != 0) {

			Scanner s = new Scanner(System.in);

			int mov = 0;

			// El usuario elige un movimiento que tenga >0 PP.
			do {

				System.out.println("¿Qué va a hacer " + this.entrenadorHumano.getEquipo().getFirstPokemon().getNombre()
						+ "? Introduce el número.");
				System.out.println("1. " + movimientos.get(0).getNombre() + "\t" + movimientos.get(0).getActualPP()
						+ "PP/" + movimientos.get(0).getMaxPP() + "PP");
				System.out.println("2. " + movimientos.get(1).getNombre() + "\t" + movimientos.get(1).getActualPP()
						+ "PP/" + movimientos.get(1).getMaxPP() + "PP");
				System.out.println("3. " + movimientos.get(2).getNombre() + "\t" + movimientos.get(2).getActualPP()
						+ "PP/" + movimientos.get(2).getMaxPP() + "PP");
				System.out.println("4. " + movimientos.get(3).getNombre() + "\t" + movimientos.get(3).getActualPP()
						+ "PP/" + movimientos.get(3).getMaxPP() + "PP");

				// Se controla que se introduce el 1,2,3 o 4.
				do {
					mov = Integer.parseInt(s.nextLine());
					if ((mov != 1) && (mov != 2) && (mov != 3) && (mov != 4)) {
						System.out.println("Por favor, introduce un número del 1-4.");
					}
				} while ((mov != 1) && (mov != 2) && (mov != 3) && (mov != 4));

				if (movimientos.get(mov - 1).getActualPP() == 0) {
					System.out.println("Ese movimiento no tiene PP.");
				}

			} while (movimientos.get(mov - 1).getActualPP() == 0);

			// Disminuimos en 1 los PP del ataque elegido.

			switch (mov) {
			case 1:
				aplicaMovimiento(movimientos.get(0));
				break;
			case 2:
				aplicaMovimiento(movimientos.get(1));
				break;
			case 3:
				aplicaMovimiento(movimientos.get(2));
				break;
			case 4:
				aplicaMovimiento(movimientos.get(3));
				break;

			default:
				break;
			}
		} else {
			System.out.println("No tienes PP para atacar.");
		}

	}

	/**
	 * El CPU atacará con un movimiento elegido aleatoriamente. En este método
	 * también se muestra efectividad, se establecen nuevos estados, stats...
	 */
	public void aplicaMovimientoRandom() {

		int random = 0;
		Pokemon atacado = this.entrenadorHumano.getEquipo().getFirstPokemon();
		Pokemon atacante = this.entrenadorCPU.getEquipo().getFirstPokemon();
		ArrayList<Movimiento> movimientos = atacante.getMovimientos();

		// El CPU atacará si tiene PP en alguno de sus ataques.
		if (movimientos.get(0).getActualPP() != 0 || movimientos.get(1).getActualPP() != 0
				|| movimientos.get(2).getActualPP() != 0 || movimientos.get(3).getActualPP() != 0) {

			do {
				random = (int) (Math.random() * 3.9);
			} while (movimientos.get(random).getActualPP() == 0);

			Movimiento movElegido = movimientos.get(random);
			System.out.println("El " + atacante.getNombre() + " rival ha usado " + movElegido.getNombre());
			movElegido.isEffective(atacado);
			movElegido.setActualPP(movElegido.getActualPP() - 1);
			atacado.setActualHP(atacado.getActualHP() - movElegido.resultingDamage(atacante, atacado));
			movElegido.cambioEstado(atacado);
			movElegido.cambioStats(atacante, atacado);

		} else {
			System.out.println(atacante.getNombre() + " no tiene PP para atacar.");
		}

	}

}
