package exercicios_tecnicos;

import java.util.Scanner;

public class ReversingAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a texto que deve ser invertido: ");
		String texto = sc.nextLine();
		String textoInvertido = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		System.out.println(textoInvertido);
		
		//Temos uma abordagem amis eficiente no lugar do Laço For
		/*String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println(textoInvertido);*/
		
		sc.close();

	}

}
