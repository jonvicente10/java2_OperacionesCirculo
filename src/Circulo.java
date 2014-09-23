/* Clase para calcular el area y la circunferencia de un circulo */

public class Circulo {
 
//Metodo que calcula el area y devuelve el resultado.
 
public double area (double radio) {

	double result = 3.1416 * Math.pow(radio,2);
	return result;
 }

//Metodo que calcula la circunferencia y devuelve el resultado.
public double circunferencia (double radio) {

	double result = 2 * 3.1416 * radio;
	return result;
 }

}
