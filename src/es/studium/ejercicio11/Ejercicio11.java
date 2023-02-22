package es.studium.ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args)
	{
		// INTERCAMBIAR VALOR DE LOS NÚMEROS QUE SE TE DAN CON 1 AUXILIAR
		
		int num1, num2, intercambio;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2 = teclado.nextInt();
		teclado.close();
		intercambio = num1;
		num1 = num2;
		num2 = intercambio;
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
