package exercicios_tecnicos;

import java.util.Scanner;

/*Receba dois números inteiros (x e y) e imprima todos 
 * os números primos no intervalo [x, y].
 * Utilize um loop for aninhado para a verificação*/

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		int y = sc.nextInt();
		
		// Garantir que x seja menor que y
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        
		for(int i = x; i <= y; i++) {
			if(ehPrimo(i)) {
				System.out.print(i + " ");
			}
		}	
		
		sc.close();

	}
	
	public static boolean ehPrimo(int n) {
		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		
		for(int j = 3; j < Math.sqrt(n); j++) {
			if(n % j == 0) {
				return false;
			}
		}
		return true;
	}

}
