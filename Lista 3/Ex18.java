import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = 0, T = 0;
        	int INDEX = 1;

        	System.out.print("Digite um nº para a tabuda: ");
        	T = in.nextInt();
		System.out.print("Digite um valor máximo para multiplicar: ");
		N = in.nextInt();
        	while (INDEX <= N){
            		
            		System.out.println(T + "x" + INDEX + "=" + (T*INDEX));            
            		INDEX++;
        	}        
		//System.out.println("O resultado da soma até H é de: " + SOMA);
		in.close();
	}
}
