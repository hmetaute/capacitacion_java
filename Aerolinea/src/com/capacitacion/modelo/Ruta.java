package com.capacitacion.modelo;

import java.util.ArrayList;

public class Ruta {
	
	private String origen;
	private String destino;
	private ArrayList<String> escalas;
	
	public Ruta(String origen, String destino) {
		escalas = new ArrayList<String>();
		this.origen = origen;
		this.destino = destino;
	}
	
	public void agregarEscala(String escala){
		escalas.add(escala);
	}
	
	public void eliminarEscala(String escala){
		escalas.remove(escala);
	}
	
	

}
