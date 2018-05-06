import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double F = 0, C =0;

		System.out.print("Digite o valor em Fahrenheit: ");
		F = in.nextDouble();
		if (F > 0 && F <= 50){
			C = (F - 32) * 5/9;
			String CFOR = String.format("%.2f", C);
			System.out.println(F + "ºF é equivalente à: " + CFOR + "ºC");
		}
		else
			System.out.println("Valor permitido é de 1..50, tente novamente.");
		in.close();
		
	}
}
