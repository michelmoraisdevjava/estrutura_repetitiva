package exercicios_tecnicos;

import java.util.Scanner;

/*Crie um programa que exiba uma pirâmide numérica 
 * com base em um número informado pelo usuário.*/

public class PiramideNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				imprimir(i);
			}
			System.out.println();
		}
		
		sc.close();

	}
	
	public static void imprimir(int i) {
		System.out.print(i);
	}

}
