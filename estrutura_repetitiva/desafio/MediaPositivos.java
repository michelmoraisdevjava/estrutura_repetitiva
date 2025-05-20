package desafio;

import java.util.Locale;
import java.util.Scanner;

/* Fa�a um programa que receba repetidamente n�meros 
 * inteiros at� que o usu�rio insira um n�mero negativo. 
 * O programa deve imprimir a m�dia dos n�meros positivos inseridos.*/

public class MediaPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//1� vers�o: 
		
		/*int numero = 0;
		int soma = 0;
		int contador = 0;

		while (numero >= 0) {
			System.out.print("Digite um numero inteiro: ");

			while (!sc.hasNextInt()) {
				System.out.print("Entrada Inv�lida! Digite um numero inteiro: ");
				sc.next();
			}
			numero = sc.nextInt();
			if (numero >= 0) {
				soma += numero;
				contador++;
			}
		}

		double media = (contador > 0) ? (double) soma / contador : 0;

		System.out.printf("%.1f%n", media);*/
		
		// 2� vers�o	
		double media = calcularMediaPositivos(sc);
		
		System.out.printf("M�dia dos n�meiros inteiros positivos: %.1f%n", media);

		sc.close();

	}

	public static int solicitarNumero(Scanner sc) {
		System.out.print("Digite um numero inteiro: ");

		while (!sc.hasNextInt()) {
			System.out.print("Entrada Inv�lida! Digite um numero inteiro: ");
			sc.next();
		}
		return sc.nextInt();
	}

	public static double calcularMediaPositivos(Scanner sc) {
		int soma = 0;
		int numero = 0;
		int contador = 0;
		
		while(numero >= 0) {
			numero = solicitarNumero(sc);
			
			if(numero >= 0) {
				soma += numero;
				contador ++;
			}
		}
		
		return (contador > 0) ? (double) soma / contador : 0;

	}
}
