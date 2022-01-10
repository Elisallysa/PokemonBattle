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
		 * Creaci�n de Pok�mon:
		 */
		
		Pokemon Bulbasaur = new Pokemon (1, Pokedex.Bulbasaur, null, null, null, 49, 49, 65, 65, 45, null, 45, 0, 0, 10);
		Pokemon Squirtle = new Pokemon (7, Pokedex.Squirtle, null, null, null, 48, 65, 50, 64, 43, null, 44, 0, 0, 10);
		Pokemon Charmander = new Pokemon (4, Pokedex.Charmander, null, null, null, 52, 43, 60, 50, 65, null, 39, 0, 0, 10);
		
		String trainer = "";
		
		System.out.println("Te damos la bienvenida al SIMULADOR DE COMBATES POK�MON\nNo quiero hacer suposiciones, as� que dime:\n�Con qu� g�nero te identificas?");
		
		String sexo;
		do {
		System.out.println("�Masculino (M), femenino (F) u otro (O)?");	
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
		
		System.out.println("Muy bien. Supongo que si est�s aqu� es porque quieres ser "+trainer+" Pok�mon.\nDime tu nombre, por favor:");
		
		String trainerName;
		do {
			trainerName = s.nextLine();
			
			try {
				if (trainerName.length()>20) {
				System.out.println("Uy, qu� nombre tan largo tienes. Creo que somos amigos, �no? �Dime la forma corta!");
			}
			}catch (Exception e) {
				System.out.println("�Qu� has escrito ah�?");
			}
			
			
		}while (trainerName.length()>20);
		
		Combate pokeCombate = new Combate ();
		EntrenadorHumano entrenador1 = new EntrenadorHumano(trainerName, null);
		
		pokeCombate.setEntrenadorHumano(entrenador1);
		
		System.out.println("�Ya estamos listos! �Qu� Pok�mon vas a elegir?");
		
		int option;
		
		do {
			System.out.println("1. Bulbasaur\n2. Charmander\n3. Squirtle\nEscribe el n�mero:");
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
	
		System.out.println("�Muy bien!\n"+pokeCombate.getEntrenadorCPU().getNombre()+" va a usar a "+pokeCombate.getEntrenadorCPU().getEquipo().getFirstPokemon().getNombre().getName()+".");
		
		
	}

}
