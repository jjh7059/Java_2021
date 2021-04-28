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
		
		//¡Ú¡Ú¡Ú¡Ú¡Ú i=1
		//¡Ù¡Ú¡Ú¡Ú¡Ú i=2
		//¡Ù¡Ù¡Ú¡Ú¡Ú i=3
		//¡Ù¡Ù¡Ù¡Ú¡Ú i=4
		//¡Ù¡Ù¡Ù¡Ù¡Ú i=5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print("¡Ù");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//¡Ú
		//¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		//¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		for(int i = 1; i <= 9; i+=2) {
			for(int j = 1; j <= i; j++) {
				System.out.print("¡Ú");	 
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//¡Ú¡Ù¡Ù¡Ù¡Ú i=1
		//¡Ù¡Ú¡Ù¡Ú¡Ù i=2
		//¡Ù¡Ù¡Ú¡Ù¡Ù i=3
		//¡Ù¡Ú¡Ù¡Ú¡Ù i=4
		//¡Ú¡Ù¡Ù¡Ù¡Ú i=5
		for(int i = 1; i <= 2; i++) {
			for(int j =1; j <= i; j+=2) {
				System.out.print("¡Ú");
				for(int k = 3; k >= i; k--) {
					System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
	}
}
