package com.app.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		//Conectamos el applicationContext a nuestra clase para poder usar los Beans
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Llamamos a los beans
		Prendas prenda1 = contexto.getBean("miPrenda",Prendas.class);
		Prendas prenda2 = contexto.getBean("miCamiseta", Prendas.class);
		
		//Comprobamos que funcionen correctamente
		System.out.println(prenda1.getPrenda());
		System.out.println(prenda1.getPrecio());
		
		System.out.println(prenda2.getPrenda());
		System.out.println(prenda2.getPrecio());
		

	}

}
