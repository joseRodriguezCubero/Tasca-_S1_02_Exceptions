package n3exercici1;

import n2exercici1.Entrada;

public class Cine {

	private byte numeroFilas;
	private byte numeroAsientosPorFila;
	private GestionButacas gestionButacas;

	public Cine() {
		this.gestionButacas = new GestionButacas();
		pedirDatosIniciales();
	}

	public void iniciar() {
		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				mostrarButacas();
				break;
			case 2:
				mostrarButacasPersona();
				break;
			case 3:
				try {
					reservarButaca();
				} catch (ExcepcionFilaIncorrecta e) {
					e.getMessage();
					System.out.println(e);
				} catch (ExcepcionAsientoIncorrecto e) {
					e.getMessage();
					System.out.println(e);
				} catch (ExcepcionNombrePersonaIncorrecta e) {
					e.getMessage();
					System.out.println(e);
				} catch (ExcepcionButacaOcupada e) {
					e.getMessage();
					System.out.println(e);
				}

				break;
			case 4:
				try {
					anularReserva();
				} catch (ExcepcionFilaIncorrecta e) {
					e.getMessage();
					System.out.println(e);
				} catch (ExcepcionAsientoIncorrecto e) {
					e.getMessage();
					System.out.println(e);
				} catch (ExcepcionButacaLibre e) {
					e.getMessage();
					System.out.println(e);
				}
				break;
			case 5:
				try {
					anularReservaPersona();
				} catch (ExcepcionNombrePersonaIncorrecta e) {
					e.getMessage();
					System.out.println(e);
				}
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);

	}

	public byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			opcion = Entrada.leerByte("\n MENÚ PRINCIPAL " 
										+ "\n1.Mostrar todas las butacas reservadas."
										+ "\n2.Mostrar todas las butacas reservadas por persona." 
										+ "\n3.Reservar una butaca."
										+ "\n4.Anular la reserva de butaca." 
										+ "\n5.Anular todas las reservas de una persona."
										+ "\n0.Salir.");
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoje una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public void mostrarButacas() {
		for (int i = 0; i < gestionButacas.getButacas().size(); i++) {
			System.out.println(gestionButacas.getButacas().get(i).toString());
		}
	}

	public void mostrarButacasPersona() {
		String nombre = Entrada.leerString("Introduzca el nombre");
		for (int i = 0; i < gestionButacas.getButacas().size(); i++) {
			if (gestionButacas.getButacas().get(i).getPersona().equals(nombre)) {
				System.out.println(gestionButacas.getButacas().get(i).toString());
			}
		}

	}

	public void reservarButaca() throws ExcepcionFilaIncorrecta, ExcepcionAsientoIncorrecto,
			ExcepcionNombrePersonaIncorrecta, ExcepcionButacaOcupada {
		byte numeroFila = introducirFila();
		byte numeroAsiento = introducirAsiento();
		String persona = introducirPersona();
		Butaca butaca = new Butaca(numeroFila, numeroAsiento, persona);
		gestionButacas.addButaca(butaca);
	}

	public void anularReserva() throws ExcepcionFilaIncorrecta, ExcepcionAsientoIncorrecto, ExcepcionButacaLibre {// Allright!
		byte numeroFila = introducirFila();
		byte numeroAsiento = introducirAsiento();
		gestionButacas.deleteButaca(numeroFila, numeroAsiento);

	}

	public void anularReservaPersona() throws ExcepcionNombrePersonaIncorrecta {
		String persona = introducirPersona();
		for (int i = 0; i < gestionButacas.getButacas().size(); i++) {
			if (gestionButacas.getButacas().get(i).getPersona().equals(persona)) {
				gestionButacas.getButacas().remove(gestionButacas.getButacas().get(i));
			}
		}
	}

	public String introducirPersona() throws ExcepcionNombrePersonaIncorrecta {

		String nombrePersona = Entrada.leerString("Introduzca nombre de la persona.");

		if ((nombrePersona.matches(".*[0-9].*"))) {
			throw new ExcepcionNombrePersonaIncorrecta("Nombre de persona incorrecta.");
		} else {
			return nombrePersona;
		}
	}

	public void pedirDatosIniciales() {
		this.numeroFilas = Entrada.leerByte("Introduzca el número de filas.");
		this.numeroAsientosPorFila = Entrada.leerByte("Introduzca número de asientos por fila.");
	}

	public byte introducirFila() throws ExcepcionFilaIncorrecta {
		byte numeroFila = Entrada.leerByte("Introduzca el número de fila.");

		if ((numeroFila > 0) && (numeroFila <= numeroFilas)) {
			return numeroFila;

		} else {
			throw new ExcepcionFilaIncorrecta("Numero de fila erroneo.");
		}

	}

	public byte introducirAsiento() throws ExcepcionAsientoIncorrecto {
		byte numeroAsiento = Entrada.leerByte("Introduzca el número de asiento.");

		if ((numeroAsiento > 0) && (numeroAsiento <= numeroAsientosPorFila)) {
			return numeroAsiento;
		} else {
			throw new ExcepcionAsientoIncorrecto("Numero de asiento erroneo.");
		}

	}

}
