import java.util.Scanner;
public class Ex18 {
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
       		if (idade >= 16 && idade < 18 )
        		System.out.println("A idade calculada é de: " + idade + " anos, está apto(a) para votar.");
        	else if (idade >= 18 )
            		System.out.println("A idade calculada é de: " + idade + " anos, está apto(a) para votar e possuir carteira de habilitação.");
        	else
            		System.out.println("A idade calculada é de: " + idade + " anos.");
		in.close();
	}
}
