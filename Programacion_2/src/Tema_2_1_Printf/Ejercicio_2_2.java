package Tema_2_1_Printf;

public class Ejercicio_2_2 {

	/*
	 * 2. Muestra en consola una línea de texto con 3 colores y fondos diferentes
	 * usando solamente un printf. Los colores y fondos solamente se utilizarán en
	 * los argumentos.
	 */

	public static void main(String[] args) {

		String RESET = "\u001B[0m";

		// colores de texto
		String WHITE = "\u001B[37m";
		String BLACK = "\u001B[30m";
		String YELLOW = "\u001B[33m";

		// fondos
		String RED_BG = "\u001B[41m";
		String GREEN_BG = "\u001B[42m";
		String BLUE_BG = "\u001B[44m";

		// todos los códigos están SOLO en los argumentos
		String a = WHITE + RED_BG + " Ana1 " + RESET;
		String b = BLACK + GREEN_BG + " Ana2 " + RESET;
		String c = YELLOW + BLUE_BG + " Ana3 " + RESET;

		System.out.printf("%s%s%s%n", a, b, c);
	}

}
