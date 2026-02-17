package Tema_3_1_SentenciasCondicionalesMultiples;

public class Ejercicio_4__4 {

	/*
	 * 4. Realiza un procedimiento que saque una carta aleatoria de una baraja con 4
	 * palos y 13 cartas por cada palo. Los palos son Picas ♠, Corazones ♥,
	 * Diamantes ♦ y Tréboles ♣. Las 13 cartas por cada palo irán del as al diez y
	 * además tres figuras: jota, reina y rey. Mostrar la carta incluyendo el
	 * símbolo del palo(♠,♥,♦,♣).
	 */

	public static void main(String[] args) {

		// Valor entre 1 y 52
		int numero = (int) (Math.random() * 52) + 1;

		// Calcular palo
		int palo = (numero - 1) / 13;

		// Calcular valor de la carta (del 1 al 13)
		int valor = (numero - 1) % 13 + 1;

		// Mostrar nombre del valor
		String nombreValor = "";
		if (valor == 1) {
			nombreValor = "As";
		} else if (valor >= 2 && valor <= 10) {
			nombreValor = "" + valor;
		} else if (valor == 11) {
			nombreValor = "Jota";
		} else if (valor == 12) {
			nombreValor = "Reina";
		} else if (valor == 13) {
			nombreValor = "Rey";
		}

		// Mostrar palo con simbolo
		String simboloPalo = "";
		if (palo == 0) {
			simboloPalo = "♠";
		} else if (palo == 1) {
			simboloPalo = "♥";
		} else if (palo == 2) {
			simboloPalo = "♦";
		} else if (palo == 3) {
			simboloPalo = "♣";
		}

		System.out.println(nombreValor + " de " + simboloPalo);

	}

}
