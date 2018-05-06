import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] N = new int[20];
		int MA = 0, ME = 0;
		for (int INDEX = 0; INDEX <= 19; INDEX++){
			System.out.print("Digite um valor nº" + (INDEX + 1) + " para essa posição: ");
			N[INDEX] = in.nextInt();
			if (INDEX == 0){
				ME = N[INDEX];
				MA = N[INDEX];
			}
			if (N[INDEX] > MA)
				MA = N[INDEX];
			if (N[INDEX] < ME)
				ME = N[INDEX];

		}
		System.out.println("O maior número digitado foi: " + MA);
		System.out.println("O menor número digitado foi: " + ME);
		in.close();

		
	}
}
