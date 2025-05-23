package exercicios_for;

import java.util.StringJoiner;

/*Percorra um array de inteiros e imprima apenas os valores maiores que 10:*/
public class ExercicioResolvido3 {

	public static void main(String[] args) {
		int[] valores = {5, 12, 7, 20, 30};
		StringJoiner joiner = new StringJoiner(", ");
		
		for(int valor : valores) {
			if(valor > 10) {
				joiner.add(String.valueOf(valor));
			}
		}
		
		System.out.println(joiner.toString());

	}

}
