package main;

import java.util.Iterator;
import java.util.Scanner;

import models.AbstractEntrenador;
import models.Combate;
import models.EntrenadorHumano;
import models.Pokedex;
import models.Pokemon;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		/**
		 * Creaci�n de Pok�mon:
		 */
		
		Pokemon Bulbasaur = new Pokemon (1, Pokedex.Bulbasaur, null, null, null, 49, 49, 65, 65, 45, null, 0, 0, 10);
		Pokemon Squirtle = new Pokemon (7, Pokedex.Squirtle, null, null, null, 48, 65, 50, 64, 43, null, 0, 0, 10);
		Pokemon Charmander = new Pokemon (4, Pokedex.Charmander, null, null, null, 52, 43, 60, 50, 65, null, 0, 0, 10);
		
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
		
		System.out.println("�Ya estamos listos!�Ahora elige hasta tres Pok�mon para formar tu equipo!");
		System.out.println("LISTA POK�MON: 1. 2. 3. 4.");

		
		// entrenador1.getEquipo().addPokemon();
		
		
		
	}

}
