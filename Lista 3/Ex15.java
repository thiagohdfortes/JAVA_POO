import java.util.Scanner;
import java.lang.Math;

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int VALOR = 0;
		char CONTINUAR = 'S';
        	while (CONTINUAR != 'N'){
			System.out.print("Digite um valor: ");
			VALOR = in.nextInt();
			VALOR = Math.round(VALOR); //converte para positivo
        		if (VALOR % 2 == 0)
				System.out.println("O valor é par.");
			else
				System.out.println("O valor é ímpar.");
			System.out.print("Continuar? S/N: ");
			CONTINUAR = Character.toUpperCase(in.next().charAt(0));
			if (CONTINUAR != 'N' && CONTINUAR != 'S'){
				System.out.println("Opção inválida, somente S/N. Continuando...");
				CONTINUAR = 'S';
			}
        	}
		in.close();

		
	}
}
