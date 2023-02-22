package es.studium.ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		// NUM1 DICTA CUANTAS VECES SE ESCRIBE NUM2
		int num1, num2, i;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca cuantas veces quiere repetir el número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca el número a repetir:");
		num2 = teclado.nextInt();
		teclado.close();
		for(i=1; i<=num1; i++)
			System.out.println(num2);
	}

}
