package es.studium.ejercicio4;

import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		// NÚMEROS PARES ENTRE DOS NÚMEROS
		int num1, num2, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		teclado.close();
		// (i++) = INCREMENTO 1
		for(i=num1; i<=num2; i++)
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}
	}

}
