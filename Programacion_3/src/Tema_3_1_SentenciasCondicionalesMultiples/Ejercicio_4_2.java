package Tema_3_1_SentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio_4_2 {

	/*
	 * 2. Realiza una función que reciba tres números y devuelva una cadena
	 * indicando cuántos son iguales. Por ejemplo: Si la entrada fuese 5 5 5, la
	 * cadena que tiene que devolver es "Hay tres números iguales a 5". Si la
	 * entrada fuese 4 6 4, la cadena sería "Hay dos números iguales a 4". Si la
	 * entrada fuese 0 1 2, la cadena sería "No hay números iguales".
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el primer número: ");
		int num1 = sc.nextInt();

		System.out.print("Escribe el segundo número: ");
		int num2 = sc.nextInt();

		System.out.print("Escribe el tercer número: ");
		int num3 = sc.nextInt();

		String resultado = comprobarIguales(num1, num2, num3);
		System.out.println(resultado);

		sc.close();
	}

	public static String comprobarIguales(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return "Hay 3 números iguales a " + num1;
		} else if (num1 == num2 || num1 == num3) {
			return "Hay 2 números iguales a " + num1;
		} else if (num2 == num3) {
			return "Hay dos números iguales a " + num2;
		} else {
			return "No hay números iguales";
		}
	}
}
