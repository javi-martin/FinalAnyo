package es.studium.FinalAnyo;

import java.util.Scanner;

public class FinalAnyo {

	public static void main(String[] args) 
	{
		int anyonormal[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int anyobisiesto[] = {31,29,31,30,31,30,31,31,30,31,30,31};	
		
		int dia, mes, anyo, diasanyo=0, finanyo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica un número correspondiente al dia");
		dia = teclado.nextInt();
		
		System.out.println("Indica un número correspondiente al mes");
		mes = teclado.nextInt();
		
		System.out.println("Indica un número correspondiente al año");
		anyo = teclado.nextInt();
		
		teclado.close();
		
		if((anyo%4==0) && (anyo%100!=0) || (anyo%400==0)) 
		{
			for(int i=0; i<mes-1; i++) 
			{
				diasanyo=diasanyo+anyobisiesto[i];
			}
			finanyo=366-(diasanyo+dia);
		}
		else 
		{
			for(int i=0; i<mes-1; i++) 
			{
				diasanyo=diasanyo+anyonormal[i];
			}
			finanyo=365-(diasanyo+dia);
		}
		
		System.out.println("La fecha introducida es: "+dia+"/"+mes+"/"+anyo);
		System.out.println("Los días que quedan para final de año son: "+finanyo);

	}

}
