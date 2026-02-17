package Tema_3_1_CondicionalesSimplesDobles;

import java.util.Scanner;

public class Ejercicio_2_2 {

	/*
	 * 2. Realiza un procedimiento que reciba dos números y muestre si el primero es
	 * múltiplo del segundo. Un número x es múltiplo de y, si al dividir x entre y,
	 * el resto es 0.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Escribe el segundo número:");
		int num2 = sc.nextInt();

		if (num1 % num2 == 0) {
			System.out.printf("El numero %d es multiplo del número %d %n", num1, num2);
		} else {
			System.out.printf("El numero %d no es multiplo del número %d %n", num1, num2);
		}

		sc.close();

	}
}
