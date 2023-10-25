package n2exercici1;

public class Main {

	public static void main(String[] args) {
		
		Entrada sc = new Entrada();
		
		String prueba = sc.leerString("Introduzca la palabra");
		
		byte prueba2 = sc.leerByte("Introduzca su edad");
		
		int prueba3 = sc.leerInt("introduzca un número entero");
		
		float prueba4 = sc.leerFloat("introduzca un número con decimales");
		
		double prueba5 = sc.leerDouble("introduzca un dato de tipo double");
		
		char prueba6 = sc.leerChar("introduzca un caracter válido");
		
		boolean prueba7 = sc.leerSiNo("Introduzca si o no");
		
		String esp = " ";
		
		System.out.println(prueba+esp+prueba2+esp+prueba3+esp+prueba4+esp+prueba5+esp+prueba6+esp+prueba7);
		
		

	}

}
