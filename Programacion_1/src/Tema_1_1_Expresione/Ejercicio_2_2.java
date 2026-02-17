package Tema_1_1_Expresione;

public class Ejercicio_2_2 {
	
	/* 8. Dados los siguientes valores para las variables booleanas a, b y c ( a = true, b = false y c = true), evaluar las expresiones que aparecen a continuación:
	 * 1. | a && b  || a && c  	
	 * 2. | (a || ! b) && (! a || c)		
	 * 3. | a || b && c	
	 * 4. | ! (a || b) && c
	 */

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		boolean prueba1 =  a && b  || a && c;  	
		System.out.println(prueba1);
		
		boolean prueba2 = (a || ! b) && (! a || c);
		System.out.println(prueba2);
		
		boolean prueba3 =  a || b && c;
		System.out.println(prueba3);
		
		boolean prueba4 =  ! (a || b) && c;
		System.out.println(prueba4);
		
	}
}
