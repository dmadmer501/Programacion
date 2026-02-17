package Tema_1_3_Wrappers;

public class Ejercicio_3_3 {

	/*
	 * 3. Investiga en la API de Java para qué sirven los siguientes métodos de la
	 * clase Double. Haz en el Eclipse un ejemplo de utilización para cada uno:
	 * float floatValue() double doubleValue() boolean isInfinite() static boolean
	 * isInfinite(double v) boolean isNaN() static double min(double a, double b)
	 * static double parseDouble(String s) static Double valueOf(double d) static
	 * Double valueOf(String s)
	 */

	public static void main(String[] args) {



		// static Double parseDouble(String s); Convierte una cadena de texto en un
		// valor double.
		String str = "123.45";
		double val = Double.parseDouble(str);
		System.out.println(val); // Imprime 123.45

		// static double min(double a, double b)
		double a = 5.6;
		double b = 7.1;
		System.out.println(Double.min(a, b));

		// static Double valueOf(double d): Devuelve un objeto Double al valor double
		// proporcionado.
		double e = 34.56;
		Double obj = Double.valueOf(e);
		System.out.println(obj); // 34.56

		// static Double valueOf(String s): Devuelve un objeto Double correspondiente al
		// valor de la cadena s.
		String palabra = "78.90";
		Double obj1 = Double.valueOf(palabra);
		System.out.println(obj1);

	}

}
