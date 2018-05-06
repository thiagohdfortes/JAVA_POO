import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char CS;
		double DC;
		
		System.out.print("Informe em metros a distância do cruzamento: ");
		DC = in.nextDouble();
		System.out.print("Informe a cor do semáforo, (V) Vermelho, (A) Amarelo, (D) Verde: ");
		CS = in.next().charAt(0);

		if (CS == 'V')
			System.out.println("Vermelho = Parar");
		else{
			if ((CS == 'A') && (DC < 5))
				System.out.println("Amarelo = Passar com cuidado");
			else if ((CS == 'A') && (DC >= 5))
				System.out.println("Amarelo = Parar");
			else// (CS == 'V')
				System.out.println("Verde = Passar");
		}
		in.close();
	}
}

