package n3exercici1;

@SuppressWarnings("serial")
public class ExcepcionNombrePersonaIncorrecta extends Exception {

	// introduirPersona: demana a l’usuari/ària el nom de la persona i el retorna si
	// és correcte. Si conté números, llença una excepció personalitzada
	// ExcepcioNomPersonaIncorrecte.
	

		public ExcepcionNombrePersonaIncorrecta() {
		}

		public ExcepcionNombrePersonaIncorrecta(String ms_error) {
			super(ms_error);
		}

	}


