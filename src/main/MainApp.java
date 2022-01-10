package main;

import java.util.Iterator;
import java.util.Scanner;

import enums.Pokedex;
import models.AbstractEntrenador;
import models.Combate;
import models.EntrenadorHumano;
import models.Pokemon;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		/**
		 * Creación de Pokémon:
		 */
		
		Pokemon Bulbasaur = new Pokemon (1, Pokedex.Bulbasaur, null, null, null, 49, 49, 65, 65, 45, null, 45, 0, 0, 10);
		Pokemon Squirtle = new Pokemon (7, Pokedex.Squirtle, null, null, null, 48, 65, 50, 64, 43, null, 44, 0, 0, 10);
		Pokemon Charmander = new Pokemon (4, Pokedex.Charmander, null, null, null, 52, 43, 60, 50, 65, null, 39, 0, 0, 10);
		
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
