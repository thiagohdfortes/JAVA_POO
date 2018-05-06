import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int VALOR = 0, VALORM = 0;
        	while (VALOR >= 0){
			System.out.print("Digite um valor: ");
			VALOR = in.nextInt();
        		if (VALORM <= VALOR)
				VALORM = VALOR;
        	}
		System.out.println("O mair valor digitado foi: " + VALORM);
		in.close();

		
	}
}
