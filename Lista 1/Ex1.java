import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double l, c, resultadoarea;
		
		System.out.print("Entre com o valor para largura: ");
		l = in.nextDouble();
		System.out.print("Entre com o valor para comprimento: ");
		c = in.nextDouble();
		resultadoarea = l * c;
		System.out.println("A Área é: " + resultadoarea);
		in.close();
	}
}
