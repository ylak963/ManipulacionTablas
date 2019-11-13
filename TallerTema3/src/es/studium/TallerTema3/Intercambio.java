package es.studium.TallerTema3;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		int tabla [] = new int [10];
		int i,j,aux;
		Scanner teclado = new Scanner(System.in);

		for(i=0; i<8; i++)
		{
			System.out.println("Dame un número entero:");
			tabla[i]= teclado.nextInt();
		}
		for(i=0; i<9; i++) {
			for(j=i+1; j<=9; j++) {
				//Cambiando el mayor o menor que para conseguir la ordenación de los numeros.
				if(tabla[i]<tabla[j])
				{
					aux=tabla[i];
					tabla[i]=tabla[j];
					tabla[j] = aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda así:");
		for(i=0; i<9; i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
