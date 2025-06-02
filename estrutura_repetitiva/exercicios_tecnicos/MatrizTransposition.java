package exercicios_tecnicos;

import java.util.Scanner;

/*Crie um programa que solicite uma matriz (2x2 ou 3x3) e calcule a sua transposição.
 * Utilize loops aninhados for.
*/
public class MatrizTransposition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número total de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite o número total de colunas: ");
		int m =  sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("Elemento [" + i + "] " + "[" + j + "] = " );
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz original:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("Elemento [" + i + "] " + "[" + j + "] = " );
				System.out.println(matriz[i][j] + " ");
			}
		}
		
		System.out.println("Matriz Transposta:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("Elemento [" + j + "] " + "[" + i + "] = " );
				System.out.println(matriz[j][i] + " ");
			}
		}
		
		sc.close();

	}

}
