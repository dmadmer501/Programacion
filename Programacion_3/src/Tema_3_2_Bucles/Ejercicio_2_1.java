package Tema_3_2_Bucles;

public class Ejercicio_2_1 {

	/*
	 * 1. Modifica el Ejercicio 1 del boletín Ejercicios 3.2 While para que en
	 * cuanto salga el primer múltiplo de 9, éste sí se muestre y el procedimiento
	 * finalice.
	 */

	public static void main(String[] args) {
		int n = 1; // valor inicial

		while (true) {
			n = (int) (Math.random() * 1000) + 1;
			System.out.println(n);
			if (n % 9 == 0) {
				break;
			}
		}

	}
}
