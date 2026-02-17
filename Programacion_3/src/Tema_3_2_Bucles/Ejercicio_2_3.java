package Tema_3_2_Bucles;

import java.util.Scanner;

public class Ejercicio_2_3 {
	
	/* 3. Pídele al usuario que introduzca notas entre 0 y 10 
	 * hasta que introduzca una nota no válida
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduce tu nota: ");
            nota = sc.nextInt();

        } while (nota >= 0 && nota <= 10);

        System.out.println("Nota no válida. Programa terminado.");
        sc.close();
    }
}
