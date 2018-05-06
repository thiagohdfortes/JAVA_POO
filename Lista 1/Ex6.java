import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		int an, aa, idade;
		
		System.out.print("Entre com o ano atual: ");
		aa = in.nextInt();
		
		System.out.print("Entre com o ano de nascimento: ");
		an = in.nextInt();
		
		while (an > aa){
		System.out.println("O ano de nasciemnto não pode ser maior ao ano atual.");
		System.out.print("Entre com o ano de nascimento: ");
		an = in.nextInt();
		}
		
		idade = aa - an;
		System.out.println("A idade calculada é de: " + idade + " anos.");
		in.close();
	}
}
