package Tema_3_1_Anidacion;

import java.util.Scanner;

public class Ejercicio_3_1 {

	public static void main(String[] args) {

		// 1. Realiza un procedimiento que reciba un número entero y muestre si el
		// número es positivo, negativo o cero.

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Es positivo");
		} else if (num == 0) {
			System.out.println("Es 0");
		} else if (num < 0) {
			System.out.println("Es negativo");
		}
		sc.close();
	}
}
