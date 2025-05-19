package exercicios_while;

import java.util.Scanner;
import java.util.stream.IntStream;
/*o	Crie um programa que receba números do usuário 
 * até que a soma deles seja maior que 50.*/

public class SomaAteLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LIMITE = 50;
		
		int numeros;
		int soma = 0;
		
		while(soma <= LIMITE) {
			System.out.print("Digite um número: ");
			while(!sc.hasNextInt()) {
				System.out.print("Entrada inválida! Digite um número inteiro: ");
				sc.next();
			}
			numeros = sc.nextInt();
			soma += numeros;
		}
		
		//Versão: Código Moderno
		while (soma <= LIMITE) {
            System.out.print("Digite um número: ");
            while(!sc.hasNextInt()) {
				System.out.print("Entrada inválida! Digite um número inteiro: ");
				sc.next();
			}
            soma += IntStream.of(sc.nextInt()).sum();
        }
		System.out.println(soma);
		
		sc.close();

	}

}
