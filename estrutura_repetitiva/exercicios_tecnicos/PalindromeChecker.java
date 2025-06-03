package exercicios_tecnicos;

import java.util.Scanner;

/*Receba uma palavra do usu�rio e determine se ela � um 
 * pal�ndromo (lida da mesma forma de tr�s para frente).
 * Ex.: "arara" � um pal�ndromo.
 * Utilize um loop while*/

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = sc.nextLine().trim().toUpperCase();
		
		String invertida = palavraInvertida(palavra);
		
		System.out.println(palavra + verificarPolindromo(palavra, invertida));
		
		sc.close();

	}
	
	public static String palavraInvertida(String palavra) {
		String invertida = "";
		int i = palavra.length() - 1;
		while(i >= 0) {
			invertida += palavra.charAt(i);
			i--;
		}
		
		return invertida;
	}
	
	public static String verificarPolindromo(String original, String invertida) {
		return original.equals(invertida) ? " � um Pal�ndromo" : " N�o � um Pal�ndromo";
	}

}
