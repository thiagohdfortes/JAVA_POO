import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
public class Ex14 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double HT, VH, SALBRUTO, SALLIQ, INSS, IR;
		String SALFOR;
		
		System.out.print("Entre com a quantidade de horas trabalhadas, no formato de HH: ");
		HT = in.nextDouble();
		System.out.print("Entre com o valor da hora trabalhada: R$");
		VH = in.nextDouble();
		
		SALBRUTO = HT * VH;
		//No ex14 está errado a formula de calculo do INSS, é em cima do Bruto, não do Liq.
		INSS = (SALBRUTO * 11) / 100;
		if (SALBRUTO > 1257.12 && SALBRUTO <= 2512.08 )
			IR = 188.57;
		else if (SALBRUTO > 2512.08)
			IR = 502.58;
		else
			IR = 0;
		SALLIQ = SALBRUTO - INSS - IR;
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		SALFOR = "R" + format.format(SALLIQ);
		System.out.println("O salário liquido calculado ficou no valor de: " + SALFOR);
		in.close();
	}
}

