package es.studium.ejercicio20;

import java.util.Scanner;

public class Ejercicio20
{

	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		System.out.println("Introduzca el último número:");
		num3 = teclado.nextInt();
		teclado.close();
		
		System.out.println("El resultado de la suma es " + Suma(num1, num2, num3));
		System.out.println("El resultado de la multiplicación es " + Producto(num1, num2, num3));
		System.out.println("El resultado de la media es " + Media(num1, num2, num3));
	}
	
	public static int Suma(int num1, int num2, int num3)
	{
		int resultado;
		resultado = num1 + num2 + num3;
		return resultado;
	}
	
	public static int Producto(int num1, int num2, int num3)
	{
		int resultado;
		resultado = num1 * num2 * num3;
		return resultado;
	}
	
	public static double Media(double num1, double num2, double num3)
	{
		double resultado;
		resultado = (num1 + num2 + num3)/3;
		return resultado;
	}
}
