package desafio;

import java.util.Locale;
import java.util.Scanner;

public class SistemaCaixaEletrônico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		final double SALDO_INICIAL_PADRAO = 1000.00;
		
		double saldoInicial = 1000.00;
		double saqueTotal = 0;
		double depositoTotal = 0;
		double saldoFinal = SALDO_INICIAL_PADRAO;
		
		exibirMenu();
		
		int opcao = sc.nextInt();
		
		while(opcao != 4) {
			
			if(opcao == 1) {
				double[] resultado = operacaoSacar(sc, saldoFinal, saqueTotal);
				saldoFinal = resultado[0];
				saqueTotal = resultado[1];

			} else if(opcao == 2) {
				double[] resultado = operacaoDepositar(sc, saldoFinal, depositoTotal);
				saldoFinal = resultado[0];
				depositoTotal = resultado[1];
			} else if (opcao == 3) {
				operacaoConsultarSaldo(saldoFinal);
			} else {
				System.out.println("Opção inválida!");
			}
			System.out.print("Informe a opção: ");
			opcao = sc.nextInt();
		}
		
		imprimirRelatorio(saldoInicial, depositoTotal, saqueTotal, saldoFinal);

		sc.close();

	}
	
	public static void exibirMenu() {
		System.out.println("Menu do Sistema:");
		System.out.println("1 - Saque");
		System.out.println("2 - Depósito");
		System.out.println("3 - Consulta de saldo");
		System.out.println("4 - Sair");
		System.out.print("Informe a opção: ");
	}
	
	//Função que retorna um array
	public static double[] operacaoSacar(Scanner sc, double saldoFinal, double saqueTotal) {
		System.out.print("Valor de saque: ");
		double saque = sc.nextDouble();
		if(saque > saldoFinal) {
			System.out.println("Valor insuficiente!");
		} else {
			saldoFinal -= saque;
			saqueTotal += saque;
		}
		return new double[] {saldoFinal, saqueTotal};
	}
	
	public static double[] operacaoDepositar(Scanner sc, double saldoFinal, double depositoTotal) {
		System.out.print("Valor do depósito: ");
		double deposito = sc.nextDouble();
		saldoFinal += deposito;
		depositoTotal += deposito;
		return new double[] {saldoFinal, depositoTotal};
	}
	
	public static void operacaoConsultarSaldo(double saldoFinal) {
		double consultaSaldo =  saldoFinal;
		System.out.printf("Saldo atual R$ %.2f%n", consultaSaldo);
	}
	
	public static void imprimirRelatorio(double saldoInicial, double depositoTotal, double saqueTotal, double saldoFinal) {
		System.out.println("\nPrograma encerrado!");
		
		System.out.println("\nRelatório de saques e depósitos");
		System.out.printf("Saldo Inicial em conta R$ %.2f%n", saldoInicial);
		System.out.printf("Depósito total em conta R$ %.2f%n", depositoTotal);
		System.out.printf("Saque total em conta R$ %.2f%n", saqueTotal);
		System.out.printf("Saldo final em conta R$ %.2f%n", saldoFinal);
	}
}
