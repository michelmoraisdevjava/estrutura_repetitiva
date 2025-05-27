package do_while;

import java.util.Scanner;

/*Crie um programa que leia um nome e 
 * continue pedindo enquanto o nome não for "Java".*/
public class LeitorDeNome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		do {
			System.out.print("Digite a palavra correta: ");
			nome = sc.nextLine();
			
		}while(!nome.equals("Java"));
		
		System.out.println("Fim do Programa!");
		
		sc.close();

	}

}
