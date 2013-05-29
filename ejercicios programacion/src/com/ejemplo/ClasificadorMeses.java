package com.ejemplo;

public class ClasificadorMeses {

	public static void main(String[] args) {
		System.out.println(decodificarMesArreglo(5));
	}

	public static String codificarMes(int mes) {
		String mesCodificado = "";

		switch (mes) {
		case 1:
			mesCodificado = "Enero";
		case 2:
			mesCodificado = "Febrero";
		case 3:
			mesCodificado = "Marzo";
		case 4:
			mesCodificado = "Abril";
		case 5:
			mesCodificado = "Mayo";
		case 6:
			mesCodificado = "Junio";
		case 7:
			mesCodificado = "Julio";
		case 8:
			mesCodificado = "Agosto";
		case 9:
			mesCodificado = "Septiembre";
		case 10:
			mesCodificado = "Octubre";
		case 11:
			mesCodificado = "Noviembre";
		case 12:
			mesCodificado = "Diciembre";
		default:
			mesCodificado = "N/A";
		}

		return mesCodificado;
	}
	
	public static String decodificarMesArreglo(int numeroMes){
		String mesCodificado = "";
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"
				, "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
		};
		
		mesCodificado = meses[numeroMes-1];
																
		return mesCodificado;
	}

}
