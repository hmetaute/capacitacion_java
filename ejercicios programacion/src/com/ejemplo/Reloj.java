package com.ejemplo;

public class Reloj {

	public static void main(String[] args) throws InterruptedException {
		int horas =9;
		int minutos = 33;
		int segundos = 0;
		for (horas = 9; horas < 24; horas = horas + 1) {
			for (minutos = 33; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas+":"+minutos+":"+segundos);
					Thread.sleep(1000); //esperar un segundo
				}
			}
		}
	}
}
