package es.studium.ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		int a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		a = teclado.nextInt();
		teclado.close();
		switch(a)
		{
		case 1:
			System.out.println("El mes equivalente al número " + a + " es Enero");
			break;
		case 2:
			System.out.println("El mes equivalente al número " + a + " es Febrero");
			break;
		case 3:
			System.out.println("El mes equivalente al número " + a + " es Marzo");
			break;
		case 4:
			System.out.println("El mes equivalente al número " + a + " es Abril");
			break;
		case 5:
			System.out.println("El mes equivalente al número " + a + " es Mayo");
			break;
		case 6:
			System.out.println("El mes equivalente al número " + a + " es Junio");
			break;
		case 7:
			System.out.println("El mes equivalente al número " + a + " es Julio");
			break;
		case 8:
			System.out.println("El mes equivalente al número " + a + " es Agosto");
			break;
		case 9:
			System.out.println("El mes equivalente al número " + a + " es Septiembre");
			break;
		case 10:
			System.out.println("El mes equivalente al número " + a + " es Octubre");
			break;
		case 11:
			System.out.println("El mes equivalente al número " + a + " es Noviembre");
			break;
		case 12:
			System.out.println("El mes equivalente al número " + a + " es Diciembre");
			break;
		default:
			System.out.println("Tu número no coincide con ningún mes");
			break;
		}
		
	}

}
