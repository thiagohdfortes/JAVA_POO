import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int VALOR = 0, VALORM = 0;
		char CONTINUAR = 'S';
        	System.out.print("Digite um valor: ");
		VALOR = in.nextInt();
		VALORM = VALOR;
        	if (VALORM >= VALOR)
			VALORM = VALOR;
		System.out.print("Continuar? S/N: ");
		CONTINUAR = Character.toUpperCase(in.next().charAt(0));
		if (CONTINUAR != 'N' && CONTINUAR != 'S'){
			System.out.println("Opção inválida, somente S/N. Continuando...");
			CONTINUAR = 'S';
		}
		if (CONTINUAR == Character.toUpperCase('N'))
			System.exit(0);
		while (CONTINUAR != 'N'){
			System.out.print("Digite um valor: ");
			VALOR = in.nextInt();
        		if (VALORM >= VALOR)
				VALORM = VALOR;
			System.out.print("Continuar? S/N: ");
			CONTINUAR = Character.toUpperCase(in.next().charAt(0));
			if (CONTINUAR != 'N' && CONTINUAR != 'S'){
				System.out.println("Opção inválida, somente S/N. Continuando...");
				CONTINUAR = 'S';
			}
        	}
		System.out.println("O menor valor digitado foi: " + VALORM);
		in.close();

		
	}
}
