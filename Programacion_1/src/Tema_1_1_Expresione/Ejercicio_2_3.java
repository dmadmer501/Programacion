package Tema_1_1_Expresione;

public class Ejercicio_2_3 {

	/* 9. Las siguientes asignaciones dan error. Soluciónalas con un casting o con una letra (en el caso de los literales):
	 * int x = 165698L;
	 * short s=56;
	 * byte b=s;
	 * byte b = 129;
	 * float f = 5.89;
	 * long l = 8.42;
	 * char c1='a',c2;
	 * c2 = c1 + 7;
	 * byte b;
	 * short s=7;
	 * boolean a=true;
	 * b = a ? s++:--s;
	 */
	
	public void main(String[] args) {
	 int x = (int) 165698L;
	 
	 short s = 56;
	 byte b = (byte) s;
	 
	 byte e = (byte) 129;
	 
	 float f = 5.89f;
	 
	 long l = (long) 8.42;
	 
	 char c1 = 'a', c2;
	 c2 = (char) (c1 + 7);
	 
	 short m = 7;
	 boolean a = true;
	 b= (byte) (a ? s++:--s);
	 
	 System.out.println(s);
	 System.out.println(x);
	 System.out.println(b);
	 System.out.println(e);
	 System.out.println(f);
	 System.out.println(l);
	 System.out.println(c2);
	 System.out.println(m);







	}
}