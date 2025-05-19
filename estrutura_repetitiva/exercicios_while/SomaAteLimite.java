package exercicios_while;

import java.util.Scanner;
import java.util.stream.IntStream;
/*o	Crie um programa que receba n�meros do usu�rio 
 * at� que a soma deles seja maior que 50.*/

public class SomaAteLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LIMITE = 50;
		
		int numeros;
		int soma = 0;
		
		while(soma <= LIMITE) {
			System.out.print("Digite um n�mero: ");
			while(!sc.hasNextInt()) {
				System.out.print("Entrada inv�lida! Digite um n�mero inteiro: ");
				sc.next();
			}
			numeros = sc.nextInt();
			soma += numeros;
		}
		
		//Vers�o: C�digo Moderno
		while (soma <= LIMITE) {
            System.out.print("Digite um n�mero: ");
            while(!sc.hasNextInt()) {
				System.out.print("Entrada inv�lida! Digite um n�mero inteiro: ");
				sc.next();
			}
            soma += IntStream.of(sc.nextInt()).sum();
        }
		System.out.println(soma);
		
		sc.close();

	}

}
