import java.util.Scanner;
/* Programa para calcular el area de un circulo con el radio que se introduce. */

public class OperacionesCirculo {

	public static void main (String args[]) {

		/* Se declara la variable radiointroducido */
		double radiointroducido, area, circunferencia;

		Circulo circulo1 = new Circulo();
	
		Scanner sc = new Scanner(System.in);

		/* Mediante el escaner se solicita el radio del circulo */
		System.out.print("\nIntroduce el radio del circulo (en metros): ");

		radiointroducido = sc.nextDouble();

		/* Al metodo setRadio se le llama con el valor del dato introducido */
		circulo1.setRadio(radiointroducido);

		area = circulo1.area();
		circunferencia = circulo1.circunferencia();


		/* El sistema nos muestra el resultado que obtiene mediante un getter */
		System.out.println("\nEl area del circulo es: " + area + "m²");
		System.out.println("\nLa circunferencia del circulo es: " + circunferencia + "m");

	}
}
