package com.clases;

import java.util.ArrayList;

public class RegistroNotasEstudiantes {
	
	private ArrayList<Double> notasEstudiantes;
	private ArrayList<String> nombresEstudiantes;
	
	public RegistroNotasEstudiantes() {
		notasEstudiantes = new ArrayList<Double>();
		nombresEstudiantes = new ArrayList<String>();
	}
	
	public void agregarNota(String nombreEstudiante, Double notaEstudiante){
		notasEstudiantes.add(notaEstudiante);
		nombresEstudiantes.add(nombreEstudiante);		
	}
	
	public String getNombreEstudianteMejorNota(){
		String nombreEstudianteMejorNota = "";
		Double notaMayor = 0.0;
		
		for(int i = 0;i<notasEstudiantes.size();i++)
		{
			if(notaMayor<notasEstudiantes.get(i))
			{
				notaMayor=notasEstudiantes.get(i);
				nombreEstudianteMejorNota=nombresEstudiantes.get(i);
			}
		}
		return nombreEstudianteMejorNota;
	}
	
}
