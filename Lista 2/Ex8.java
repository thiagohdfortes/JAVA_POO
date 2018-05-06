import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.lang.*;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double SAL = 0;
		char DEP = 'p';
		String NF, SALREAL;

		System.out.print("Digite o nome do funcionário: ");
		NF = in.next();
		System.out.print("Entre com o valor do Salário: R$");
		SAL = in.nextDouble();
		System.out.print("Entre com o departamento do funcionário, P (Produção), E (Engenharia): ");
		DEP = in.next().charAt(0);
		DEP = Character.toLowerCase(DEP);
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		SALREAL = format.format(SAL);
		if (SAL >= 1000.00 && SAL <= 1500.00){
			switch (DEP){
			case 'p':
				System.out.println("O Funcionário " + NF + ", tem um salário de R" + SALREAL + " e pertence ao departamento de produção.");
				break;
			case 'e':
				System.out.println("O Funcionário " + NF + ", tem um salário de R" + SALREAL + " e pertence ao departamento de engenharia.");
				break;
			}

		}
		in.close();

		
	}
}
