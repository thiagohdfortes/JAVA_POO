import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int CP=0;
		
		System.out.print("Informe o código do produto: ");
		CP = in.nextInt();
		if (CP == 1)
			System.out.println("A classificação do produto é: Alimento não perecível");
		else if (CP >= 2 && CP <= 4)
			System.out.println("A classificação do produto é: Alimento perecível");
		else if (CP >= 5 && CP <= 6)
			System.out.println("A classificação do produto é: Vestuário");
		else if (CP == 7)
                        System.out.println("A classificação do produto é: Higiene Pessoal");
		else if (CP >= 8 && CP <= 9)
			System.out.println("A classificação do produto é: Limpeza e Utensílios Domésticos");
		else
			System.out.println("Código do Produto é Inválido.");
		in.close();
	}
}

