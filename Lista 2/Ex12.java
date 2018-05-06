import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T=0;

		System.out.print("Entre o valor de leitura do termômetro: ");
		T = in.nextInt();
		if (T < 100)
			System.out.println("A temperatura está muito baixa.");
		else if (T >= 100 && T <= 200 )
			System.out.println("A temperatura está baixa.");
		else if (T > 200 && T < 500)
			System.out.println("A temperatura está normal.");
		else
			System.out.println("A temperatura está muito alta.");
		in.close();		
	}
}
