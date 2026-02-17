package Tema_1_1_Expresione;

public class Ejercicio_2_4 {
	
	/* 10. De las siguientes asignaciones:
	 *  ¿cuáles son válidas? 
	 *  ¿Cuál es el efecto de su ejecución? 
	 *  ¿De qué tipo deben ser las variables?:
	 *  z = 2 < 1  	
	 *  a = a + 1  	
	 *  ‘x’ = ‘y’  	
	 *  x = ‘y’  	
	 *  a = b  	
	 *  precio = precio – precio*(30/100)  	
	 *  a = a<b?5+1:7-3*2
	 *  a = b / 0 
	 *  i=++j
	 *  i=j++
	 *  c='''			
	 *  c='”'			
	 *  c='c'			
	 *  s=”'”		
	 *  s=”””			
	 *  c='\u0041'			
	 *  c=65
	 *  x = (a>b?5.4*3:65.1/8)
	 *  a == a>b?3+6:9-4
	 *  d = !a?c++:--c
	 */
	
	public static void Ejecicio_10(String[] args) {
		
		double a = 13;
		int b = 7;
		int i;
		int j = 0;
		double x;
		int precio = 10;
		
		boolean z = 2 < 1; // Correcto (z recibe false)
		
		a = a + 1; // Correcto (suma 1 a a)
		
		// ‘x’ = ‘y’;  Incorrecto (no se puede asignar a un literal)
		
		char n = 'y'; // Corecto (n recibe el caracter 'y')  	
		
		a = b; // Correcto (Copia el valor de b (7) a a (13), al ser ambas tipo int)  	
		
		precio = precio - precio*(30/100); // Correcto (calcula y resta el 30% del precio) 	
		
		a = a < b?5+1:7-3*2; // Correcto (Devuleve 1)
		
		a = b / 0; // Incorrecto, (no se puede dividir entre 0)
		
		i = ++j; // Correcto, (j incrementa y luego se asigna a i)
		
		i = j++; // Correcto, (i recibe el valor de j, luego j se incrementa)
		
		// c = ''' Incorrecto, (literal no valido)			
		
		char c = '”'; // Correcto (c recibe el valor de comilla doble)			
		
		c = 'c'; // Correcto (c recibe el valor del caracter c)		
		
		String s = "'"; // Correcto (s recibe el valor de ') 		
		
		// s = """; 	// Incorrecto.		
		
		c = '\u0041'; // Correcto (c recibe carácter Unicode 'A')			
		
		c = 65; // Correcto (c recibe )
		
		x = a > b?5.4*3:65.1/8; // Correcto (16.2)
		
		// a == a>b?3+6:9-4; Incorrecto ( == se usa en comparación, no asignación)
		
		int d = !z?c++:--c; // Correcto (d = --c)
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(x);
		System.out.println(n);
		System.out.println(s);
		System.out.println(d);
	}

}
