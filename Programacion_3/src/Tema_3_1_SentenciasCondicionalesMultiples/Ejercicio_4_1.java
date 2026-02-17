package Tema_3_1_SentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio_4_1 {

	/*
	 * 1. Realiza un procedimiento que reciba una nota y muestre lo siguiente:
	 * (hacerlo con anidación y con switch) 0, 1, 2: Muy deficiente 3, 4:
	 * Insuficiente 5: Suficiente 6: Bien 7, 8: Notable 9, 10: Sobresaliente
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		int nota = sc.nextInt();

		switch (nota) {

		case 0:

		case 1:

		case 2:
			System.out.println("Muy deficiente");
			break;

		case 3:

		case 4:
			System.out.println("Insuficiente");
			break;

		case 5:
			System.out.println("Suficiente");
			break;

		case 6:
			System.out.println("Bien");
			break;

		case 7:

		case 8:
			System.out.println("Notable");
			break;

		case 9:

		case 10:
			System.out.println("Sobresaliente");
			break;

		default:
			System.out.println("Error: Introduce un valor entre 0 y 10");
		}

		sc.close();
	}
}
