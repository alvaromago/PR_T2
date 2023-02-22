package es.studium.ejercicio2;

import java.util.Scanner;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		// HACER UNA SUMA
		int num1, num2, suma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		teclado.close();
		suma = num1 + num2;
		
		System.out.println("El resultado de su suma es: " + suma);
	}

}
