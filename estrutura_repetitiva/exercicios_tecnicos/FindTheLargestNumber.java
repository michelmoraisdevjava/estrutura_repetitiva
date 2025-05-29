package exercicios_tecnicos;

import java.util.Scanner;

/*Solicite 5 números ao usuário e determine qual é o maior.
 * Utilize um loop for.*/

public class FindTheLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int maior = 0;
		System.out.println("Informe 5 números inteiros de sua preferência:");
		for(int i = 0; i < 5; i++) {
			System.out.print("digite o " + (i + 1) + "º número: ");
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior número foi: " + maior);
		
		sc.close();

	}

}
