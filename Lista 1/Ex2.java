import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double l, c, resultadoarea, perimetro;
		
		System.out.print("Entre com o valor para largura: ");
		l = in.nextDouble();
		System.out.print("Entre com o valor para comprimento: ");
		c = in.nextDouble();
		resultadoarea = l * c;
		perimetro = 2*l + 2*c;
		System.out.println("A Área é: " + resultadoarea);
		System.out.println("O Perímetro é: " + perimetro);
		in.close();
	}
}
