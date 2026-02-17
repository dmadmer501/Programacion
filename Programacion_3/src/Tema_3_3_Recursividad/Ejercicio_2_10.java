package Tema_3_3_Recursividad;

import java.util.Scanner;

public class Ejercicio_2_10 {

	public void SumarDigitos() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int numero = sc.nextInt();
		int suma = 0;

		while (numero > 0) {
			suma += numero % 10;
			numero /= 10;
		}

		System.out.println("La suma de los digitos es: " + suma);

	}

	public static void main(String[] args) {
		new Ejercicio_2_10().SumarDigitos();
	}
}
