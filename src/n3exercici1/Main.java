package n3exercici1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Tindrà el main de l’aplicació on s’instanciarà un objecte de la classe Cine i
		 * cridarà al seu mètode iniciar. 
		 * 
		 * L’aplicació un cop s’hagi iniciat, preguntarà
		 * a l’usuari/ària quantes files i quants seients per fila té la sala de cinema.
		 * Un cop introduïdes aquestes dades, es mostrarà el següent menú:
		 * 
		 * 1.- Mostrar totes les butaques reservades.
		 * 
		 * 2.- Mostrar les butaques reservades per una persona.
		 * 
		 * 3.- Reservar una butaca.
		 * 
		 * 4.- Anul·lar la reserva d’una butaca.
		 * 
		 * 5.- Anul·lar totes les reserves d’una persona.
		 * 
		 * 0.- Sortir.
		 */
		
		
		Cine cine1 = new Cine();
		cine1.iniciar();
	}

}
