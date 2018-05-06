import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ID=0;
		
		System.out.print("Informe a idade do nadador: ");
		ID = in.nextInt();
		if (ID >= 5 && ID <= 7)
			System.out.println("A categoria do nadador é: Infantil A");
		else if (ID >= 8 && ID <= 10)
			System.out.println("A categoria do nadador é: Infantil B");
		else if (ID >= 11 && ID <= 13)
			System.out.println("A categoria do nadador é: Juvenil A");
		else if (ID >= 14 && ID <= 17)
			System.out.println("A categoria do nadador é: Juvenil B");
		else if (ID > 17)			
			System.out.println("A categoria do nadador é: Adulto");
		else
			System.out.println("O nadador não está em nenhuma categoria.");
		in.close();
	}
}

