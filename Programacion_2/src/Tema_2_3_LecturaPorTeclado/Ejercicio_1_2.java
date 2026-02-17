package Tema_2_3_LecturaPorTeclado;

import java.util.Scanner;

public class Ejercicio_1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Solicitar datos al usuario
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Apellidos: ");
		String apellidos = sc.nextLine();

		System.out.print("Edad: ");
		int edad = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.println("Dirección:");
		System.out.print("  Calle: ");
		String calle = sc.nextLine();

		System.out.print("  Número: ");
		int numero = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.print("  Código postal: ");
		String codigoPostal = sc.nextLine();

		System.out.print("  Provincia: ");
		String provincia = sc.nextLine();

		System.out.print("¿Es estudiante? (true/false): ");
		boolean estudiante = sc.nextBoolean();

		System.out.print("Altura (con decimales, ej. 1.75): ");
		double altura = sc.nextDouble();

		sc.close();

		// Mostrar los datos por consola
		System.out.println("\n--- Datos de la persona ---");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Dirección:");
		System.out.println("  Calle: " + calle);
		System.out.println("  Número: " + numero);
		System.out.println("  Código postal: " + codigoPostal);
		System.out.println("  Provincia: " + provincia);
		System.out.println("Es estudiante: " + estudiante);
		System.out.println("Altura: " + altura + " m");

	}
}
