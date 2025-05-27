package do_while;

/*Desenvolva um contador regressivo de 10 a 1 com do-while*/
public class ContadorRegressivo {

	public static void main(String[] args) {
		int numero = 10;
		
		do {
			System.out.println(numero);
			numero--;
		}while(numero >= 1);

	}

}
