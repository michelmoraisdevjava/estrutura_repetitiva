package exercicios_for;

import java.util.StringJoiner;

public class FiltroNomesArray {

	public static void main(String[] args) {
		String[] nomes = {"Ana", "Carlos", "André", "Arthur", "Camila"};
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		
		for(String nome : nomes) {
			if(nome.startsWith("A")) {
				joiner.add(nome);
			}
		}
		
		System.out.println(joiner.toString());

	}

}
