import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = 0, FAT = 1;
        	int INDEX = 1;

        	System.out.print("Digite o valor para o fatorial: ");
        	N = in.nextInt();
		if (N < 0)
			N = N * -1;
        	if (N != 0){
			while (INDEX <= N){
				if (INDEX != 0){
					FAT = FAT * INDEX;
					INDEX++;
				}
			}
			System.out.println("O resultado é de: " + FAT);
		}
		else{
			System.out.println("O resultado é de: 1");
		}
		in.close();

		
	}
}
