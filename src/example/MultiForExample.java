package example;

public class MultiForExample {
	public static void main(String[] args) {
		//¡Ú¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú
		//¡Ú¡Ú
		//¡Ú
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		//¡Ú¡Ú¡Ú¡Ú¡Ú i = 1, Èò0 °Ë5
		//¡Ù¡Ú¡Ú¡Ú¡Ú i = 2, Èò1 °Ë4
		//¡Ù¡Ù¡Ú¡Ú¡Ú i = 3, Èò2 °Ë3
		//¡Ù¡Ù¡Ù¡Ú¡Ú 
		//¡Ù¡Ù¡Ù¡Ù¡Ú
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("¡Ú");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("¡Ù");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		
		//¡Ú
		//¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		for(int i = 1; i <= 9; i++) {
			for(int j =1; j <= i; j++) {
				if(i % 2 == 1) {
					System.out.print("¡Ú");					
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		//¡Ú¡Ù¡Ù¡Ù¡Ú
		//¡Ù¡Ú¡Ù¡Ú¡Ù
		//¡Ù¡Ù¡Ú¡Ù¡Ù
		//¡Ù¡Ú¡Ù¡Ú¡Ù
		//¡Ú¡Ù¡Ù¡Ù¡Ú
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j || i == 1 && j == 5 || i == 5 && j == 1 || 
						i == 2 && j == 4 || i == 4 && j == 2) {
					System.out.print("¡Ú");
				} else {
					System.out.print("¡Ù");					
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
	}
}
