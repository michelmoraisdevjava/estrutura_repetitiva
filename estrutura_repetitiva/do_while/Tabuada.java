package do_while;

import java.util.Scanner;

/*Solicite um valor e exiba a tabuada desse valor 
 * de 1 a 10 utilizando do-while*/
public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		int resultado = 0;
		
		System.out.print("Digite o valor: ");
		int valor = sc.nextInt();
		
		do {
			resultado = valor * contador;
			System.out.println(valor + " x " + contador + " = " + resultado);
			contador++;
			
		}while(contador <= 10);
		
		
		sc.close();

	}

}
