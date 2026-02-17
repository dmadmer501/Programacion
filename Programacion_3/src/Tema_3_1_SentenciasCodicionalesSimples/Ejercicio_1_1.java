package Tema_3_1_SentenciasCodicionalesSimples;

import java.util.Scanner;

public class Ejercicio_1_1 {

	/*
	 * 1. Realiza un procedimiento que reciba un número decimal. Si el número es
	 * mayor de 1000, que muestre el 15% de dicho número. Si no, que no haga nada.
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número decimal: ");
		double decimal = sc.nextDouble();

		if (decimal > 1000) {
			double resultado = decimal * 15 / 100;
			System.out.printf("El 15%% de: %.2f es: %.2f", decimal, resultado);
		}

	}

}
