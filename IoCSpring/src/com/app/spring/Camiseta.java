package com.app.spring;

public class Camiseta implements Prendas {
	
	private CreacionPrecios precioNuevo;
	
	
	//Creamos el bean por Setter
	public void setPrecioNuevo(CreacionPrecios precioNuevo) {
		this.precioNuevo = precioNuevo;
	}

	public String getPrenda() {
		return "Esto es una camiseta";
	}
	
	public String getPrecio () {
		return precioNuevo.getPrecio() + "5€";
	}
}
