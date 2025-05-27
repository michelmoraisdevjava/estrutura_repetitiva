package exercicios_tecnicos_for;

import java.util.Scanner;

/*Crie um programa que receba um n�mero e exiba 
 * um quadrado de asteriscos com esse tamanho*/

public class QuadradoDeAsteriscos {

	public static void main(String[] args) {
		
		int n = validarEntrada();
		exibirQuadradoAsterisco(n);

	}
	
	public static int validarEntrada() {
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
		
		sc.close();
		return n;
	}
	
	public static int exibirQuadradoAsterisco(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return n;
	}
}
