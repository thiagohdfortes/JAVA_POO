public class Ex16 {
	public static void main(String[] args) {
		
		double ALTURA1 = 1.50, ALTURA2 = 1.10;
        	int INDEX = 1;
		System.out.println("Ano " + INDEX + ", altura do Anacleto: " + ALTURA1 + ", altura do Felisberto: " + ALTURA2 );
		while (ALTURA2 <= ALTURA1){
			INDEX++;
			ALTURA1 = ALTURA1 + 0.02;
			ALTURA2 = ALTURA2 + 0.03;
			System.out.println("Ano " + INDEX + ", altura do Anacleto: " + ALTURA1 + ", altura do Felisberto: " + ALTURA2 );
        	}
		System.out.println("Foram nescessários " + INDEX +  " anos para Felisberto ser mais alto.");
	}
}
