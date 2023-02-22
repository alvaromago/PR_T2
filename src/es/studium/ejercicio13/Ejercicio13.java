package es.studium.ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		int num1, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		teclado.close();
		for(i=0; i<=10; i++)
		{
			System.out.println(num1 * i);
		}
	}
	
}
