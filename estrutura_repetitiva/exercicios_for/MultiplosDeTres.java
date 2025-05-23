package exercicios_for;

//Imprima os múltiplos de 3 entre 0 e 30.
public class MultiplosDeTres {

	public static void main(String[] args) {
		/*✅ Primeira abordagem: Usando incremento de 3 (i += 3)*/
		for(int i = 0; i <= 30; i += 3) {
			System.out.print(i);
			if(i <= 30 -1) {
				System.out.print(", ");
			}
		}

	}

}
