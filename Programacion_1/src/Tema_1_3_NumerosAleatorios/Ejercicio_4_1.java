package Tema_1_3_NumerosAleatorios;

import java.util.Random;

public class Ejercicio_4_1 {

	/*
	 * 1. Sacar aleatoriamente lo siguiente: cara de una moneda. El lanzamiento de
	 * un dado. Un número entre 34 y 68 ambos incluidos. Un número decimal. Un día
	 * de la semana y mostrar si es fin de semana o no. Un mes del año y mostrar si
	 * es verano o no (entenderemos como verano los meses de julio y agosto). Un día
	 * de la semana y mostrar qué día de la semana es. Un mes del año y mostrar qué
	 * mes del año es.
	 */

	public static void main(String[] args) {
		Random rand = new Random();

		// Cara de una moneda
		String moneda = rand.nextBoolean() ? "Cara" : "Cruz";
		System.out.println("Moneda: " + moneda);

		// Lanzamiento de un dado
		int dado = rand.nextInt(6) + 1;
		System.out.println("Dado: " + dado);

		// Número ente 34 y 68
		int numeroRango = rand.nextInt(68 - 34 + 1) + 34;
		System.out.println("Entre 34 y 68: " + numeroRango);

		// Número decimal entre 0 y 1
		double decimal = rand.nextDouble();
		System.out.println("Número decimal:" + decimal);

		// Día de la semana y si es fin de semana.
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		int numDia = rand.nextInt(7); // 0 a 6
		boolean esFinde = numDia >= 5;
		System.out.println("Día de la semana: " + dias[numDia] + (esFinde ? "(Fin de semana)" : "(Laboral)"));

		// Mes del año y si es verano (1=enero,..., 12 = diciembre)
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int numMes = rand.nextInt(12);
		boolean esVerano = numMes == 6 || numMes == 7;
		System.out.println("Mes del año: " + meses[numMes] + (esVerano ? " (Verano)" : " (No verano)"));

		// Día de la semana (solo nombre)
		System.out.println("Es: " + dias[numDia]);

		// Mes del año (solo nombre)
		System.out.println("Es: " + meses[numMes]);
	}

}
