package exercicios_for;

/*Laço com Múltiplas Variáveis:
 * É possível inicializar e incrementar mais de uma variável:*/
public class Exemplo {

	public static void main(String[] args) {

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i: " + i + ", j: " + j);
		}

	}

}
