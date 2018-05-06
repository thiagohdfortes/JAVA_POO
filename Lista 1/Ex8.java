import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.*;
import java.time.temporal.*;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		String horaentrada, horasaida, tempohora;
		LocalTime horaentradaf, horasaidaf;
		int HS, HE, MS, ME, Hentradamin, Hsaidamin, Hdif;
		double valorhora;
		
		System.out.print("Entre com a hora da entrada, no formato 24H, HH:MM: ");
		horaentrada = in.next();
		System.out.print("Entre com a hora da saida, no formato 24H, HH:MM: ");
		horasaida = in.next();
		
		Hdif = 0;
		horaentradaf = LocalTime.parse(horaentrada, DateTimeFormatter.ofPattern("HH:mm"));
	    HE = horaentradaf.get(ChronoField.CLOCK_HOUR_OF_DAY)*60;
	    ME = horaentradaf.get(ChronoField.MINUTE_OF_HOUR);
	    horasaidaf = LocalTime.parse(horasaida, DateTimeFormatter.ofPattern("HH:mm"));
	    HS = horasaidaf.get(ChronoField.CLOCK_HOUR_OF_DAY)*60;
	    MS = horasaidaf.get(ChronoField.MINUTE_OF_HOUR);
	    
	    Hentradamin = HE + ME;
	    Hsaidamin = HS + MS;
if (Hsaidamin < Hentradamin){	    		    	
	    	while (Hsaidamin < Hentradamin){
	    		System.out.println("A hora de saida não pode ser anterior a hora de entrada, o cauculo é efetivo apenas para o dia corrido.");
	    		System.out.print("Entre com a hora da entrada, no formato 24H, HH:MM: ");
	    		horaentrada = in.next();
	    		System.out.print("Entre com a hora da saida, no formato 24H, HH:MM: ");
	    		horasaida = in.next();
	    			    		
	    		horaentradaf = LocalTime.parse(horaentrada, DateTimeFormatter.ofPattern("HH:mm"));
	    	    HE = horaentradaf.get(ChronoField.CLOCK_HOUR_OF_DAY)*60;
	    	    ME = horaentradaf.get(ChronoField.MINUTE_OF_HOUR);
	    	    horasaidaf = LocalTime.parse(horasaida, DateTimeFormatter.ofPattern("HH:mm"));
	    	    HS = horasaidaf.get(ChronoField.CLOCK_HOUR_OF_DAY)*60;
	    	    MS = horasaidaf.get(ChronoField.MINUTE_OF_HOUR);
	    	    
	    	    Hentradamin = HE + ME;
	    	    Hsaidamin = HS + MS;
	    	}
	    	Hdif = Hsaidamin - Hentradamin;
	    }
	    else
	    	Hdif = Hsaidamin - Hentradamin;
	    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
	    valorhora = Hdif / 15;
	    if (Hdif % 60 > 0)
	    	tempohora = Hdif/60 + "H:" + Hdif % 60+"M";
	    else
	    	tempohora = Hdif/60 + "H";
	    
	    System.out.println("Horas no estacionamento " + tempohora + ", com o valor a ser pago de: R" + format.format(valorhora));
		in.close();
	}
}
