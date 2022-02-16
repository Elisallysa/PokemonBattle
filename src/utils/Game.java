package utils;

import java.util.ArrayList;
import java.util.Scanner;

import enums.Categoria;
import enums.Estados;
import enums.ListaMovimientos;
import enums.Pokedex;
import enums.Tipos;
import models.EntrenadorCPU;
import models.EntrenadorHumano;
import models.Movimiento;
import models.Pokemon;

public class Game {

	// Atributos
	private EntrenadorHumano entrenador;
	private EntrenadorCPU cpu;
	private Combate pokeCombate;

	// Getters and setters
	public EntrenadorHumano getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(EntrenadorHumano entrenador) {
		this.entrenador = entrenador;
	}

	public EntrenadorCPU getCpu() {
		return cpu;
	}

	public void setCpu(EntrenadorCPU cpu) {
		this.cpu = cpu;
	}

	public Combate getPokeCombate() {
		return pokeCombate;
	}

	public void setPokeCombate(Combate pokeCombate) {
		this.pokeCombate = pokeCombate;
	}

	public void welcomeLogic() {
		Scanner s = new Scanner(System.in);

		/**
		 * Creación de Pokémon y sus movimientos:
		 */
		ArrayList<Movimiento> mov_bulbasaur = new ArrayList<Movimiento>();
		ArrayList<Movimiento> mov_squirtle = new ArrayList<Movimiento>();
		ArrayList<Movimiento> mov_charmander = new ArrayList<Movimiento>();

		Movimiento placaje = new Movimiento(1, ListaMovimientos.PLACAJE, Tipos.Normal, Categoria.físico, 35, 35, 40, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento drenadoras = new Movimiento(2, ListaMovimientos.DRENADORAS, Tipos.Planta, Categoria.de_estado, 10,
				10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento grunido = new Movimiento(3, ListaMovimientos.GRUÑIDO, Tipos.Normal, Categoria.de_estado, 40, 40, 0,
				0, 0, 0, 0, 0, -1, 0, 0, 0, 0, null);
		Movimiento latigo_cepa = new Movimiento(4, ListaMovimientos.LÁTIGO_CEPA, Tipos.Planta, Categoria.físico, 25, 25,
				45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento pistola_agua = new Movimiento(5, ListaMovimientos.PISTOLA_AGUA, Tipos.Agua, Categoria.especial, 25,
				25, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento refugio = new Movimiento(6, ListaMovimientos.REFUGIO, Tipos.Normal, Categoria.de_estado, 35, 35, 0,
				1, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento latigo = new Movimiento(7, ListaMovimientos.LÁTIGO, Tipos.Normal, Categoria.de_estado, 30, 30, 0, 0,
				0, 0, 0, 0, 0, -1, 0, 0, 0, null);
		Movimiento aranazo = new Movimiento(8, ListaMovimientos.ARAÑAZO, Tipos.Normal, Categoria.físico, 35, 35, 40, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento ascuas = new Movimiento(9, ListaMovimientos.ASCUAS, Tipos.Fuego, Categoria.especial, 25, 25, 40, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, Estados.quemado);
		Movimiento pantalla_humo = new Movimiento(10, ListaMovimientos.PANTALLA_DE_HUMO, Tipos.Normal,
				Categoria.de_estado, 20, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);

		mov_bulbasaur.add(placaje);
		mov_bulbasaur.add(drenadoras);
		mov_bulbasaur.add(grunido);
		mov_bulbasaur.add(latigo_cepa);

		mov_squirtle.add(placaje);
		mov_squirtle.add(pistola_agua);
		mov_squirtle.add(refugio);
		mov_squirtle.add(latigo);

		mov_charmander.add(aranazo);
		mov_charmander.add(ascuas);
		mov_charmander.add(grunido);
		mov_charmander.add(pantalla_humo);

		Pokemon Bulbasaur = new Pokemon(1, Pokedex.Bulbasaur, Tipos.Planta, null, Estados.sin_estado, 49, 49, 65, 65,
				45, mov_bulbasaur, 45, 0, 0, 10);
		Pokemon Squirtle = new Pokemon(7, Pokedex.Squirtle, Tipos.Agua, null, Estados.sin_estado, 48, 65, 50, 64, 43,
				mov_squirtle, 44, 0, 0, 10);
		Pokemon Charmander = new Pokemon(4, Pokedex.Charmander, Tipos.Fuego, null, Estados.sin_estado, 52, 43, 60, 50,
				65, mov_charmander, 39, 0, 0, 10);

		String trainer = "";

		/**
		 * Bienvenida del juego en la que se pregunta el sexo y el nombre del jugador.
		 */
		System.out.println(
				"Te damos la bienvenida al SIMULADOR DE COMBATES POKÉMON\nNo quiero hacer suposiciones, así que dime:\n¿Con qué género te identificas?");

		String sexo;
		do {
			System.out.println("¿Masculino (M), femenino (F) u otro (O)?");
			sexo = s.nextLine();
		} while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("O"));

		try {
			if (sexo.equalsIgnoreCase("M")) {
				trainer = "entrenador";
			}
			if (sexo.equalsIgnoreCase("F")) {
				trainer = "entrenadora";
			}
			if (sexo.equalsIgnoreCase("O")) {
				trainer = "entrenadxrx";
			}
		} catch (Exception e) {
			System.out.println("Por favor, introduce M, F u O.");
		}

		System.out.println("Muy bien. Supongo que si estás aquí es porque quieres ser " + trainer
				+ " Pokémon.\nDime tu nombre, por favor:");

		// Si es un nombre muy largo te obliga a cambiarlo por uno más corto:
		String trainerName;
		do {
			trainerName = s.nextLine();

			try {
				if (trainerName.length() > 20) {
					System.out.println(
							"Uy, qué nombre tan largo tienes. Creo que somos amigos, ¿no? ¡Dime la forma corta!");
				}
			} catch (Exception e) {
				System.out.println("¿Qué has escrito ahí?");
			}

		} while (trainerName.length() > 20);

		EntrenadorHumano entrenador1 = new EntrenadorHumano(trainerName, null);
		EntrenadorCPU cpu = new EntrenadorCPU(null, null);

		pokeCombate = new Combate();

		pokeCombate.setEntrenadorHumano(entrenador1);
		pokeCombate.setEntrenadorCPU(cpu);

		System.out.println("¡Ya estamos listos! ¿Qué Pokémon vas a elegir?");

		int option;

		// Se controla la elección con el while del bucle do-while.
		do {
			System.out.println("1. Bulbasaur\n2. Charmander\n3. Squirtle\nEscribe el número:");
			option = Integer.parseInt(s.nextLine());
		} while (option != 1 && option != 2 && option != 3);

		// Para no combatir con el mismo Pokémon se elige aleatoriamente uno de los
		// otros dos.
		switch (option) {
		case 1:
			entrenador1.getEquipo().addPokemon(Bulbasaur);
			if (Math.round(Math.random()) == 0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Charmander);
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Squirtle);
			}

			break;
		case 2:
			entrenador1.getEquipo().addPokemon(Charmander);
			if (Math.round(Math.random()) == 0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Bulbasaur);
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Squirtle);
			}
			break;
		case 3:
			entrenador1.getEquipo().addPokemon(Squirtle);
			if (Math.round(Math.random()) == 0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Charmander);
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Bulbasaur);
			}
		}

