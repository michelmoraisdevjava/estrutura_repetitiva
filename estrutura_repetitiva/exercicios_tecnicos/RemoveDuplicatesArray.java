package exercicios_tecnicos;

import java.util.Scanner;

/*Receba um array de inteiros e remova os 
 * valores duplicados. Exiba o array atualizado.
 * Ex.: Entrada: [1, 2, 2, 3, 4, 4, 5] → Saída: [1, 2, 3, 4, 5]
 * Utilize um loop for aninhado.*/

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantiddade de elementos do Array: ");
		int tamanho = sc.nextInt();
		int[] entrada = new int[tamanho];
		
		System.out.println("Digite os números:");
		for(int i = 0; i < tamanho; i++) {
			entrada[i] = sc.nextInt();
		}
		
		//Criando um array para armazenar valores únicos
		int[] resultado = new int[tamanho];
		int contador = 0;
		
		//Percorrer o Array de entrada
		for(int i = 0; i < tamanho; i++) {
			boolean duplicado = false;
			
			//Checar se o número já está no Array resultado
			for(int j = 0; j < contador; j++) {
				if(entrada[i] == resultado[j]) {
					duplicado = true;
					break; //Se já existe, não precisa continuar checando
				}
			}
			
			//Se não for duplicado , adicionamos ao array de resultado
			if(!duplicado) {
				resultado[contador] = entrada[i];
				contador++;
			}
		}
		
		//Exibindo o array atualizado  sem duplicatas
		System.out.print("Array sem duplicatas: [");
		for(int i = 0; i < contador; i++) {
			System.out.print(resultado[i] + (i < contador - 1 ? ", " : "") );
		}
		System.out.println("]");
		
		/*Set<Integer> valores = new HashSet<Integer>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
		
		System.out.println(valores);*/
		
		sc.close();

	}

}
