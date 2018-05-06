import java.util.Scanner;
import java.lang.*;
import java.util.Locale;
import java.text.NumberFormat;


public class Ex4 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);		
		char TC= 'g';						
		double CT, VALORFINAL;
		String VALORMOEDA;

		System.out.print("Informe o tipo de combustível, G para (gasolina) e A para (álcool): ");
		TC = in.next().charAt(0);
		TC = Character.toLowerCase(TC);
		System.out.print("Informe a quantidade em litros a ser abastecida: ");
		CT = in.nextDouble();
		if (TC == 'g'){                                                                                                                                                                              
                        VALORFINAL = 1.80 * CT;                                                                                                                                                             
                }                                                                                                                                                                                           
                else{                                                                                                                                                                                       
                        VALORFINAL = 1.0 * CT;                                                                                                                                                             
               	}
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		VALORMOEDA = format.format(VALORFINAL);
		System.out.println("O valor a ser pago é de: R" + VALORMOEDA);
					
		in.close();
	}
	
}
	
