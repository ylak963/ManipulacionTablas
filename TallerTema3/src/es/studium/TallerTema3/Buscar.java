package es.studium.TallerTema3;

import java.util.Random;
import java.util.Scanner;

public class Buscar
{

	public static void main(String[] args)
	{
		int tabla [] = new int [100];
		int i;
		boolean encontrado = false;
		int numero;
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		for(i=0; i<100; i++)
		{
			tabla[i]= aleatorio.nextInt(100)+1;
		}

		for(i=0; i<100; i++)
		{
			System.out.println(tabla[i]);
		}
		System.out.println("¿Qué número quieres buscar?");
		numero = teclado.nextInt();
		for(i=0; i<100; i++)
		{
			if(numero==tabla[i])
			{
				System.out.println("El número está en la posición" +i);
				encontrado=true;
			}
			
		}
		if(!encontrado)
		{
			System.out.println("No se encuentra en la tabla.");
		}
		teclado.close();
	}
}
