package com.clases;

import java.util.Scanner;

public class Empleado extends Persona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el a�o de nacimiento");
		int a�oNacimiento = scanner.nextInt();
		empleado.setA�oNacimiento(a�oNacimiento);
		int edad = empleado.getEdad();
		System.out.println("Este empleado tiene " + edad + " a�os!");
		scanner.close();
	}

}
