package Tema_3_3_Recursividad;

import java.util.Scanner;

public class Ejercicio_2_8 {

	@SuppressWarnings("resource")
	public void opcion() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int opcion;

		do {
			System.out.println("Selecciona una opción: ");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Salir");
			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.print("Introduce tu primer número: ");
				a = sc.nextInt();
				System.out.print("Introduce tu segundo número: ");
				b = sc.nextInt();
				System.out.println("El resultado de la suma es: " + (a + b));
				System.out.println("------------------------------------------");
			} else if (opcion == 2) {
				System.out.print("Introduce tu primer número: ");
				a = sc.nextInt();
				System.out.print("Introduce tu segundo número: ");
				b = sc.nextInt();
				System.out.println("El resultado de la resta es: " + (a - b));
				System.out.println("------------------------------------------");

			} else {
				System.out.println("Saliendo del programa");
				break;
			}

		} while (opcion == 1 || opcion == 2);
	}

	public static void main(String[] args) {

		new Ejercicio_2_8().opcion();

	}
}
