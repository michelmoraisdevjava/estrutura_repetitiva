package desafio;

import java.util.Scanner;

public class SistemaCaixaEletrônico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double saldoInicial = 1000.00;
		double saque = 0;
		double deposito = 0;
		double saldoFinal = saldoInicial + deposito;
		double saqueTotal = 0;
		double depositoTotal = 0;

		System.out.println("Menu do Sistema:");
		System.out.println("1 - Saque");
		System.out.println("2 - Depósito");
		System.out.println("3 - Consulta de saldo");
		System.out.println("4 - Sair");
		System.out.print("Informe a opção: ");

		int opcao = sc.nextInt();
		
		while(opcao != 4) {
			
			if(opcao == 1) {
				System.out.print("Valor de saque: ");
				saque = sc.nextDouble();
				if(saque > saldoFinal) {
					System.out.println("Valor insuficiente!");
				} else {
					saldoFinal -= saque;
					saqueTotal += saque;
				}
			} else if(opcao == 2) {
				System.out.print("Valor do depósito: ");
				deposito = sc.nextDouble();
				saldoFinal += deposito;
				depositoTotal += deposito;
			} else if (opcao == 3) {
				double consultaSaldo =  saldoFinal;
				System.out.printf("Saldo atual R$ %.2f%n", consultaSaldo);
			} else {
				System.out.println("Opção inválida!");
			}
			System.out.print("Informe a opção: ");
			opcao = sc.nextInt();
		}
		
		System.out.println("Programa encerrado!");
		
		System.out.println("\nRelatório de saques e depósitos");
		System.out.printf("Saldo Inicial em conta R$ %.2f%n", saldoInicial);
		System.out.printf("Depósito total em conta R$ %.2f%n", depositoTotal);
		System.out.printf("Saque total em conta R$ %.2f%n", saqueTotal);
		System.out.printf("Saldo final em conta R$ %.2f%n", saldoFinal);

		sc.close();

	}

}
