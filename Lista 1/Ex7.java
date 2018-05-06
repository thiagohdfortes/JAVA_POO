import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		double r, vol;
		
		System.out.print("Entre com o raio: ");
		r = in.nextDouble();	
		vol = 3.14159 * Math.pow(r, 2); 
				
		System.out.println("O volume é: " + vol);
		in.close();
	}
}
