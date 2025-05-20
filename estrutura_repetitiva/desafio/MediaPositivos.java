package desafio;

import java.util.Locale;
import java.util.Scanner;

/* Faça um programa que receba repetidamente números 
 * inteiros até que o usuário insira um número negativo. 
 * O programa deve imprimir a média dos números positivos inseridos.*/

public class MediaPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//1ª versão: 
		
		/*int numero = 0;
		int soma = 0;
		int contador = 0;

		while (numero >= 0) {
			System.out.print("Digite um numero inteiro: ");

			while (!sc.hasNextInt()) {
				System.out.print("Entrada Inválida! Digite um numero inteiro: ");
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
		
		// 2ª versão	
		double media = calcularMediaPositivos(sc);
		
		System.out.printf("Média dos númeiros inteiros positivos: %.1f%n", media);

		sc.close();

	}

	public static int solicitarNumero(Scanner sc) {
		System.out.print("Digite um numero inteiro: ");

		while (!sc.hasNextInt()) {
			System.out.print("Entrada Inválida! Digite um numero inteiro: ");
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
