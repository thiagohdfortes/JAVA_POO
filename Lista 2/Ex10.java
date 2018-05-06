import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valora = 0, valorb = 0, operacao;

		while (valora < 1){
			System.out.print("Digite um valor positivo para A: ");
			valora = in.nextInt();
		}
		while (valorb < 1){
			System.out.print("Digite um valor positivo para B: ");
			valorb = in.nextInt();
		}
		if (valora == valorb){
			operacao = valora + valorb;
			System.out.println("A Soma de A + B é: " + operacao);

		}
		if (valora < valorb){
			operacao = valorb - valora;
			System.out.println("A diferença de B - A é: " + operacao);
		}
		if (valorb < valora){
			operacao = valora - valorb;
			System.out.println("A diferença de A - B é: " + operacao);
		}

		in.close();
		
	}
}
