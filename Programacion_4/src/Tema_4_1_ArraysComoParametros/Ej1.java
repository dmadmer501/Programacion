package Tema_4_1_ArraysComoParametros;

public class Ej1 {

	public void show() {
		System.out.println(add(new int[] { 1, 2, 3, 4, 5 }));
	}

	public static int add(int... nums) {
		int multi = 1;
		for (int i = 0; i < nums.length; i++) {
			multi *= nums[i];
		}
		return multi;
	}

	public static void main(String[] args) {
		new Ej1().show();
	}
}
