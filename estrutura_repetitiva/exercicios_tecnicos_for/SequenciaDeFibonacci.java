package exercicios_tecnicos_for;

import java.util.Scanner;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Informe um n�mero positivo: ");
			while(!sc.hasNextInt()) {
				System.out.print("Valor inv�lido! Informe um n�mero inteiro: ");
				sc.next();
			}
			n = sc.nextInt();
			if(n < 0) {
				System.out.println("Erro: O n�mero n�o pode ser negativo!");
			}
		}while(n < 0);
		
		calcularFibonacci(n);
		
		sc.close();

	}
	
	public static int calcularFibonacci(int n) {
		int a = 0, b = 1;
		
		System.out.print(a + " " + b + " ");
		
		for(int i = 2; i < n; i++) {
			int proximo = a + b;
			System.out.print(proximo + " ");
			a = b;
			b = proximo;
		}
		return n;
	}

}
