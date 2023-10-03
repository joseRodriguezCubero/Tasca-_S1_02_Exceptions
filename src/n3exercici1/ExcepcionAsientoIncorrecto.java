package n3exercici1;

@SuppressWarnings("serial")
public class ExcepcionAsientoIncorrecto extends Exception {

	public ExcepcionAsientoIncorrecto() {
	}

	public ExcepcionAsientoIncorrecto(String ms_error) {
		super(ms_error);
	}

}
