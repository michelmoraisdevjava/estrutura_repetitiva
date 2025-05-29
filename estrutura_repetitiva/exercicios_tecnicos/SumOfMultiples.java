package exercicios_tecnicos;

import java.util.Scanner;

/*Receba um n�mero n e calcule a soma de todos 
 * os m�ltiplos de 3 e 5 menores que n.
 * Utilize um loop while.*/

public class SumOfMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = sc.nextInt();
		int i = 1;
		
		int somaMultiplos = 0;
		while(i < n) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
				somaMultiplos += i;
			}
			i++;
		}
		System.out.println();
		System.out.printf("A soma dos m�ltiplos de 3 e de 5: %d%n", somaMultiplos);
		
		sc.close();

	}

}
