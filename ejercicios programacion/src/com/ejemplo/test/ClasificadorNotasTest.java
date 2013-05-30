package com.ejemplo.test;

import static org.junit.Assert.*;
import org.junit.Test;


import com.ejemplo.ClasificadorNotas;

public class ClasificadorNotasTest {
	
	@Test
	public void meroNerdLimit(){
		ClasificadorNotas instancia = new ClasificadorNotas();
		String resultadoObtenido = instancia.clasificarNotaInstancia(100);
		assert(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void meroNerd(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(95);
		assert(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void limiteA(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(90);
		assert(resultadoObtenido.equals("A"));
	}
	
	@Test
	public void alumnoBueno(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(85);
		assert(resultadoObtenido.equals("B"));
	}
	
	@Test
	public void limiteBueno(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(80);
		assert(resultadoObtenido.equals("B"));
	}
	
	@Test
	public void alumnoAceptable(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(75);
		assert(resultadoObtenido.equals("C"));
	}
	
	@Test
	public void limiteAceptable(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(70);
		assert(resultadoObtenido.equals("C"));
	}
	
	@Test
	public void alumnoMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(65);
		assert(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void limiteMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(60);
		assert(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void alumnoPesimo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(59);
		assert(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void alumnoMuyMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(10);
		assert(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void alumnoPeroMuyMalo(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(0);
		assert(resultadoObtenido.equals("D"));
	}
	
	@Test
	public void entradaMala(){
		String resultadoObtenido = ClasificadorNotas.clasificarNota(-1);
		assert(resultadoObtenido.equals(""));
	}

}
