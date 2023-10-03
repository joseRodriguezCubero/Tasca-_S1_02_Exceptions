package n3exercici1;

import java.util.ArrayList;

public class GestionButacas {
	// Contindrà un ArrayList de butaques i els mètodes necessaris per afegir,
	// eliminar i cercar les butaques a l’ArrayList.

	private ArrayList<Butaca> butacas;

	// Constructor: No rebrà paràmetres i inicialitzarà l’ArrayList de butaques.
	public GestionButacas() {
		butacas = new ArrayList<Butaca>();
	}

	// getButaques: Retornarà l’atribut butaques.
	public ArrayList<Butaca> getButacas() {
		return butacas;
	}

	// afegirButaca: serà l’encarregat d’afegir una butaca al vector de butaques.
	// Rebrà com a paràmetre un objecte de la classe Butaca i l’afegirà a
	// l’ArrayList. Si la fila i el seient de la butaca rebuda com a paràmetre
	// coincideixen amb el d’una butaca que ja es trobi a l’ArrayList (s’utilitzarà
	// el mètode cercarButaca), es llençarà l’excepció personalitzada
	// ExcepcioButacaOcupada.
	public void addButaca(Butaca butaca) throws ExcepcionButacaOcupada {// Allright!
		int posicion = buscarButaca(butaca.getNumeroFila(), butaca.getNumeroAsiento());
		if (posicion == -1) {
			butacas.add(butaca);
		} else {
			throw new ExcepcionButacaOcupada("La butaca ya está ocupada.");
		}

	}

	// eliminarButaca: serà l’encarregat d’eliminar una butaca de l’ArrayList de
	// butaques. Rebrà com a paràmetres el número de fila i el seient i l’eliminarà
	// de l’ArrayList. Si la fila i el seient no coincideixen amb el d’una butaca
	// reservada (s’utilitzarà el mètode cercarButaca), llençarà una excepció
	// personalitzada ExcepcioButacaLliure.
	public void deleteButaca(byte numFila, byte numAsiento) throws ExcepcionButacaLibre {// Allright!
		int posicion = buscarButaca(numFila, numAsiento);

		if (posicion != -1) {
			butacas.remove(posicion);
		} else {
			throw new ExcepcionButacaLibre("La butaca ya está libre.");
		}

	}

	// cercarButaca: Cerca a l’ArrayList de butaques, la butaca que coincideixi amb
	// les dades rebudes com a paràmetre (fila i seient). Si la troba retornarà la
	// posició de la butaca a l’ArrayList i si no la troba retornarà -1.

	public int buscarButaca(byte numFila, byte numAsiento) { // Allright!

		int posicion = -1;

		for (int i = 0; i < butacas.size(); ++i) {
			if (butacas.get(i).getNumeroFila() == numFila && butacas.get(i).getNumeroAsiento() == numAsiento) {
				posicion = i;
			}
		}
		return posicion;
	}
}
