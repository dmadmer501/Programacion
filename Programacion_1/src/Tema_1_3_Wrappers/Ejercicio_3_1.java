package Tema_1_3_Wrappers;

public class Ejercicio_3_1 {
	
	/* 1. Investiga en la API de Java para qué sirven los siguientes métodos de la clase Character.
	 * Haz en el Eclipse un ejemplo de utilización para cada uno:
	 * 
	 * char charValue()
	 * static boolean isDigit(char ch)
	 * static boolean isUpperCase(char ch)
	 * static char toLowerCase(char ch)
	 * static Character valueOf(char c)
	 * 
	 */

	public static void main(String[] args) {
		
		Character letra = 'K'; 
		char digito = '7';
		char mayus = 'A';
		char minus = 'g';
		
        // 1. char charValue(): Devuelve el valor primitivo del objeto Character
		System.out.println(letra.charValue()); // K
		
        // 2. static boolean isDigit(char ch): Comprueba si es un digito
		System.out.println(Character.isDigit(digito)); // true
		System.out.println(Character.isDigit('a')); // false
		
        // 3. static boolean isUpperCase(char ch): Comprueba si es mayúscula
		System.out.println(Character.isUpperCase(letra)); // true
		System.out.println(Character.isUpperCase('a')); // false
		
        // 4. static char toLowerCase(char ch): Convierte a minúscula
		System.out.println(Character.toLowerCase(mayus)); // a
		System.out.println(Character.toLowerCase(minus)); // g
		
        // 5. static Character valueOf(char c): Devuelve objeto Character a partir de un char
		Character objeto = Character.valueOf('Z');
		System.out.println(objeto); // Z
	}
}
