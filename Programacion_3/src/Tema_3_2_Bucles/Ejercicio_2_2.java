package Tema_3_2_Bucles;

public class Ejercicio_2_2 {

	/*
	 * 1. Realiza un procedimiento que genere números aleatorios entre 1 y 1000 y
	 * los muestre mientras no salga uno múltiplo de 9. En cuanto salga el primer
	 * múltiplo de 9, éste ya no se muestra y el procedimiento finaliza.
	 */

	public static void main(String[] args) {
		int n = 1; // valor inicial
		int intentos = 0;

		do {
			n = (int) (Math.random() * 1000) + 1;
			System.out.println(n);
			intentos++;

		} while (n % 9 != 0 && intentos < 7);

	}
}
