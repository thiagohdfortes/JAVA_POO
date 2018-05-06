import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int NH = 0;

		for (int DIA = 1; DIA <= 30; DIA++){
			System.out.print("Digite a quantidade de horas trabalhadas no dia: " + DIA + ": ");
			NH = NH + in.nextInt();

		}
		System.out.println("O total de horas trabalhadas em 30 dias é: " + NH + " horas.");
		in.close();

		
	}
}
