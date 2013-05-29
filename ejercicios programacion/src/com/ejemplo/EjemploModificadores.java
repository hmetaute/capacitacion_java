package com.ejemplo;

public class EjemploModificadores {
	
	public String metodoPublico(){
		return "soy publico";
	}
	
	private String metodoPrivado(){
		return "soy privado";
	}
	
	public String llamoAPrivado(){
		return metodoPrivado();
	}
	
	public static String metodoEstatico(){
		return "soy un metodo estatico";
	}

}
