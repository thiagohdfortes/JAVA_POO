import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex17 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double PR=0;
		int CO;
		String VALORFOR = "";
		
		System.out.print("Informe o preço do produto: R$");
		PR = in.nextDouble();
		System.out.print("Entre com o código de origem: ");
		CO = in.nextInt();
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		switch (CO){
			case 1:
				VALORFOR = "R" + format.format(PR);
				System.out.println("A procedência do produto de acordo com o código é: SUL, com o valor de: " + VALORFOR);
			break;
			case 2:
				VALORFOR = "R" + format.format(PR);
				System.out.println("A procedência do produto de acordo com o código é: Sudeste, com o valor de: " + VALORFOR);
			break;
			case 3:
				VALORFOR = "R" + format.format(PR);
				System.out.println("A procedência do produto de acordo com o código é: Centro-Oeste, com o valor de: " + VALORFOR);
			break;
			case 4:
				VALORFOR = "R" + format.format(PR);
				System.out.println("A procedência do produto de acordo com o código é: Norte, com o valor de: " + VALORFOR);
			break;
			case 5:
				VALORFOR = "R" + format.format(PR);
				System.out.println("A procedência do produto de acordo com o código é: Nordeste, com o valor de: " + VALORFOR);
			break;
			default:
				System.out.println("Código de origem inválido, app encerrado.");
		}
		in.close();
	}
}

