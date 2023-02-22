package es.studium.ejercicio14;

import java.util.Scanner;

public class Ejercicio14
{

	public static void main(String[] args)
	{
		int base, elevado;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una base:");
		base = teclado.nextInt();
		System.out.println("Introduzca su elevado:");
		elevado = teclado.nextInt();
		teclado.close();
		resultado = Potencia(base, elevado);
		System.out.println("El resultado de su potencia es " + resultado);
	}
	
	public static int Potencia(int base, int elevado)
	{
		int i, resultado = 1;
		for(i=1; i<=elevado; i++)
		{
			resultado = resultado * base;
		}
		return (resultado);
	}
}
