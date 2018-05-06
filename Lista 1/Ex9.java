import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double val_dolar, cot, val_real;
		String val_atualizado;
		
		System.out.print("Entre com a quantidade de US$ do do cliente: ");
		val_dolar = in.nextDouble();
		System.out.print("Entre com a cotação do dia: ");
		cot = in.nextDouble();
		val_real = val_dolar * cot;	
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		val_atualizado = format.format(val_real);
		
		System.out.println("O valor em Reais atualizado com a cotação do dia é: R" + val_atualizado + " :)");
		in.close();
	}
}
