package do_while;

/*Imprima os múltiplos de 5 entre 0 e 50 utilizando do-while.*/
public class ImprimirMultiplosDeCinco {

	public static void main(String[] args) {

		int numeros = 0;

		do {
			if(numeros % 5 == 0) {
				System.out.println(numeros);
			}
			numeros++;
		} while (numeros <= 50 );
		
	}

}
