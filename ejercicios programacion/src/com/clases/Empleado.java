package com.clases;

import java.util.Scanner;

public class Empleado extends Persona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el aņo de nacimiento");
		int aņoNacimiento = scanner.nextInt();
		empleado.setAņoNacimiento(aņoNacimiento);
		int edad = empleado.getEdad();
		System.out.println("Este empleado tiene " + edad + " aņos!");
		scanner.close();
	}

}
