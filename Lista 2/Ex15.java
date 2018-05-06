import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex15 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double HT, VH, SALBRUTO, SALLIQ, INSS, IR;
		String SALFOR;
		
		System.out.print("Entre com a quantidade de horas trabalhadas, no formato de HH: ");
		HT = in.nextDouble();
		System.out.print("Entre com o valor da hora trabalhada: R$");
		VH = in.nextDouble();
		SALBRUTO = HT * VH;
		INSS = (SALBRUTO * 11) / 100;
		if (SALBRUTO <= 800.45)
			IR = (SALBRUTO * 7.65) / 100; 
		else if (SALBRUTO > 800.45 && SALBRUTO <= 900 )
			IR = (SALBRUTO * 8.65) / 100;
		else if (SALBRUTO > 900 && SALBRUTO <= 1334.07)
			IR = (SALBRUTO * 9) / 100;
		else if (SALBRUTO > 1334.07 && SALBRUTO <= 2668.15)
			IR = (SALBRUTO * 11) / 100;
		else
			IR = 293.50;
		SALLIQ = SALBRUTO - INSS - IR;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		SALFOR = "R" + format.format(SALLIQ);
		System.out.println("O salário liquido calculado ficou no valor de: " + SALFOR);
		in.close();
	}
}

