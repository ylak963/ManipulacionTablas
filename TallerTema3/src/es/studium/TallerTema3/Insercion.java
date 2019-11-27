package es.studium.TallerTema3;

import java.util.Scanner;

public class Insercion
{

	public static void main(String[] args)
	{
		int tabla [] = new int [10];
		int i,j,aux;
		Scanner teclado = new Scanner(System.in);
		for(i=0; i<=9; i++)
		{
			System.out.println("Dame un número entero:");
			tabla[i]=teclado.nextInt();
		}
		for(i=0; i<=9; i++)
		{
			j=i;
			aux=tabla[i];
			while(j>0 && aux<tabla[j-1])
			{
				tabla[j]=tabla[j-1];
				j=j-1;
			}
			tabla[j]=aux;
		}
		System.out.println("La tabla ordenada queda asi:");
		for(i=0; i<=9;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}

}
