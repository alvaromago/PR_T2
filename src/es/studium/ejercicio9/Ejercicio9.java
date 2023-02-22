package es.studium.ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		// LEER DOS NÚMEROS Y SI A<B OBTENER SU SUMA. SI A>B OBTENER SU MULTIPLICACIÓN
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número");
		num2 = teclado.nextInt();
		teclado.close();
		if(num1<num2)
		{
			System.out.println(num1 + num2);
		}
		else
		{
			System.out.println(num1 * num2);
		}
	}

}
