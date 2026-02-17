package Tema_4_1_ArraysComoParametros;

public class Ej3 {

	public void show() {
		System.out.println(sumar(new int[] { 1, 2, 3, 4, 5, 6 }));
	}

	public static int sumar(int... nums) {
		int suma = 0;

		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		new Ej3().show();
	}
}
