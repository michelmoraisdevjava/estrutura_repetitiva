package exercicios_tecnicos;

/*Implemente um programa que imprima os n�meros de 1 a 100. 
 * Para m�ltiplos de 3, imprima "Fizz" em vez do n�mero e, 
 * para m�ltiplos de 5, imprima "Buzz". Para n�meros que s�o 
 * m�ltiplos de ambos (3 e 5), imprima "FizzBuzz". 
 * Utilize um loop for.*/

public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}

	}

}
