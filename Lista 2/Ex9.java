import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double SAL, SAL_NOVO=0;
		String SALREAL;

		System.out.print("Entre com o valor do salário do funcionário: R$");
		SAL = in.nextDouble();
		if (SAL < 500)
			SAL_NOVO = SAL + (SAL * 15) / 100;
		else if (SAL >=500 && SAL <= 1000)
			SAL_NOVO = SAL + (SAL * 10) / 100;
		else if (SAL > 1000)
			SAL_NOVO = SAL + (SAL * 5) / 100;
		
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		SALREAL = format.format(SAL_NOVO);
		System.out.println("O Valor do salário reajustado é de: R" + SALREAL);
		in.close();
	}
}
