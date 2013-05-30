package com.capacitacion.modelo;

public class PersonaValueObject {

	private String nombre;
	private String identificacion;
	private String direccionContacto;
			
	public PersonaValueObject(String nombre, String identificacion, String direccionContacto) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccionContacto = direccionContacto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getDireccionContacto() {
		return direccionContacto;
	}

}
