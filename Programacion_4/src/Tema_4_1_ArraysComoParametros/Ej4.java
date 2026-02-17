package Tema_4_1_ArraysComoParametros;

public class Ej4 {

	public static void buscarNumero(int[] array, int numero) {
		int contador = 0;

		System.out.print("Las posiciones que contienen el valor " + numero + " son: ");

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				contador++;
				System.out.print((1 + i) + ", ");
			}
		}

		System.out.println();

		System.out.println("El número " + numero + " se encuentra " + contador + " veces en el array.");
	}

	public static void main(String[] args) {
		int[] datos = { 1, 5, 2, 4, 5, 1 };

		buscarNumero(datos, 5);
	}
}
