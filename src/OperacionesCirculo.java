import java.util.Scanner;

/* Programa para calcular el area de un circulo con el radio que se introduce. */

public class OperacionesCirculo {

	public static void main (String args[]) {

		double radio, resultado;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce el radio del circulo (en metros): ");
		radio = sc.nextInt();

		resultado = operaciones.area(radio);
		System.out.println("\nEl area del circulo es: " + resultado + "m²");

		resultado = operaciones.circunferencia(radio);
		System.out.println("\nLa circunferencia del circulo es: " + resultado + "m");
	
	}
}