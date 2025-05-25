package exercicios_tecnicos_for;

import java.util.Scanner;

/*Crie um programa que receba um número inteiro e 
 * calcule seu fatorial usando um laço for*/
public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		while (true) {
			try {
				System.out.print("Informe um número inteiro: ");	
				numero = sc.nextInt();
				if (numero < 0) {
                    System.out.println("Erro: O número não pode ser negativo. Tente novamente.");
                    continue; // Volta ao início do loop até que seja positivo
                }
				break;
			} catch (Exception e) {
				System.out.println("Erro: Entrada inválida! Digite um número inteiro.");
				sc.next();
			}
		}
		long fatorial = calcularFatorial(numero);
		System.out.print(numero + "! = ");

		if (numero == 0 || numero == 1) {
			System.out.print(numero + " x 1 ");
		} else {
			for (int i = numero; i >= 1; i--) {
				System.out.print(i);

				if (i > 1) {
					System.out.print(" x ");
				}
			}
		}

		System.out.printf(" = %d%n", fatorial);

		sc.close();

	}

	public static long calcularFatorial(int n) {
	    long resultado = 1;
	    for (int i = 2; i <= n; i++) {
	        resultado *= i;
	    }
	    return resultado;
	}


}
