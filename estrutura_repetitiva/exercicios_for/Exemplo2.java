package exercicios_for;

import java.util.Arrays;
import java.util.StringJoiner;

public class Exemplo2 {

	public static void main(String[] args) {
		/*Enhanced For (For-Each):
		Usado para percorrer arrays e coleções:*/
			int[] numeros = {10, 20, 30};
			for (int numero : numeros) {
			    System.out.println(numero);
			}
		
		/*Para evitar que a última vírgula seja impressa, você pode usar um 
		 * loop tradicional com um índice e imprimir a vírgula apenas quando não for 
		 * o último elemento. Aqui está uma solução:*/
			System.out.println("\nUsando For tradicional");
			int[] numeros2 = {10, 20, 30};

			for (int i = 0; i < numeros2.length; i++) {
			    System.out.print(numeros2[i]);
			    if (i < numeros2.length - 1) { // Adiciona a vírgula apenas se não for o último elemento
			        System.out.print(", ");
			    }
			}
			
		/*1️⃣ Usando StringJoiner 
		 * O StringJoiner permite adicionar elementos com um delimitador sem precisar 
		 * se preocupar com a última vírgula:*/
			
			System.out.println("\nUsandoStringJoiner");
			int[] numeros3 = {10, 20, 30};
			StringJoiner joiner = new StringJoiner(", ");

			for (int numero : numeros3) {
			    joiner.add(String.valueOf(numero));
			}

			System.out.println(joiner.toString());
			//✅ Vantagens: Código limpo e evita verificações manuais.
			
			/*2️⃣ Usando List e String.join()
			 * Se puder usar uma List, pode converter o array e usar String.join():*/
			System.out.println("\nUsando List e String.join");
			int[] numeros4 = {10, 20, 30};
			String resultado = String.join(", ", Arrays.stream(numeros4)
			                                           .mapToObj(String::valueOf)
			                                           .toArray(String[]::new));

			System.out.println(resultado);
			//✅ Vantagens: Simples e usa métodos modernos do Java.

	}

}
