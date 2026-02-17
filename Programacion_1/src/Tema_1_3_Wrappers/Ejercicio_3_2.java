package Tema_1_3_Wrappers;

public class Ejercicio_3_2 {
	
	public static void main(String[] args) {
		
		Integer numero = 255;
		String textoNumero = "123";
		String textoNumero2 = "456";
		
        // 1. byte byteValue(): Convierte el Integer a byte
		System.out.println(numero.byteValue()); // -1 (255 en byte se desborda)
		
		Integer pequeno = 50;
		System.out.println(pequeno.intValue()); // 255
		
        // 2. int intValue(): Devuelve el valor primitivo int
		System.out.println(numero.intValue()); // 255
		
        // 3. double doubleValue(): Convierte el Integer a double
		System.out.println(numero.doubleValue());
		
        // 4. static String toHexString(int i): Convierte a hexadecimal (base 16)
		System.out.println(Integer.toHexString(255)); // ff
		System.out.println(Integer.toHexString(16)); // 10
		
        // 5. static int parseInt(String s): Convierte String a int primitivo
		int valorInt = Integer.parseInt(textoNumero);
		System.out.println(valorInt); // 123
		
        // 6. static Integer valueOf(int i): Convierte int primitivo a objeto Integer
		Integer objetoInteger = Integer.valueOf(789);
		System.out.println(objetoInteger); // 789
		
        // 7. static Integer valueOf(String s): Convierte String a objeto Integer
		Integer objetoDesdeString = Integer.valueOf(textoNumero2);
		System.out.println(objetoDesdeString);


		
		
		
	}

}
