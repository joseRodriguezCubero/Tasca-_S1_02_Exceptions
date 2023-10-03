package n1exercici1;

import java.util.ArrayList;

public class Venta {

	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private double precioTotalVenta;

	public Venta(ArrayList<Producto> productos) {

		this.productos = productos;
		
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public double getPrecioTotalVenta() {
		return precioTotalVenta;
	}

	public void setPrecioTotalVenta(double precioTotalVenta) {
		this.precioTotalVenta = precioTotalVenta;
	}

	public double calcularTotal() throws VentaVaciaException {

		
		if (productos.size() < 1) {
			throw new VentaVaciaException("Para hacer una venta primero tienes que añadir productos.");
		} else {
			for (int i = 0; i < productos.size(); i++) {
				precioTotalVenta += productos.get(i).getPrecio();
			}
		}

		return precioTotalVenta;
	}

}
