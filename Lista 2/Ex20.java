import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A, B, C;

		System.out.print("Digite um valor para o lado A: ");
		A = in.nextInt();
		System.out.print("Digite um valor para o lado B: ");
		B = in.nextInt();
		System.out.print("Digite um valor para o lado C: ");
		C = in.nextInt();
		
		if ((C <= A + B) && (B <= C + A) && (A <= C + B)){
                	if (A == B && B == C){
                		System.out.println("Os lados A:" + A + " + B:" + B + " + C:" + C + ", representam um triângulo Equilatero.");
                	} 
			else if ((A != B) && (B != C) && (C != A)) {
                		System.out.println("Os lados A:" + A + " + B:" + B + " + C:" + C + ", representam um triângulo Escaleno.");
               		}
			else
                		System.out.println("Os lados A:" + A + " + B:" + B + " + C:" + C + ", representam um triângulo Isosceles.");
		}
		else{
			if ((A != B) && (B != C) && (C != A))
                		System.out.println("Os lados A:" + A + " + B:" + B + " + C:" + C + ", representam um triângulo Escaleno.");
			else
				System.out.println("Os valores fornecidos não são de um triângulo classificado. ");
		}

		in.close();
		
	}
}
