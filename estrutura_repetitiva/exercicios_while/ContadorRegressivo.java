package exercicios_while;

import java.util.Scanner;
import java.util.stream.IntStream;

/*o	Desenvolva um contador regressivo que peça 
 * ao usuário um número inicial e conte até zero.*/

public class ContadorRegressivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LIMITE = 0;
		
		System.out.print("Digite o número: ");
		while(!sc.hasNextInt()) {
			System.out.print("Entrada inválida! Digite um número: "); 
			sc.next();
		}
		
		int numero = sc.nextInt();
		
		while(numero >= LIMITE ) {
			System.out.println(numero);
			numero--;
		}
		
		/*Usar um loop funcional → Outra abordagem mais moderna com Stream API:*/
		 IntStream.iterate(numero, n -> n - 1)
         .limit(numero + 1)
         .forEach(System.out::println);

		
		
		
		sc.close();

	}

}
