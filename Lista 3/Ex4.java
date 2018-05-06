import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int NH = 0;
		double SALB = 0;
		String VMREAL;

		for (int DIA = 1; DIA <= 30; DIA++){
			System.out.print("Digite a quantidade de horas trabalhadas no dia: " + DIA + ": ");
			NH = NH + in.nextInt();

		}
		SALB = NH * 10;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		VMREAL = format.format(SALB);
		System.out.println("O total de horas trabalhadas em 30 dias é: " + NH + " horas, com o valor do salário bruto de R" + VMREAL);
		in.close();

		
	}
}
