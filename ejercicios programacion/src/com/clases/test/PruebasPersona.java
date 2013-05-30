package com.clases.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.clases.Persona;

public class PruebasPersona {

	@Test
	public void nuevaPersonaTieneNombreNulo() {
		Persona persona = new Persona();
		assertTrue(persona.getNombre() == null);
	}
	
	@Test
	public void nuevaPersonaNoTienePolizas(){
		Persona persona = new Persona();
		assertFalse(persona.tienePolizas());
	}
	
	
	
	

}
