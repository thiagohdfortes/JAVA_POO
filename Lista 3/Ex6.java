import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int H = 0, SOMA = 0;
        int INDEX = 1;

        System.out.print("Digite o valor máximo para H: ");
        H = in.nextInt();		
        while (INDEX <= H){
            SOMA = SOMA + INDEX;
            System.out.print(INDEX + "+");            
            INDEX++;
        }        
		System.out.println("O resultado da soma até H é de: " + SOMA);
		in.close();

		
	}
}
