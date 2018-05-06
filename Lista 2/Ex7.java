import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double VM = 0;
		String NOME, VMREAL;

		System.out.print("Digite o nome do vendedor: ");
		NOME = in.next();
		for (int DIA = 1; DIA < 31; DIA++){
			System.out.print("Digite o valor de venda do dia " + DIA + " desse mês: ");
			VM = VM + in.nextDouble();

		}
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		VMREAL = format.format(VM);
		if (VM >= 10000.00 && VM <= 50000.00)
			System.out.println("O vendedor " + NOME + ", teve um total de vendas de: R" + VMREAL);
		else
			System.out.println("Valor total de vendas: R" + VMREAL);
		in.close();

		
	}
}
