package exercicios_tecnicos_for;

import java.util.Scanner;

public class QuadradoDeAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("Informe um número inteiro: ");
			while (!sc.hasNextInt()) {
				System.out.print("Valor inválido! Informe um número positivo: ");
				sc.next();
			}

			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Erro: o número não pode ser negativo.");
			}
		} while (n < 0);
		
		for (int i = 0; i < n; i++) {
			System.out.println("****");
		}

		sc.close();

	}

}
