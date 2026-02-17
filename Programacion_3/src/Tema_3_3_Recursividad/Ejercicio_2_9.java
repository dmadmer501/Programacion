package Tema_3_3_Recursividad;

import java.util.Scanner;

public class Ejercicio_2_9 {

	@SuppressWarnings("resource")
	public void funcion() {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		n = (int) (Math.random() * 1000) + 1;

		int numero = 0;

		do {
			System.out.print("Escribe un número: ");
			numero = sc.nextInt();
			if (numero < n) {
				System.out.println("El número buscado es mayor");
			} else if (numero > n) {
				System.out.println("El número buscado es menor");
			} else if (numero == n) {
				System.out.println("Acertaste!!!");
				break;
			}

		} while (numero != n);
	}

	public static void main(String[] args) {
		new Ejercicio_2_9().funcion();
	}
}
