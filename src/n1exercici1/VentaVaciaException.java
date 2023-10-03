package n1exercici1;



public class VentaVaciaException extends Exception {


	private static final long serialVersionUID = 1L;

	public VentaVaciaException() {
	}

	public VentaVaciaException(String ms_error) {
		super(ms_error);
	}

}
