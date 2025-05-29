package exercicios_tecnicos;

import java.util.Scanner;

/*Solicite 5 n�meros ao usu�rio e determine qual � o maior.
 * Utilize um loop for.*/

public class FindTheLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int maior = 0;
		System.out.println("Informe 5 n�meros inteiros de sua prefer�ncia:");
		for(int i = 0; i < 5; i++) {
			System.out.print("digite o " + (i + 1) + "� n�mero: ");
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior n�mero foi: " + maior);
		
		sc.close();

	}

}
