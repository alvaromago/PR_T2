package es.studium.ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{
	public static int Suma(int num1, int num2)
	{
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2 = teclado.nextInt();
		teclado.close();
		
		System.out.println("El resultado de la suma es: " + Suma(num1, num2));
	}

}
