package desafio;

import java.util.Arrays;
import java.util.StringJoiner;

public class SomaValoresMaiorReferencia {

	public static void main(String[] args) {
		
		final int REFERENCIA = 25;
		
		int[] valores = {10, 15, 45, 25, 38, 56, 14, 32, 1};
		Arrays.sort(valores);
		
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		int soma = 0;
		int quantidade = 0;
		for(int valor : valores) {
			if(valor > REFERENCIA) {
				soma += valor;
				sj.add(String.valueOf(valor));
				quantidade++;
			}
		}
		
		System.out.println(sj.toString());
		System.out.printf("A soma dos valores encontrados: %d%n", soma);
		System.out.printf("A quantidade total dos elementos: %d%n", quantidade);

	}

}
