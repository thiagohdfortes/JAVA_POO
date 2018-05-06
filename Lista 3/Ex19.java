import java.util.Scanner;
import java.util.ArrayList;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int USER = 0, ID = 0, IDMEDIA = 0;
		double OP1=0, OP2=0, OP3=0, OP4=0, OP5=0;
		char CONTINUAR = 'S', OP = 'A';
		ArrayList<Character> PESQUISA = new ArrayList();
		while (CONTINUAR != 'N'){
			USER++;			
			System.out.print("Digite a idade para o usuário nº" + USER + ": ");
			ID = in.nextInt();
        		System.out.print("Digite a opinião do usuário nº" + USER + ", para o filme\n(A-Ótimo, B-Bom, C-Regular, D-Ruim, E-Péssimo): ");
			OP =  Character.toUpperCase(in.next().charAt(0));
			PESQUISA.add(OP);
			IDMEDIA = IDMEDIA + ID;			
			System.out.print("Continuar a pesquisa? S/N: ");			
			CONTINUAR = Character.toUpperCase(in.next().charAt(0));
			if (CONTINUAR != 'N' && CONTINUAR != 'S'){
				System.out.println("Opção inválida, somente S/N. Continuando...");
				CONTINUAR = 'S';
			}
        	}
		System.out.println("O total de usuários pesquisados foi de: " + USER);
		System.out.println("A média de idade dos usuários pesquisados foi de: " + (IDMEDIA/USER) + " anos.");
		for (int I_OP = 0; I_OP < PESQUISA.size(); I_OP++){
			if (PESQUISA.get(I_OP) == 'A')
				OP1++;
			if (PESQUISA.get(I_OP) == 'B')
				OP2++;
			if (PESQUISA.get(I_OP) == 'C')
				OP3++;
			if (PESQUISA.get(I_OP) == 'D')
				OP4++;
			if (PESQUISA.get(I_OP) == 'E')
				OP5++;
		}
		if (OP1 != 0)
			OP1 = (OP1*100)/USER;
		if (OP2 != 0)
			OP2 = (OP2*100)/USER;
		if (OP3 != 0)
			OP3 = (OP3*100)/USER;
		if (OP4 != 0)
			OP4 = (OP4*100)/USER;
		if (OP5 != 0)
			OP5 = (OP5*100)/USER;
		System.out.println("A porcentagem de usuários que classificou o filme como: \nÓtimo: " + OP1 + "%, Bom: " + OP2 + "%, Regular: " + OP3 + "%, Ruim: " + OP4 + "%, Péssimo: " + OP5 + "%" );
		in.close();
	}
}
