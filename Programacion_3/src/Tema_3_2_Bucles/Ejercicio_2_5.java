package Tema_3_2_Bucles;

import java.util.Scanner;

public class Ejercicio_2_5 {
	
	/* 5. En el ejercicio anterior, muestra el número de aprobados en total y el número de suspensos en total. 
	 * ¿cómo se llaman las variables que has utilizado para el número de aprobados y suspensos?
	 * 
	 */

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int nota;
	        int contador = 1;
	        int aprobados = 1;

	        do {
	            System.out.print("Introduce tu nota: ");
	            nota = sc.nextInt();
	            
	            if (nota >= 0 && nota <= 10) {
	            		System.out.println("En la intarión " + contador + " has introducido la nota: " + nota);
	            		contador++;
	            }
	            if (nota >= 5) {
	            		System.out.println("Por ahora han aprobado: " + aprobados + " alumnos");
	            		aprobados += 1;
	            }

	        } while (nota >= 0 && nota <= 10);

	        System.out.println("Nota no válida. Programa terminado.");
	        sc.close();
	    }
	}
