package models;

public class EntrenadorCPU extends AbstractEntrenador{

	// Constructor
		
	public EntrenadorCPU(String nombre, Equipo equipo) {
		super(nombre, equipo);
		this.nombre = this.generateName();
	}
	
	// Getters y setters
	
	
	
	// Métodos
	
	public String generateName() {
		
		int num = (int)(Math.random()*10);
		
		switch (num) {
		case 0:
			this.nombre = "Cazabichos";
		break;
		case 1:
			this.nombre = "Ornitólogo";
		break;
		case 2:
			this.nombre = "Motorista";
		break;
		case 3:
			this.nombre = "Montañero";
		break;
		case 4:
			this.nombre = "Campista";
		break;
		case 5:
			this.nombre = "Soldado Rocket";
		break;
		case 6:
			this.nombre = "Supernecio";
		break;
		case 7:
			this.nombre = "Dominguera";
		break;
		case 8:
			this.nombre = "Nadador";
		break;
		case 9:
			this.nombre = "Marinero";
		break;
		default:
			this.nombre = "Calvo";
		}
		return nombre; 
		
	}
	
}
