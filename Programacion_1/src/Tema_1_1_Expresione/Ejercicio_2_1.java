package Tema_1_1_Expresione;

public class Ejercicio_2_1 {
	
	/* 7. Calcula el resultado de las siguientes expresiones:
	 * 1. | 3 * 5 – 4 / 2
	 * 2. | 7 – 4 * 2 – 5 * 2
	 * 3. | 5 + 4 < 7 + 8
	 * 4. | 4 < 5 * 4 / 2 – 7
	 * 5. | ! (4 > 6)
	*/
	
	public static void main(String[] args) {
		
		float calculo1 = 3 * 5 - 4 / 2;
		System.out.println(calculo1);
		
		float calculo2 = 7 - 4 * 2 - 5 * 2;
		System.out.println(calculo2);
		
	    boolean calculo3 = 5 + 4 <  7 + 8;
	    System.out.println(calculo3);
	    
	    boolean calculo4 = 4 < 5 * 4 / 2 - 7;
	    System.out.println(calculo4);
	    
	    boolean calculo5 = ! (4 > 6);
	    System.out.println(calculo5);

	}
	

}
