import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		int var_a, var_b, var_troca;
		
		System.out.print("Entre com o valor da var A: ");
		var_a = in.nextInt();
		System.out.print("Entre com o valor da var B: ");
		var_b = in.nextInt();
		var_troca = var_a;
		var_a = var_b;
		var_b = var_troca;				
		System.out.println("O valor em A é: " + var_a + ", em B é: " + var_b);
		in.close();
	}
}
