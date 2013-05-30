package com.clases;

import java.util.ArrayList;
import java.util.Date;

public class Persona {

	private int a�oNacimiento;
	private String genero;
	private String identificacion;
	private String nombre;
	private String direccion;
	private ArrayList<String> polizas;
	
	
	//Constructor
	public Persona() {
		polizas = new ArrayList<String>();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean tienePolizas(){
		boolean tienePolizas = !polizas.isEmpty();		
		return tienePolizas;
	}
	
	public int getEdad(){
		int edad = 0;
		int a�oActual = 2013;
		edad = a�oActual - a�oNacimiento;
		return edad;		
	}
	
	protected void setA�oNacimiento(int a�oNacimiento){
		this.a�oNacimiento = a�oNacimiento;
	}
	
	public void agregarPoliza(String numeroPoliza){
		if(numeroPoliza != null && !numeroPoliza.trim().equals("")){
			polizas.add(numeroPoliza);
		}
	}
	
	public String getPrimeraPoliza(){
		String poliza = "";
		if(!polizas.isEmpty()){
			return polizas.get(0);
		}
		return poliza;
	}
	
	public void setPolizas(ArrayList<String> polizas){
		this.polizas = polizas;
	}
				

}
