package es.studium.ejercicio19;

import java.util.Scanner;

public class Ejercicio19
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		teclado.close();
		
		System.out.println("El resultado de la suma es " + Suma(num1, num2));
		System.out.println("El resultado de la resta es " + Resta(num1, num2));
		System.out.println("El resultado de la multiplicación es " + Multiplicacion(num1, num2));
		System.out.println("El resultado de la división es " + Division(num1, num2));
	}
	
	public static int Suma(int num1, int num2)
	{
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public static int Resta(int num1, int num2)
	{
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	
	public static int Multiplicacion(int num1, int num2)
	{
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	
	public static double Division(double num1, double num2)
	{
		double resultado;
		resultado = ((double)num1 / num2);
		return resultado;
	}
}
