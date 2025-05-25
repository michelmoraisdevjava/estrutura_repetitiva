package exercicios_tecnicos_for;

import java.util.Scanner;

/*Crie um programa que receba um número e 
 * verifique se ele é primo usando um laço for.*/

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		do {
			System.out.print("Informe o número: ");
			while (!sc.hasNextInt()) {
				System.out.print("Valor inválido! Informe um número inteiro: ");
				sc.next();
			}

			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("Erro: O número não pode ser negativo.");
			}
		} while (numero < 0);
		
		System.out.println(numero + (ehPrimo(numero) ? " é primo" : " não é primo"));

		sc.close();

	}

	public static boolean ehPrimo(int numero) {
		if (numero < 2) return false;
		if (numero == 2) return true;// 2 é primo
		if (numero % 2 == 0) return false; //Elimina números pares

		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
