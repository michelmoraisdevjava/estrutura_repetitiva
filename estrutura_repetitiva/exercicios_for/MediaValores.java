package exercicios_for;

//Percorra um array de notas e calcule a m�dia dos valores.
public class MediaValores {

	public static void main(String[] args) {
		double[] valores = {7.0, 5.0, 8.0, 9.0, 10.0};
		
		double soma = 0.0;
		for(double valor :  valores) {
			soma += valor;
		}
		
		double media = soma / valores.length;
		System.out.println(media);

	}

}
