import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double L = 0, C = 0, A = 0;
		int R = 0;
		char CONTINUAR = 'S';
		while (CONTINUAR != 'N'){
			R++;
			System.out.print("Digite o valor para a largura do cômodo nº" + R + ": ");
			L = in.nextDouble();
        		System.out.print("Digite o valor para o comprimento do cômodo nº" + R + ": ");
			C = in.nextDouble();
			A = A + (L*C);
			System.out.print("Continuar? S/N: ");
			CONTINUAR = Character.toUpperCase(in.next().charAt(0));
			if (CONTINUAR != 'N' && CONTINUAR != 'S'){
				System.out.println("Opção inválida, somente S/N. Continuando...");
				CONTINUAR = 'S';
			}
        	}
		System.out.println("A área total da residência é de: " + A + "m2");
		in.close();
	}
}
