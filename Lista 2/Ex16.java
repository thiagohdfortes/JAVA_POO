import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex16 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double PE, VALORTOT = 0;
		int CP;
		String VALORFOR = "";
		
		System.out.print("Informe o preço do produto: R$");
		PE = in.nextDouble();
		System.out.print("Entre com a condição de pagamento: ");
		CP = in.nextInt();
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		switch (CP){
			case 1:{
				VALORTOT = PE - (PE * 10) / 100;
				VALORFOR = "R" + format.format(VALORTOT);
				System.out.println("O pagamento será feito à vista em dinheiro ou cheque, com 10% de desconto, no valor de: " + VALORFOR);
			}
			break;
			case 2:{
				VALORTOT = PE - (PE * 5) / 100;
				VALORFOR = "R" + format.format(VALORTOT);
				System.out.println("O pagamento será feito à vista com cartão de crédito, com 5% de desconto, no valor de: " + VALORFOR);
			}
			break;
			case 3:{
				VALORTOT = PE / 2;
				VALORFOR = "R" + format.format(VALORTOT);
				System.out.println("O pagamento será feito em 2 vezes, preço normal de etiqueta sem juros, no valor de: " + VALORFOR + " cada parcela.");
			}
			break;
			case 4:{
				VALORTOT = PE + (PE * 10) / 100;
				VALORFOR = "R" + format.format((VALORTOT /3 ));
				System.out.println("O pagamento será feito em 3 vezes, preço de etiqueta com acréscimo de 10%, no valor de: " + VALORFOR + " cada parcela.");
			}
			break;
			default:
				System.out.println("Condição de pagamento inválida, app encerrado.");
		}
		in.close();
	}
}

