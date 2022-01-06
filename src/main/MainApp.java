package main;

import java.util.Iterator;
import java.util.Scanner;

import models.AbstractEntrenador;
import models.Combate;
import models.EntrenadorHumano;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		String trainer = "";
		
		System.out.println("Te damos la bienvenida al SIMULADOR DE COMBATES POKÉMON\nNo quiero hacer suposiciones, así que dime:\n¿Con qué género te identificas? ¿Masculino (M), femenino (F) u otro (O)");
		
		String sexo = s.nextLine();
		
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
				System.out.println("¿Qué has escrito ahí? Venga, dime tu nombre real.");
			}
			
			
		}while (trainerName.length()>20);
		
		Combate pokeCombate = new Combate ();
		EntrenadorHumano entrenador1 = new EntrenadorHumano(trainerName, null);
		
		pokeCombate.setEntrenadorHumano(entrenador1);
		
		
		
		
		
	}

}
