package es.studium.ejercicio17;

import java.util.Scanner;

public class Ejercicio17
{

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el primer número:");
		a = teclado.nextInt();
		System.out.println("Introduzca el segundo número:");
		b = teclado.nextInt();
		System.out.println("Introduzca el tecer número:");
		c = teclado.nextInt();
		teclado.close();
		
		if(a>=b&&b>c)
		{
			System.out.println("El órden es " + a + ", " + b + ", " + c);
		}
		else if(a>=b&&c>b)
		{
			System.out.println("El órden es " + c + ", " + b + ", " + a);
		}
		else if(a<=b&&b<=c)
		{
			System.out.println("El órden es " + c + ", " + b + ", " + a);
		}
		else if(b>=a&&a>=c)
		{		
			System.out.println("El órden es " + b + ", " + a + ", " + c);
		}
		else if(b>=c&&c>=a)
		{			
			System.out.println("El órden es " + b + ", " + c + ", " + a);
		}
	}
}
