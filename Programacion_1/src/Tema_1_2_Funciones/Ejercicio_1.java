package Tema_1_2_Funciones;

public class Ejercicio_1 {
	
	/* 1. Realiza una función que reciba 3 parámetros: dos de tipo entero y uno de tipo booleano. 
	 * La función deberá sumar los enteros si el booleano es verdadero y restarlos si el booleano es falso. 
	 * Realiza un procedimiento que llame varias veces a la función con los siguientes valores como argumentos:
	 * 
	 * Con los literales 6, 9 y true. 
	 * Con los literales 6, 9 y false.
	 * Con variables. Asígnales el valor que desees. 
	 * Con expresiones.
	 */
	
	public static int sumarOrestar(int a, int b, boolean suma) {
		if (suma) {
			return a + b;
		} else {
			return a - b;
		}
	}
	
	public static void main(String[] args) { 
		// llamada en true
		System.out.println(sumarOrestar(6, 9, true));
		// llamada en false
		System.out.println(sumarOrestar(6, 9, false));

		// llamada con variables
		int x = 10, y = 7;
		boolean sumar = true;
		System.out.println(sumarOrestar(x, y, sumar));
		
		// llamada con expresiones
		System.out.println(sumarOrestar(x * 2, y + 3, false));
		
		
	}
	
}
