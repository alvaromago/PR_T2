package es.studium.ejercicio8;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{
		// HACER UNA POTENCIA
		int base, exponente, i, potencia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una base:");
		base = teclado.nextInt();
		System.out.println("Introduzca un exponente:");
		exponente = teclado.nextInt();
		teclado.close();
		potencia = base;
		for(i=1; i<=exponente; i++)
		{
			potencia = potencia*base;
		}
		System.out.println("El resultado de la potencia es: " + potencia);
	}

}
