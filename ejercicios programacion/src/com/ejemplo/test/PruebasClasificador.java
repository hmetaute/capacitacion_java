package com.ejemplo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ejemplo.ClasificadorNotas;

public class PruebasClasificador {

	@Test
	public void meroNerdLimit(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(100);
		assertTrue(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void meroNerd(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(95);
		assertTrue(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void limiteA(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(90);
		assertTrue(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void alumnoBueno(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(85);
//		assertTrue(resultadoObtenido.equals("B"));
		assertEquals("A", resultadoObtenido);
	}
	
	@Test
	public void limiteBueno(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(80);
		assertTrue(resultadoObtenido.equals("B"));
	}
	
	@Test
	public void alumnoAceptable(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(75);
		assertTrue(resultadoObtenido.equals("C"));
	}
	
	@Test
	public void limiteAceptable(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(70);
		assertTrue(resultadoObtenido.equals("C"));
	}
	
	@Test
	public void alumnoMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(65);
		assertTrue(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void limiteMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(60);
		assertTrue(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void alumnoPesimo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(60);
		assertTrue(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void alumnoMuyMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(10);
		assertTrue(resultadoObtenido.equals("F"));
	}
	
	@Test
	public void alumnoPeroMuyMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(0);
		assertTrue(resultadoObtenido.equals("F"));
	}
	
	@Test
	public void entradaMala(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(-1);
		assertTrue(resultadoObtenido.equals(""));
	}

}
