package Tema_3_3_Recursividad;

import java.util.Scanner;

public class Ejercicio_2_7 {

	@SuppressWarnings("resource")
	public void contraseña() {

		Scanner sc = new Scanner(System.in);
		int contraseña;
		int introducida;
		int contador = 3;

		System.out.print("Crea tu contraseña: ");
		contraseña = sc.nextInt();

		do {
			System.out.print("Introduce tu contraseña: ");
			introducida = sc.nextInt();

			if (contraseña != introducida) {
				contador--;
				System.out.print("Contraseña incorrecta");
				if (contador > 0) {
					System.out.println(" | Quedan " + contador + " intentos");
				} else {
					System.out.println("Numero de intentos máximos superados");
					break;
				}
			} else {
				System.out.println("Contraseña correcta");
			}

		} while (contador > 0 && contraseña != introducida);

	}

	public static void main(String[] args) {
		new Ejercicio_2_7().contraseña();
	}
}
