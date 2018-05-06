import java.util.Scanner;
import java.lang.*;

public class Ex11 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);		
		char CL;						

		System.out.print("Informe o código do livro (A ou B): ");
		CL = in.next().charAt(0);
		CL = Character.toLowerCase(CL);
		switch (CL){                                                                                                                                                                      
                                case 'a':                                                                                                                                                                   
                                        System.out.println("Você escolheu a categoria de livro: Ficção");                                                                                                   
                                        break;                                                                                                                                                              
                                case 'b':                                                                                                                                                                   
                                	System.out.println("Você escolheu a categoria de livro: Não-Ficção");                                                                                              
                                        break;                                                                                                                                                          
                               default:                                                                                                                                                                    
                                        System.out.println("Opção inválida.");                                                                                                             
                }
					
		in.close();
	}
	
}
	
