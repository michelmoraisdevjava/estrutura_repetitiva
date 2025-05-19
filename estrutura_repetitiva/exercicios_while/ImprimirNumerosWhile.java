package exercicios_while;

import java.util.stream.IntStream;

/*o	Implemente um programa que imprima os números de 1 a 10 usando while.*/
public class ImprimirNumerosWhile {

	public static void main(String[] args) {
		final int LIMITE = 10;

		int numero = 1;
		
		while(numero <= LIMITE) {
			System.out.println(numero);
			numero ++;
		}
		
		/*Código Moderno Usando Stream API Se quiser um código 
		 * ainda mais enxuto e moderno, pode usar Java Streams:*/
		System.out.println("###Código Moderno###");
		
		 IntStream.rangeClosed(1, 10).forEach(System.out::println);

	}

}
