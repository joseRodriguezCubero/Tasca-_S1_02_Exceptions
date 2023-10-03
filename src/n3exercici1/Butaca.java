package n3exercici1;

public class Butaca {

	private byte numeroFila;
	private byte numeroAsiento;
	private String Persona;

	public Butaca(byte numeroFila, byte numeroAsiento, String persona) {
		this.numeroFila = numeroFila;
		this.numeroAsiento = numeroAsiento;
		Persona = persona;
	}

	public byte getNumeroFila() {
		return numeroFila;
	}

	public byte getNumeroAsiento() {
		return numeroAsiento;
	}

	public String getPersona() {
		return Persona;
	}

	// Equals: retornarà que dues butaques són iguales si la fila i el seient són iguals.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butaca other = (Butaca) obj;
		return numeroAsiento == other.numeroAsiento && numeroFila == other.numeroFila;
	}

	
	@Override
	public String toString() {
		return "Butaca [Fila nº = " + numeroFila + ", Asiento nº = " + numeroAsiento + ", A nombre de = " + Persona + "]";
	}

}
