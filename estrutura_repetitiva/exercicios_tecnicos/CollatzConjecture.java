package exercicios_tecnicos;

import java.util.Scanner;

/*A Conjectura de Collatz afirma que, dado um n�mero n:
o	Se for par, divida por 2.
o	Se for �mpar, multiplique por 3 e some 1.
o	O processo se repete at� n chegar a 1.
Implemente essa l�gica e mostre o caminho percorrido.
o	Utilize um loop while.*/

public class CollatzConjecture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero ao qual ir� aplicar a Conjectura: ");
		int n = sc.nextInt();

		/*if (n <= 0) {//valida��o
			System.out.println("N�mero inv�lido! A conjectura collatz s� funciona com n�meros inteiros positivos");
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

		// Minha vers�o
		if (n <= 0) {
			System.out.println("N�mero inv�lido! A conjectura collatz s� funciona com n�meros inteiros positivos");
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
