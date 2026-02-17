package Tema_1_3_String;

public class Ejercicio_2_1 {

	/*
	 * Investiga en la API de Java para qué sirven los siguientes métodos de la
	 * clase String. Haz en el Eclipse un ejemplo de utilización para cada uno:
	 * 
	 * char charAt(int index) int length() String concat(String str) boolean
	 * endsWith(String suffix) int indexOf(int ch) int indexOf(int ch, int
	 * fromIndex) int indexOf(String str) int indexOf(String str, int fromIndex)
	 * boolean isEmpty() int lastIndexOf(int ch) int lastIndexOf(int ch, int
	 * fromIndex) int lastIndexOf(String str) int lastIndexOf(String str, int
	 * fromIndex) String replace(char oldChar, char newChar) String toUpperCase()
	 * String trim() static String valueOf(double d)
	 */

	public static void main(String[] args) {

		String texto = "Texto de ejemplo";
		String vacio = "";
		String espacios = "  Hola  ";

		// 1. char charAt(int index) - Devuelve el carácter en la posición especificada
		System.out.println(texto.charAt(0)); // T
		System.out.println(texto.charAt(6)); // d

		// 2. int length() - Devuelve la longitud del string
		System.out.println(texto.length()); // 16

		// 3. String concat(String str) - Concatena dos strings
		System.out.println(texto.concat(" añadido")); // Texto de ejemplo añadido

		// 4. boolean endsWith(String suffix) - Verifica si termina con el sufijo
		System.out.println(texto.endsWith("ejemplo")); // true
		System.out.println(texto.endsWith("final")); // false

		// 5. int indexOf(int ch) - Busca la primera aparición del carácter
		System.out.println(texto.indexOf('o')); // 4
		System.out.println(texto.indexOf(' ')); // 5

		// 6. int indexOf(int ch, int fromIndex) - Busca desde una posición específica
		System.out.println(texto.indexOf('o', 7)); // 15

		// 7. int indexOf(String str) - Busca la primera aparición de un substring
		System.out.println(texto.indexOf("de")); // 6

		// 8. int indexOf(String str, int fromIndex) - Busca substring desde posición
		System.out.println(texto.indexOf("de", 9)); // -1

		// 9. boolean isEmpty() - Verifica si el string está vacío
		System.out.println(texto.isEmpty()); // false
		System.out.println(vacio.isEmpty()); // true

		// 10. int lastIndexOf(int ch) - Busca la última aparición del carácter
		System.out.println(texto.lastIndexOf('e')); // 11

		// 11. int lastIndexOf(int ch, int fromIndex) - Busca hacia atrás desde posición
		System.out.println(texto.lastIndexOf('e', 8)); // 7

		// 12. int lastIndexOf(String str) - Busca la última aparición del substring
		System.out.println(texto.lastIndexOf("de")); // 6

		// 13. int lastIndexOf(String str, int fromIndex) - Busca substring hacia atrás
		System.out.println(texto.lastIndexOf("d", 1));

		// 14. String replace(char oldChar, char newChar) - Reemplaza caracteres
		System.out.println(texto.replace("e", "a")); // Taxto da ajamplo

		// 15. String toUpperCase() - Convierte a mayúsculas
		System.out.println(texto.toUpperCase()); // TEXTO DE EJEMPLO

		// 16. String trim() - Elimina espacios al inicio y final
		System.out.println(espacios.trim());

		// 17. static String valueOf(double d) - Convierte double a String
		System.out.println(String.valueOf(3.14)); // "3.14"
	}
}
