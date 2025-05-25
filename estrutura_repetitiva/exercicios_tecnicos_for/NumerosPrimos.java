package exercicios_tecnicos_for;

import java.util.Scanner;

/*Crie um programa que receba um n�mero e 
 * verifique se ele � primo usando um la�o for.*/

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		do {
			System.out.print("Informe o n�mero: ");
			while (!sc.hasNextInt()) {
				System.out.print("Valor inv�lido! Informe um n�mero inteiro: ");
				sc.next();
			}

			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("Erro: O n�mero n�o pode ser negativo.");
			}
		} while (numero < 0);
		
		System.out.println(numero + (ehPrimo(numero) ? " � primo" : " n�o � primo"));

		sc.close();

	}

	public static boolean ehPrimo(int numero) {
		if (numero < 2) return false;
		if (numero == 2) return true;// 2 � primo
		if (numero % 2 == 0) return false; //Elimina n�meros pares

		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
