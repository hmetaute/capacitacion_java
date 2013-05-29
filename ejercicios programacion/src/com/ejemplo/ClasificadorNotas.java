package com.ejemplo;

public class ClasificadorNotas {
	public static void main(String[] args) {
		int nota = Integer.parseInt(args[0]);
		System.out.println("Me ingresaron: " + nota);
		System.out.println("La nota gringa es: " + ClasificadorNotas.clasificarNota(nota));
	}
	
	public static String clasificarNota(int nota){
		String notaClasificada = "";
		if(nota >= 90){
			notaClasificada = "A";
		}else if(nota >= 80){
			notaClasificada = "B";
		}else if (nota >= 70){
			notaClasificada = "C";
		}else if (nota >= 60){
			notaClasificada = "D";
		}else if (nota >= 0){
			notaClasificada = "F";
		}
		
		return notaClasificada;
	}
	
	public String clasificarNotaInstancia(int nota){
		String notaClasificada = "";
		if(nota >= 90){
			notaClasificada = "A";
		}else if(nota >= 80){
			notaClasificada = "B";
		}else if (nota >= 70){
			notaClasificada = "C";
		}else if (nota >= 60){
			notaClasificada = "D";
		}else if (nota >= 0){
			notaClasificada = "F";
		}		
		return notaClasificada;
	}
	
}
