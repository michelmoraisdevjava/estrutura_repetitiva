package exercicios_for;

/*Calcule a soma dos n�meros de 1 a 10.*/
public class ExercicioResolvido2 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos n�meros de 1 at� 10: " + soma);

	}

}
