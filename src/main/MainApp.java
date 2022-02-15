package main;

import java.util.Iterator;
import java.util.Scanner;

import enums.Pokedex;
import models.AbstractEntrenador;
import models.EntrenadorHumano;
import models.Pokemon;
import utils.Bienvenida;
import utils.Combate;

public class MainApp {

	public static void main(String[] args) {
		
		Bienvenida bienvenida = new Bienvenida();
		
		
		bienvenida.welcomeLogic();
		
		
	}

}
