package com.capacitacion.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {

	private Date fechaLlegada;
	private Date fechaSalida;
	private ArrayList<PasajeroDTO> pasajeros;
	private AvionDTO avionDeVuelo;
	private Ruta ruta;
	private String estado;
	
	public Vuelo(Date fechaSalida, Date fechaLlegada, AvionDTO avion, Ruta ruta) {
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.avionDeVuelo = avion;
		this.ruta = ruta;
		this.estado = "PLANEADO";
	}
	
	public void cancelarVuelo(){
		estado = "CANCELADO";
	}
	
	public void despegarVuelo(){
		estado = "EN VUELO";
	}
	
	public void agregarPasajero(PasajeroDTO pasajero){
		
	}
	
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	
	public ArrayList<PasajeroDTO> getPasajeros() {
		return pasajeros;
	}
	
	public AvionDTO getAvionDeVuelo() {
		return avionDeVuelo;
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	
	
}
