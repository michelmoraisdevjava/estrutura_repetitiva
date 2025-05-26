package exercicios_tecnicos_for;

import java.util.Scanner;

public class QuadradoDeAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("Informe um n�mero inteiro: ");
			while (!sc.hasNextInt()) {
				System.out.print("Valor inv�lido! Informe um n�mero positivo: ");
				sc.next();
			}

			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Erro: o n�mero n�o pode ser negativo.");
			}
		} while (n < 0);
		
		for (int i = 0; i < n; i++) {
			System.out.println("****");
		}

		sc.close();

	}

}
