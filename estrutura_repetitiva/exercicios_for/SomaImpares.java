package exercicios_for;

/*Incremente um valor de 0 at� 100, somando apenas os valores �mpares.*/
public class SomaImpares {

	public static void main(String[] args) {
		final int VALOR = 100;

		int somaImpares = 0;
		for (int i = 1; i <= VALOR; i += 2) {
			somaImpares += i;
		}

		System.out.printf("A soma dos n�meros �mpares � %d%n", somaImpares);
	}
}
