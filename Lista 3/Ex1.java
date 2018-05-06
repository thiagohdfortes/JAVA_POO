import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double P = 0;

		for (int CX = 1; CX <= 25; CX++){
			System.out.print("Digite o valor do peso da caixa: " + CX + ": ");
			P = P + in.nextDouble();

		}
		System.out.println("O peso total das 25 caixas é: " + P + "Kg");
		in.close();

		
	}
}
