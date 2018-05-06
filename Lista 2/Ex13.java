import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex13 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double CAIXA, PR, CAIXAPOR;
		int QTD;
		String PR1, PR2;
		
		System.out.print("Entre com a quantidade de dinheiro existente no caixa: R$");
		CAIXA = in.nextDouble();
		System.out.print("Quantidade de produtos a ser comprada: ");
		QTD = in.nextInt();
		PR = 0;
		for (int QTDPR = 1; QTDPR <= QTD; QTDPR++){
			System.out.print("Valor de compra do produto " + QTDPR + ": R$");
			PR = PR + in.nextDouble();
			if (PR > CAIXA){
				System.out.println("Aviso: O valor dos produtos está acima do valor de caixa!");
				System.exit(0);
			}
		}
		CAIXAPOR = CAIXA * 80 / 100;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		if (PR >= CAIXAPOR){
			double PARCELADO1 = (PR * 10 / 100);
			double PARCELADO2 = (PARCELADO1 + PR) / 3;
			PR1 = format.format(PARCELADO1);
			PR2 = format.format(PARCELADO2);
			System.out.println("O valor da compra foi parcelado em 3x com juros de 10%, R" + PR1 + " sobre o valor total, o valor de cada parcela é de: R" + PR2);   
		}
		else{
			double PRCOMDESC, PRPORDESC = PR * 5 / 100;
			PRCOMDESC = PR - PRPORDESC;
			PR1 = format.format(PR);
			PR2 = format.format(PRCOMDESC);
			System.out.println("O valor de R" + PR1 + " será pago a vista com desconto de 5%, ficando com o valor de: R" + PR2); 
		}
		in.close();
	}
}

