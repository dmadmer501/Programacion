package Tema_1_1_TiposDeDatosPrimitivos;

public class Ejercicio_1_2 {
	
	/*2. Declara e inicializa la variable s de la siguiente manera:  
	* short s=30000;
	* Asigna la variable s a una variable b de tipo byte. Muestra b por consola. ¿qué valor ha adquirido la variable b? ¿por qué?
	*/

	public static void main(String[] args ) {
		
		short s = 30000;
		byte b = (byte) s; // Conversión explícita (cast)
		System.out.println(b); // 48. Solo se mantienen los 8 bits menos significativos.
		
	/* 30.000 en binario (16 bits, short):
	 * 0111 0101 0011 0000
	 * El tipo byte ocupa 8 bits (solo el final)
	 * 0011 0000 (En número esto es 48)
	*/
		
		
	}

}
