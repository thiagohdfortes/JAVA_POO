import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double PR = 0;
		String VMREAL;

		for (int Q = 1; Q <= 45; Q++){
			System.out.print("Digite o valor para o poduto: " + Q + ": R$");
			PR = PR + in.nextDouble();

		}
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		VMREAL = format.format(PR);
		System.out.println("O valor total dos 45 produtos é: R" + VMREAL);
		in.close();

		
	}
}
