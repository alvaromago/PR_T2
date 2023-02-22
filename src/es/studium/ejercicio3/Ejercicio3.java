package es.studium.ejercicio3;

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		// PROGRAMA QUE LEA SI UN NÚMERO ES PAR O IMPAR
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num = teclado.nextInt();
		teclado.close();
		if (num%2==0)
		{
			System.out.println("Su número es par");
		}
		else
		{
			System.out.println("Su número es impar");
		}
	}
}
