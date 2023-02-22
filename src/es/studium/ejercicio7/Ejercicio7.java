package es.studium.ejercicio7;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		// COMPARAR DOS NÚMEROS Y DECIR SI SON IGUALES O CUAL ES MAYOR
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		teclado.close();
		if(num1==num2)
		{
			System.out.println("Los números son iguales");
		}
		else
		{
			if(num1<num2)
			{
				System.out.println("El segundo número es mayor que el primero");
			}
			else
			{
				System.out.println("El primer número es mayor que el segundo");
			}
		}
	}

}
