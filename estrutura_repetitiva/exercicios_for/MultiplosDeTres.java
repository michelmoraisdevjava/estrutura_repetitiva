package exercicios_for;

//Imprima os múltiplos de 3 entre 0 e 30.
public class MultiplosDeTres {

	public static void main(String[] args) {
		/*✅ Primeira abordagem: Usando incremento de 3 (i += 3)*/
		for(int i = 3; i < 30; i += 3) {
			System.out.println(i);
		}
		/*✔ Vantagens:
		 * Mais eficiente, pois evita verificações desnecessárias.
		 * O loop percorre apenas os múltiplos de 3 diretamente.
		 * Código mais limpo e legível.*/
		
		System.out.println("######");
		for(int i = 3; i < 30; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
