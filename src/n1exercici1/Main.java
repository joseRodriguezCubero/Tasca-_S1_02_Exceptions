package n1exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra
		 * classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de
		 * productes i el preu total de la venda.
		 * 
		 * La classe "Venda", té un mètode anomenat calcularTotal() que llança
		 * l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer
		 * una venda primer has d’afegir productes” si la col·lecció de productes està
		 * buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i
		 * guardar la suma de tots els preus dels productes a l’atribut preu total de la
		 * venda.
		 * 
		 * L’excepció personalitzada VendaBuidaException ha de ser filla de la classe
		 * Exception. Al seu constructor li hem de passar el missatge “Per fer una venda
		 * primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar
		 * per pantalla amb el mètode getMessage() de l’excepció.
		 * 
		 * Escriu el codi necessari per a generar i capturar una excepció de tipus
		 * ArrayIndexOutOfBoundsException.
		 * 
		 */

		Producto producto1 = new Producto("Leche", 1.50);
		Producto producto2 = new Producto("Huevos", 1.75);
		Producto producto3 = new Producto("Pan", 1);
		Producto producto4 = new Producto("Mantequilla", 2.50);
		Producto producto5 = new Producto("Anchoas", 4.20);

		ArrayList<Producto> productos = new ArrayList<Producto>();

		Venta cestaCompra1 = new Venta(productos);

		try {
			double total1 = cestaCompra1.calcularTotal();
			System.out.println("El precio total de la primera venta es venta es; " + total1);
		} catch (VentaVaciaException e) {
			System.out.println(e);// salta la excepcion
		}

		ArrayList<Producto> productos2 = new ArrayList<Producto>();
		productos2.add(producto1);
		productos2.add(producto2);
		productos2.add(producto3);
		productos2.add(producto4);
		productos2.add(producto5);

		Venta cestaCompra2 = new Venta(productos2);

		try {
			double total2 = cestaCompra2.calcularTotal();
			System.out.println("El precio total de la segunda venta es venta es: " + total2); // se ejecuta con normalidad
			
		} catch (VentaVaciaException e) {
			e.getMessage();
		}

		try {
			for (int i = 0; i <= productos2.size(); i++) {
				System.out.println(productos.get(i).getNombre() + ", ");
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage()); // falta personalizar mensaje.
		}
	}

}