		System.out.println("¡Muy bien!\n" + pokeCombate.getEntrenadorCPU().getNombre() + " va a usar a "
				+ pokeCombate.getEntrenadorCPU().getEquipo().getFirstPokemon().getNombre().getName() + ".");

		Pokemon rival = pokeCombate.getEntrenadorCPU().getEquipo().getFirstPokemon();
		Pokemon miPokemon = pokeCombate.getEntrenadorHumano().getEquipo().getFirstPokemon();

		/**
		 * INICIO DEL COMBATE. Se establece el orden según la velocidad del Pokémon. En
		 * cada ataque se comprueba si el otro Pokémon ha muerto. Si es así se termina
		 * el combate y se muestra quién es el ganador. Se comprueba también en cada
		 * ronda para jugar otra más o acabar el combate si alguno de los dos Pokémon ha
		 * muerto.
		 */
		if (pokeCombate.empiezaCPU()) {
			System.out.println("Empieza " + pokeCombate.getEntrenadorCPU().getNombre() + ".");

			do {
				pokeCombate.aplicaMovimientoRandom();
				if (miPokemon.fainted()) {
					break;
				}
				rival.checkEstado();
				pokeCombate.eligeAtaque();
				if (rival.fainted()) {
					break;
				}
				miPokemon.checkEstado();
			} while (!miPokemon.fainted() || !rival.fainted());

		} else {
			System.out.println("Empiezas tú, " + pokeCombate.getEntrenadorHumano().getNombre() + ".");

			do {
				pokeCombate.eligeAtaque();
				if (rival.fainted()) {
					break;
				}
				miPokemon.checkEstado();
				pokeCombate.aplicaMovimientoRandom();
				if (miPokemon.fainted()) {
					break;
				}
				rival.checkEstado();
			} while (!miPokemon.fainted() || !rival.fainted());

			// Se muestra el resultado del combate
			if (miPokemon.fainted()) {
				System.out.println("El" + rival.getNombre() + " rival ha ganado el combate.");
			} else if (rival.fainted()) {
				System.out.println("Has ganado el combate.");
			}

		}

	}

}
