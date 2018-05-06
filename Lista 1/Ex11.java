import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		double tijolo_a, tijolo_l, tijolo_area, parede_a, parede_l, parede_area, total_tijolo;
		
		System.out.print("Dados do tijolo, entre o valor da altura: ");
		tijolo_a = in.nextDouble();
		System.out.print("Dados do tijolo, entre o valor da largura: ");
		tijolo_l = in.nextDouble();
		tijolo_area = tijolo_a * tijolo_l;
		System.out.print("Dados da parede, entre o valor da altura: ");
		parede_a = in.nextDouble();
		System.out.print("Dados da parede, entre o valor da largura: ");
		parede_l = in.nextDouble();
		parede_area = parede_a * parede_l;
		total_tijolo = parede_a / tijolo_area;
		
		System.out.println("O total de tijolos de " + tijolo_area + "m2 gastos é de: " + total_tijolo + ", em uma parede com : " + parede_area + "m2.");
		in.close();
	}
}
