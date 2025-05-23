package exercicios_for;

//Imprima os múltiplos de 3 entre 0 e 30.
public class MultiplosDeTres {

	public static void main(String[] args) {
		
		for(int i = 3; i < 30; i += 3) {
			System.out.println(i);
		}
		
		System.out.println("######");
		for(int i = 3; i < 30; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
