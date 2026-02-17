package Tema_3_3_Recursividad;

import java.util.Scanner;

public class Ejercicio_2_6 {
	
	/* 6. En el ejercicio anterior, muestra la nota media de los aprobados y la nota media de los suspensos. 
	 * ¿cómo se llaman las variables que has utilizado para las notas medias?
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int contador = 1;
        int aprobados = 0;
        int suspensos = 0;
        int sumaAprobados = 0;
        int sumaSuspensos = 0;

        do {
            System.out.print("Introduce tu nota: ");
            nota = sc.nextInt();
            
            if (nota >= 0 && nota <= 10) {
            		System.out.println("En la intarión " + contador + " has introducido la nota: " + nota);
            		contador++;
            }
            if (nota >= 5) {
            		System.out.println("Por ahora han aprobado: " + aprobados + " alumnos");
            		sumaAprobados += nota;
            		aprobados++;
            } else {
            		sumaSuspensos += nota;
            		suspensos++;
            }

        } while (nota >= 0 && nota <= 10);
        
        double mediaAprobados = (aprobados > 0) ? (double) sumaAprobados / aprobados : 0;
        double mediaSuspensos = (suspensos > 0) ? (double) sumaSuspensos / suspensos : 0;


        System.out.println("Nota no válida. Programa terminado.");
        System.out.println("Media aprobados: " + mediaAprobados);
        System.out.println("Media suspensos: " + mediaSuspensos);
        sc.close();
    }
}
