package Tema_3_1_SentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio_4_3 {

	/*
	 * 3. Realiza una función que reciba 3 números y devuelva una cadena con los
	 * números en orden ascendente. Puede ser que haya números iguales.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el primer número: ");
		int num1 = sc.nextInt();

		System.out.print("Escribe el segundo número: ");
		int num2 = sc.nextInt();

		System.out.print("Escribe el tercer número: ");
		int num3 = sc.nextInt();

		sc.close();

		String resultado = numerosOrdenados(num1, num2, num3);
		System.out.println(resultado);
	}

	public static String numerosOrdenados(int num1, int num2, int num3) {
		int menor = 0;
		int medio = 0;
		int mayor = 0;

		if (num1 <= num2 && num1 <= num3) {
			menor = num1;
			if (num2 <= num3) {
				medio = num2;
				mayor = num3;
			} else {
				medio = num3;
				mayor = num2;
			}
		} else if (num2 <= num1 && num2 <= num3) {
			menor = num2;
			if (num1 <= num3) {
				medio = num1;
				mayor = num3;
			} else {
				medio = num3;
				mayor = num1;
			}
		} else {
			menor = num3;
			if (num1 >= num2) {
				medio = num2;
				mayor = num1;
			} else {
				medio = num1;
				mayor = num2;
			}
		}
		return "Numeros en orden ascendente: " + menor + ", " + medio + ", " + mayor;
	}
}
