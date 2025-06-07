package exercicios_tecnicos;

import java.util.Scanner;

/*A Conjectura de Collatz afirma que, dado um número n:
o	Se for par, divida por 2.
o	Se for ímpar, multiplique por 3 e some 1.
o	O processo se repete até n chegar a 1.
Implemente essa lógica e mostre o caminho percorrido.
o	Utilize um loop while.*/

public class CollatzConjecture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número ao qual irá aplicar a Conjectura: ");
		int n = sc.nextInt();

		/*if (n <= 0) {//validação
			System.out.println("Número inválido! A conjectura collatz só funciona com números inteiros positivos");
		} else {
			while (n != 1) {
				if (n % 2 == 0) {
					System.out.println(n + " / 2 = " + (n / 2));
					n = n / 2; //Atualiza o valor de n.
				} else {
					System.out.println(n + " x 3 + 1 = " + (n * 3 + 1));
					n = n * 3 + 1; //Atualiza o valor de n.
				}
			}
		}*/

		// Minha versão
		if (n <= 0) {
			System.out.println("Número inválido! A conjectura collatz só funciona com números inteiros positivos");
		} else {
			while (n != 1) {
				if (n % 2 != 0) {
					System.out.println("n x 3 + 1 = " + (n * 3 + 1));
					n = n * 3 + 1; //Atualizar o valor de n
				}
				if (n % 2 == 0) {
					System.out.println("n / 2 = " + (n / 2));
				}
				n = n / 2; //Atualizar o valor de n
			}
		}
		sc.close();

	}

}
