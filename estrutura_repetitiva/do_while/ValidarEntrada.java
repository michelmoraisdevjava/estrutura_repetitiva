package do_while;

import java.util.Scanner;

/*Valide uma entrada de idade para ser maior que 18, 
 * solicitando novamente at� ser v�lida*/
public class ValidarEntrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		do {
			System.out.print("Tem que ser maior de 18 anos! Digite sua idade: ");
			while(!sc.hasNextInt()) {
				System.out.print("Valor inv�lido! Digite um n�mero inteiro: ");
				sc.next();
			}
			
			idade = sc.nextInt();
			if(idade < 0) {
				System.out.println("Idade negativa n�o existe!");
			}
		}while(idade < 18);
		
		System.out.println("Maior de 18 anos! Acesso permitido!");
		
		sc.close();

	}

}
