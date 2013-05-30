package com.capacitacion.modelo;

public class PasajeroDTO extends PersonaDTO {

	private String numeroSilla;
	private String destino;
	private boolean viajeroFrecuente;
	private int numeroMillasAcumuladas;
	
	
	public String getNumeroSilla() {
		return numeroSilla;
	}
	public void setNumeroSilla(String numeroSilla) {
		this.numeroSilla = numeroSilla;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
	
}
