package Tema_2_1_Printf;

public class Ejercicio_2_1 {

	/*
	 * 1. Utilizando las siguientes variables: int x=10; int y=-10; float
	 * n=13.269834f; String cad="Ana"; Muestra en consola el siguiente resultado,
	 * exactamente igual, utilizando el método printf, sin utilizar espacios ni
	 * tabulación en la cadena de formato y utilizando solamente las variables
	 * indicadas anteriormente en los argumentos: 10 +10 -10 13,27 +13,2698 13,26983
	 * +00013,270 n=13,27 x=10 AnaAna Ana
	 */

	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		float n = 13.269834f;

		// 1. 10
		System.out.printf("%d%n", x);

		// 2. +10
		System.out.printf("%+d%n", x);

		// 3. -10
		System.out.printf("%+d%n", y);

		// 4. 13.27
		System.out.printf("%,.2f%n", n);

		// 5. +13,2698 (2 espacios antes del "+" y 4 decimales)
		System.out.printf("%+10.4f%n", n);

		// 6. 13,26983 (2 espacios antes, 5 decimales sin signo)
		System.out.printf("%10.5f%n", n);

		// 7. +00013,270 (signo +, ceros delante, ancho total 10, 3 decimales)
		System.out.printf("%+010.3f%n", n);

		// 8. n = 13,27 x = 10 (una coma como separador decimal, ancho fijo para
		// alineación)
		System.out.printf("n=%.2f x=%d%n", n, x);

		// 9. AnaAna Ana
		System.out.printf("%13s%s %s", "Ana", "Ana", "Ana");
	}
}
