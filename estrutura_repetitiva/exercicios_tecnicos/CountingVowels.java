package exercicios_tecnicos;

import java.util.Scanner;
import java.util.Set;

/*Receba um texto e conte quantas vogais (a, e, i, o, u) existem nele.
 * Utilize um loop for.
*/

public class CountingVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o texto: ");
		String texto = sc.nextLine().toLowerCase();
		
		Set<Character> vogais = Set.of('a', 'e', 'i', 'o', 'u');
		
		int contadorDeVogais = 0;
		for(char c : texto.toCharArray()) {
			if(vogais.contains(c)) {
				contadorDeVogais++;
			}
		}
		
		System.out.printf("Quantidade de vogais: %d%n", contadorDeVogais);
		
		sc.close();

	}

}
