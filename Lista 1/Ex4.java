import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double pr, valordesconto, d, pag;
		String vlrapagar;
		
		System.out.print("Entre com o valor do produto: ");
		pr = in.nextDouble();
		System.out.print("Entre com a % de desconto: ");
		d = in.nextDouble();
		valordesconto = pr * d / 100;
		pag = pr - valordesconto;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		vlrapagar = format.format(pag);
		
		System.out.println("O valor a ser pago é: R" + vlrapagar + " com o desconto de: " + d + "%");
		in.close();
	}
}

