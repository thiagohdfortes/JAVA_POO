import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double P;

		System.out.print("Digite o valor do produto: ");
		P = in.nextDouble();
		if (P >= 50.00 && P <= 100.00)
			System.out.println("Em promoção");
		else
			System.out.println("Preço Normal");
		in.close();

		
	}
}
