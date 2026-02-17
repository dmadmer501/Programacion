package Tema_1_3_Wrappers;

public class Ejercicio_3_4 {
	
	/* 4. Declara un booleano, un entero, un carácter y un decimal. 
	 * Inicialízalas. Luego, transforma todas las variables a variables cadena. 
	 * Luego, obtener una cadena resultante de concatenar todas las cadenas obtenidas anteriormente. 
	 * Muestra esta cadena resultante por pantalla.
	 */
	
	public static void main(String[] args) {
		
		// Declaración e iniciación.
		boolean b = true;
		int i = 10;
		char c = 'A';
		double d = 3.14;
		
		// Conversión a string
		String sB = String.valueOf(b);
		String sI = String.valueOf(i);
		String sC = String.valueOf(c);
		String sD = String.valueOf(d);
		
		// Concatenación de todas las cadenas
		String resultado = sB + sI + sC + sD;
		
		// Mostrar la cadena resultante
		System.out.println(resultado);
	}

	
}
