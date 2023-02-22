package es.studium.ejercicio5;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		// SUMA DE LOS 20 PRIMEROS NÚMEROS PARES Y PRODUCTO DE LOS 20 PRIMEROS NÚMEROS IMPARES
		int i, suma, producto;
		suma = 0;
		producto = 1;
		for(i=0; i<=39; i++)
		{
			if(i%2==0)
			{
				suma=suma+i;
			}
			else
			{
				producto=producto*i;
			}
		}
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
	}
}
