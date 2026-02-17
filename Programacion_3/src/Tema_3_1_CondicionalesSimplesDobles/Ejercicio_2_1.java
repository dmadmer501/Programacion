package Tema_3_1_CondicionalesSimplesDobles;

import java.util.Scanner;

public class Ejercicio_2_1 {

	// 1. Realiza un procedimiento que reciba un número entero y muestre si es par o
	// impar.

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número entero: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.printf("El número %d es par ", numero);
		} else {
			System.out.printf("El número %d es impar", numero);
		}

	}

}
