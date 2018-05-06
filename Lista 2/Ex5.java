import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = 0;
		
		while (numero == 0){
			System.out.print("Informe um número, positivo ou negativo, exceto 0: ");
			numero = in.nextInt();
		}
		
		if (numero > 0){  
			System.out.println("Número positivo!");  
		}  
		else{  
			System.out.println("Número negativo!");  
		} 
		
		in.close();
	}
}

