import java.util.Scanner;
import java.lang.Math;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int VALOR = 0;
		double SOMA = 0;
        	double INDEX = 0;
        	while (VALOR >= 0){
			System.out.print("Digite um valor: ");
			VALOR = in.nextInt();
        		if (VALOR >= 0){
				SOMA = SOMA + VALOR;
				INDEX++;
			}
        	}
		double MEDIA = SOMA / INDEX;
		System.out.println("A média dos " + Math.round(INDEX) + " valores digitados é de: " + MEDIA);
		in.close();

		
	}
}
