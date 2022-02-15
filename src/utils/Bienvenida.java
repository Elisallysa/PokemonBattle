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

public class Bienvenida {
	
	// Atributos
	private EntrenadorHumano entrenador;
	private EntrenadorCPU cpu;
	
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
	
	
	public void welcomeLogic() {
		Scanner s = new Scanner (System.in);
		
		/**
		 * Creación de Pokémon y sus movimientos:
		 */
		ArrayList<Movimiento> mov_bulbasaur = new ArrayList<Movimiento>();
		ArrayList<Movimiento> mov_squirtle = new ArrayList<Movimiento>();
		ArrayList<Movimiento> mov_charmander = new ArrayList<Movimiento>();
		
		Movimiento placaje = new Movimiento(1, ListaMovimientos.PLACAJE, Tipos.Normal, Categoria.físico, 35, 35, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento drenadoras = new Movimiento(1, ListaMovimientos.DRENADORAS, Tipos.Planta, Categoria.de_estado, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento grunido = new Movimiento(1, ListaMovimientos.GRUÑIDO, Tipos.Normal, Categoria.de_estado,40,40, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, null);
		Movimiento latigo_cepa = new Movimiento(1, ListaMovimientos.LÁTIGO_CEPA, Tipos.Planta, Categoria.físico, 25, 25, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento pistola_agua = new Movimiento(1, ListaMovimientos.PISTOLA_AGUA, Tipos.Agua, Categoria.especial, 25, 25, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento refugio = new Movimiento(1, ListaMovimientos.REFUGIO, Tipos.Normal, Categoria.de_estado, 35, 35, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento latigo = new Movimiento(1, ListaMovimientos.LÁTIGO, Tipos.Normal, Categoria.de_estado, 30, 30, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, null);
		Movimiento aranazo = new Movimiento(1, ListaMovimientos.ARAÑAZO, Tipos.Normal, Categoria.físico, 35, 35, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		Movimiento ascuas = new Movimiento(1, ListaMovimientos.ASCUAS, Tipos.Fuego, Categoria.especial, 25, 25, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Estados.quemado);
		Movimiento pantalla_humo = new Movimiento(1, ListaMovimientos.PANTALLA_DE_HUMO, Tipos.Normal, Categoria.de_estado, 20, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		
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
		
		Pokemon Bulbasaur = new Pokemon (1, Pokedex.Bulbasaur, Tipos.Planta, null, null, 49, 49, 65, 65, 45, mov_bulbasaur, 45, 0, 0, 10);
		Pokemon Squirtle = new Pokemon (7, Pokedex.Squirtle, Tipos.Agua, null, null, 48, 65, 50, 64, 43, mov_squirtle, 44, 0, 0, 10);
		Pokemon Charmander = new Pokemon (4, Pokedex.Charmander, Tipos.Fuego, null, null, 52, 43, 60, 50, 65, mov_charmander, 39, 0, 0, 10);
		
		String trainer = "";
		
		System.out.println("Te damos la bienvenida al SIMULADOR DE COMBATES POKÉMON\nNo quiero hacer suposiciones, así que dime:\n¿Con qué género te identificas?");
		
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
		}catch (Exception e) {
			System.out.println("Por favor, introduce M, F u O.");
		}
		
		System.out.println("Muy bien. Supongo que si estás aquí es porque quieres ser "+trainer+" Pokémon.\nDime tu nombre, por favor:");
		
		String trainerName;
		do {
			trainerName = s.nextLine();
			
			try {
				if (trainerName.length()>20) {
				System.out.println("Uy, qué nombre tan largo tienes. Creo que somos amigos, ¿no? ¡Dime la forma corta!");
			}
			}catch (Exception e) {
				System.out.println("¿Qué has escrito ahí?");
			}
			
			
		}while (trainerName.length()>20);
		
		Combate pokeCombate = new Combate ();
		EntrenadorHumano entrenador1 = new EntrenadorHumano(trainerName, null);
		
		pokeCombate.setEntrenadorHumano(entrenador1);
		
		System.out.println("¡Ya estamos listos! ¿Qué Pokémon vas a elegir?");
		
		int option;
		
		do {
			System.out.println("1. Bulbasaur\n2. Charmander\n3. Squirtle\nEscribe el número:");
			option = Integer.parseInt(s.nextLine());
		} while (option != 1 && option !=2 && option !=3);


		switch (option) {
		case 1:
			entrenador1.getEquipo().addPokemon(Bulbasaur);
			if (Math.round(Math.random())==0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Charmander);	
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Squirtle);
			}
			
			break;
		case 2:
			entrenador1.getEquipo().addPokemon(Charmander);
			if (Math.round(Math.random())==0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Bulbasaur);	
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Squirtle);
			}
			break;
		case 3:
			entrenador1.getEquipo().addPokemon(Squirtle);
			if (Math.round(Math.random())==0) {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Charmander);	
			} else {
				pokeCombate.getEntrenadorCPU().getEquipo().addPokemon(Bulbasaur);
			}
		}

		System.out.println("¡Muy bien!\n"+pokeCombate.getEntrenadorCPU().getNombre()+" va a usar a "+pokeCombate.getEntrenadorCPU().getEquipo().getFirstPokemon().getNombre().getName()+".");
	}



	
	
}
