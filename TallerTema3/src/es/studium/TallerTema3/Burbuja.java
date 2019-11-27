package es.studium.TallerTema3;

import java.util.Scanner;

public class Burbuja
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
		for(i=0; i<=8;i++) {
			for(j=0; j<=8; j++)
				//Comparacion
				if(tabla[j]>tabla[j+1])
				{
					//Intercambio
					aux=tabla[j];
					tabla[j]=tabla[j+1];
					tabla[j+1]=aux;
				}
		}
		System.out.println("La tabla ordenada queda así:");
		for(i=0; i<=9; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}

}
