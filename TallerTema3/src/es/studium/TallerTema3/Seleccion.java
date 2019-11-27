package es.studium.TallerTema3;

import java.util.Scanner;

public class Seleccion
{

	public static void main(String[] args)
	{
		int tabla [] = new int [10];
		int i,j,indice_menor,aux;
		Scanner teclado = new Scanner(System.in);
		
		for(i=0; i<=9; i++)
		{
			System.out.println("Dame un número entero:");
			tabla[i]=teclado.nextInt();
		}
		for(i=0; i<=8; i++)
		{
			indice_menor=1;
			for(j=i+1; j<=9; j++)
			{
				if(tabla[j]<tabla[indice_menor])
				{
					indice_menor=j;
				}
			}
			aux=tabla[i];
			tabla[i]=tabla[indice_menor];
			tabla[indice_menor]=aux;
		}
		for(i=0;i<=9;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}

}
