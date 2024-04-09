package com.app.spring;

public class Pantalones implements Prendas {

	private CreacionPrecios precioNuevo;
	
	
	//Creamos el Bean por Constructor
	public Pantalones(CreacionPrecios precioNuevo) {
		this.precioNuevo = precioNuevo;
	}

	@Override
	public String getPrenda() {
		// TODO Auto-generated method stub
		return "Esto es un pantalón";
	}

	@Override
	public String getPrecio() {
		
		return precioNuevo.getPrecio() + "10€";
	}

}
