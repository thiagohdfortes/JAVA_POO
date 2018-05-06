import java.util.Scanner;
import java.lang.*;

public class Ex3 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);		
		char S= 'm';						
		double H, P;

		System.out.print("Calculo de peso ideal, informe o sexo, M ou F: ");
		S = in.next().charAt(0);
		S = Character.toLowerCase(S);
		System.out.print("Informe a altura: ");
		H = in.nextDouble();
		if (S == 'm'){
			P = (72.7 * H) - 58;
		}
		else{
			P = (62.1 * H) - 44.7;
		}
		System.out.println("O peso ideal é: " + P + "Kg");
					
		in.close();
	}
	
}
	
