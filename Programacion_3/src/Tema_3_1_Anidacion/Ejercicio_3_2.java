package Tema_3_1_Anidacion;

import java.util.Scanner;

public class Ejercicio_3_2 {

	public static void main(String[] args) {

		/*
		 * 2. Realiza una función que reciba una temperatura y devuelva una cadena: Si
		 * la temperatura es menor de 0: "Hace mucho frío". Si está entre 0 (incluido) y
		 * 15 (excluido): "Hace frío". Si está entre 15 (incluido) y 25 (excluido):
		 * "Temperatura agradable". Si está entre 25 (incluido) y 35 (excluido):
		 * "Hace calor".Si es 35 o más: "Hace mucho calor".
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe la temperatura: ");
		double temperatura = sc.nextDouble();

		if (temperatura < 0) {
			System.out.println("Hace mucho frio");
		} else if (temperatura >= 0 && temperatura < 15) {
			System.out.println("Hace frío");
		} else if (temperatura >= 15 && temperatura < 25) {
			System.out.println("Temperatura agradable");
		} else if (temperatura >= 25 && temperatura < 35) {
			System.out.println("Hace calor");
		} else if (temperatura >= 35) {
			System.out.println("Hace mucho calor");
		}
		sc.close();

	}
}
