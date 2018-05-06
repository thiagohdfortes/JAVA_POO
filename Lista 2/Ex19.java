import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        
	Scanner in = new Scanner(System.in);
	int dh, mh, ah, dn, mn, an, idade;
	String data_n = "";

	System.out.print("Entre com a data de nascimento, no formato DD/MM/AAAA: ");
	data_n = in.next();
	//pega a data do sistema, ao inves de pedir ao usuário.
	GregorianCalendar hoje = new GregorianCalendar();
	dh = hoje.get(Calendar.DAY_OF_MONTH);
	mh = hoje.get(Calendar.MONTH) + 1;
	ah = hoje.get(Calendar.YEAR);
	dn = Integer.valueOf(data_n.substring(0,2));
	mn = Integer.valueOf(data_n.substring(3,5));
	an = Integer.valueOf(data_n.substring(6,10));

	if (mn < mh || (mn == mh && dn <= dh))
		idade = ah - an;
	else
		idade = (ah - an)-1;
	System.out.println("A idade calculada é de: " + idade + " anos.");
	in.close();
    }
}
