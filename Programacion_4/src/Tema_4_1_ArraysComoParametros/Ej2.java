package Tema_4_1_ArraysComoParametros;

public class Ej2 {

	public static void modificar(int[] numeros) {
		numeros[0] = 999;
	}

	public static void main(String[] args) {

		int[] miArray = { 1, 2, 3, 4, 5 };

		System.out.println("Antes de modificar: " + miArray[0]);

		modificar(miArray);

		System.out.println("Despues de modificar:" + miArray[0]);
	}
}
