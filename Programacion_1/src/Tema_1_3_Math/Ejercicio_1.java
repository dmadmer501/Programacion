package Tema_1_3_Math;

public class Ejercicio_1 {
	
	/* 1. Investiga en la API de Java para qué sirven los siguientes métodos de la clase Math. 
	 * Haz en el Eclipse un ejemplo de utilización para cada uno:
	 * 
	 * static float abs(float a)
	 * static double exp(double a)
	 * static double pow(double a, double b)
	 * static double max(double a, double b)
	 * static int min(int a, int b)
	 * static double ceil (double a). Probar con positivo y negativo.
	 * static double floor(double a). Probar con positivo y negativo.
	 */
	
	public static void main(String[] args) {
		
		// static float abs(float a)
		// Devuelve el valor absoluto de a (lo pasa de negativo a positivo)
		System.out.println(Math.abs(-5.3f));
		System.out.println(Math.abs(5.3f));
		
		// static double exp(double a)
		// Devuelve la base de los logaritmos naturales elevado a a
		System.out.println(Math.exp(2));
		
		// static double pow (double a, double b)
		// Calcula a elevado a la potencia b
		System.out.println(Math.pow(3, 4));
		
		// static double max (double a, double b)
		// Devuelve el  mayor de dos valores
		System.out.println(Math.max(6.7, 3.4));
		
		// static int min (int a, int b)
		// Devuelve el menor de dos valores
		System.out.println(Math.min(4.5, 9.2));
		
		// static double ceil (double a)
		// Redondea hacia arriba hasta el entero superior más próximos
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.ceil(-3.1));
		
		// static douyble floor (double a)
		// Redondea hacia abajo hasta el entero inferior más próximos
		System.out.println(Math.floor(4.3));
		System.out.println(Math.floor(-3.3));
		
	}

}
