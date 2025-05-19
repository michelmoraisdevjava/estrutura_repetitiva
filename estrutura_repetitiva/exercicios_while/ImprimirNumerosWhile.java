package exercicios_while;

import java.util.stream.IntStream;

/*o	Implemente um programa que imprima os n�meros de 1 a 10 usando while.*/
public class ImprimirNumerosWhile {

	public static void main(String[] args) {
		final int LIMITE = 10;

		int numero = 1;
		
		while(numero <= LIMITE) {
			System.out.println(numero);
			numero ++;
		}
		
		/*C�digo Moderno Usando Stream API Se quiser um c�digo 
		 * ainda mais enxuto e moderno, pode usar Java Streams:*/
		System.out.println("###C�digo Moderno###");
		
		 IntStream.rangeClosed(1, 10).forEach(System.out::println);

	}

}
