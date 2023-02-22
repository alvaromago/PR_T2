package es.studium.ejercicio6;

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el numerador:");
		numerador = teclado.nextInt();
		System.out.println("Dame el denominador:");
		denominador = teclado.nextInt();
		teclado.close();
		resultado = dividir(numerador, denominador);
		System.out.println(resultado);
	}

	private static double dividir(int numerador, int denominador)
	{
		double r;
		r = (double) numerador / (double) denominador;
		return r;
	}

}
