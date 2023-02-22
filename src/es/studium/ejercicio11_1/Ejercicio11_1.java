package es.studium.ejercicio11_1;

import java.util.Scanner;

public class Ejercicio11_1
{

	public static void main(String[] args)
	{
		// INTERCAMBIAR VALOR DE LOS NÚMEROS QUE SE TE DAN CON 2 AUXILIARES
			int num1, num2, auxiliar1, auxiliar2;
				
			Scanner teclado = new Scanner(System.in);
				
			System.out.println("Introduzca un número");
			num1 = teclado.nextInt();
			System.out.println("Introduzca otro número");
			num2 = teclado.nextInt();
			teclado.close();
			auxiliar1 = num1;
			auxiliar2 = num2;
			num2 = auxiliar1;
			num1 = auxiliar2;
				
			System.out.println(num1);
			System.out.println(num2);
	}

}
