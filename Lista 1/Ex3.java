import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double pr, valordesconto;
		String vlrdescontomoeda;
		
		System.out.print("Entre com o valor do produto: ");
		pr = in.nextDouble();
		valordesconto = pr * 5 / 100;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		vlrdescontomoeda = format.format(valordesconto);
		
		System.out.println("O valor do desconto é: R" + vlrdescontomoeda);
		in.close();
	}
}
