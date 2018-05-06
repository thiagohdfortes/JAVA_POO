import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valorconta;

		System.out.print("Digite o valor da conta: ");
		valorconta = in.nextDouble();
		if (valorconta > 50.00)
			System.out.println("Você está gastando muito");
		in.close();
		
	}
}
