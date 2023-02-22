package es.studium.ejercicio16;

import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número a:");
		a = teclado.nextInt();
		System.out.println("Introduzca un número b:");
		b = teclado.nextInt();
		System.out.println("Introduzca un número c:");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("El resultadod de su operación es " + Calculo(a, b, c));
	}
	
	public static double Calculo(int a, int b, int c)
	{
		double resultado;
		resultado = ((double)(b*b - 4*a*c)/(double)(2*a));
		return resultado;
	}

}
