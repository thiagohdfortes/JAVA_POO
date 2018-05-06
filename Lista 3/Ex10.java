import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex10 {
	public static void main(String[] args) {
		//para seguir fielmente o enunciado da questão o ideal é usar list!
		Scanner in = new Scanner(System.in);
		double[] PRODUTOS;
		double TOTAL = 0;
		int Q = 0, MA = 0, ME = 0;
		String VMREAL;
		System.out.print("Informe a quantidade de produtos a ser comprada: ");
		Q = in.nextInt();
		if (Q < 1){
			System.out.println("A quanditdade não pode ser menor que 1, valor modificado para 1 produdo se for 0 e para positivo se for menor que 0.");
			if (Q == 0)
				Q = 1;
			else
				Q = Q * -1;
		}
		PRODUTOS = new double[Q];
		for (int INDEX = 0; INDEX <= PRODUTOS.length -1; INDEX++){
			System.out.print("Digite o preço para o produto nº" + (INDEX + 1) + ": R$");
			PRODUTOS[INDEX] = in.nextDouble();
			TOTAL = TOTAL + PRODUTOS[INDEX];
		}
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		VMREAL = format.format(TOTAL);
		System.out.println("O total gasto nos " + PRODUTOS.length + " produto(s) foi de: R" + VMREAL);
		in.close();

		
	}
}
