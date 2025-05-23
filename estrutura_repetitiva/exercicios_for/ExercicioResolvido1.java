package exercicios_for;

//Imprima os números pares de 0 a 20.
public class ExercicioResolvido1 {

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i += 2) {
			System.out.print(i);
			if(i <= 20 - 1) {
				System.out.print(", ");
			}
		}

	}

}
