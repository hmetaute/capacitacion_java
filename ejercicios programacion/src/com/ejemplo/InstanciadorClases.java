package com.ejemplo;

import com.clases.RegistroNotasEstudiantes;

public class InstanciadorClases {

	public static void main(String[] args) {
//		EjemploModificadores instancia = new EjemploModificadores();
//		System.out.println("llamo al metodo publico:" + instancia.metodoPublico());
		RegistroNotasEstudiantes registro = new RegistroNotasEstudiantes();

		registro.agregarNota("erick", 1.0);
		registro.agregarNota("sandra", 2.0);
		registro.agregarNota("zulay", 3.0);
		registro.agregarNota("julieth", 9.0);
		registro.agregarNota("wilson", 6.0);
		registro.agregarNota("jisela", 5.0);
		registro.agregarNota("ricardo", 7.0);
		registro.agregarNota("miguel", 8.0);
		registro.agregarNota("balvin", 9.0);
		System.out.println("el estudiante con la mejor nota es: "+registro.getNombreEstudianteMejorNota());
//		
//		System.out.println("llamo al metodo privado:" + instancia.llamoAPrivado());
//		
//		System.out.println("llamado al metodo estatico: " +  EjemploModificadores.metodoEstatico());
	}

}
