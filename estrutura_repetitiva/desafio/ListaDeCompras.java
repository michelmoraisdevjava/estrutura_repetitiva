package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Produtos> produtos = obterListaDeProdutos(sc);
		exibirListaDeProdutos(produtos);
		calcularEExibirResumo(produtos);

	}
	
	public static List<Produtos> obterListaDeProdutos(Scanner sc){
		List<Produtos> produtos = new ArrayList<>();
		double preco;
		String nome;
		
		do {
			System.out.print("Digite o nome do produto (ou 'Fim' para terminar): ");
			nome = sc.nextLine();
			
			if(!nome.equalsIgnoreCase("fim")) {
				while(true) {
					try {
						System.out.print("Digite o preço do produto R$ ");
						preco = Double.parseDouble(sc.nextLine());
						produtos.add(new Produtos(nome, preco));
						break;
					}catch(NumberFormatException e) {
						System.out.println("Entrada inválida! Digite um número válido.");
					}
				}
			}
		}while(!nome.equalsIgnoreCase("fim"));
		
		return produtos;
	}
	
	public static void exibirListaDeProdutos(List<Produtos> produtos) {
		System.out.println("\nLista de produtos:");
		for(Produtos produto: produtos) {
				System.out.println(produto);
		}
	}
	
	public static void calcularEExibirResumo(List<Produtos> produtos) {
		double total = 0.0;
		Produtos produtoMaisCaro = null;
		
		for(Produtos produto : produtos) {
			total += produto.getPreco();
			if(produtoMaisCaro == null || produto.getPreco() > produtoMaisCaro.getPreco()) {
				produtoMaisCaro = produto;
			}
		}
		
		System.out.printf("\nValor total da compra R$ %.2f%n", total);
		if(produtoMaisCaro != null) {
			System.out.printf("Produto mais caro %s - R$ %.2f", produtoMaisCaro.getNome(), produtoMaisCaro.getPreco());
		}
	}

}
