import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] N = new int[20];
		int M = 0;
		for (int INDEX = 0; INDEX <= 19; INDEX++){
			System.out.print("Digite um valor nº" + (INDEX + 1) + " para essa posição: ");
			N[INDEX] = in.nextInt();
			if (INDEX == 0)
				M = N[INDEX];
			if (N[INDEX] > M)
				M = N[INDEX];

		}
		System.out.println("O maior número digitado foi: " + M);
		in.close();

		
	}
}
