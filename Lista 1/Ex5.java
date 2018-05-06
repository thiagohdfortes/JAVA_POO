import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double preco, precof, conta1, desc;	
		
		System.out.print("Entre com o valor do produto: ");
		preco = in.nextDouble();
		System.out.print("Entre com o valor pago: ");
		precof = in.nextDouble();
		conta1 = precof / preco * 100;
		desc = 100 - conta1;		
		
		System.out.println("O desconto no valor pago foi de: " + desc + "%");
		in.close();
	}
}
