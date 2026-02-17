package Tema_3_2_Bucles;

import java.util.Scanner;

public class Ejercicio_2_4 {
	
	/* 4. En el ejercicio anterior, ve mostrando al usuario la nota que ha introducido en cada iteración. 
	 * Ejemplo: En la iteración 1 has introducido la nota 5
	 * ¿cómo se llama la variable que has utilizado para mostrar cada iteración?
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int contador = 1;

        do {
            System.out.print("Introduce tu nota: ");
            nota = sc.nextInt();
            
            if (nota >= 0 && nota <= 10) {
            		System.out.println("En la intarión " + contador + " has introducido la nota: " + nota);
            		contador++;
            }

        } while (nota >= 0 && nota <= 10);

        System.out.println("Nota no válida. Programa terminado.");
        sc.close();
    }
}

