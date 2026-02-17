package Tema_3_1_CondicionalesSimplesDobles;

import java.util.Scanner;

public class Ejercicio_2_3 {

	/*
	 * 3. Realiza un procedimiento que calcule y muestre el precio de un billete de
	 * ida y vuelta por avión, conociendo la distancia a recorrer, el número de días
	 * de estancia y sabiendo que si la distancia en total (entre ida y vuelta) es
	 * superior a 1.000 Km y el número de días de estancia es superior a 7, la línea
	 * aérea le hace un descuento del 30 %. El precio por kilómetro es de 0,35 €.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la distancia de ida y vuelta: ");
		double distancia = sc.nextDouble();
		System.out.print("Introduce el número de dias de estancia: ");
		int dias = sc.nextInt();

		double precio = 0.35 * distancia;

		if (distancia > 1000 && dias > 7) {
			System.out.printf("El precio del viaje es: %.2f € (descuento aplicado)  %n", (precio * 30 / 100));
		} else {
			System.out.printf("El precio del viajes es: %.2f € %n", precio);
		}
		sc.close();
	}
}
