package example;

public class MultiForExample {
	public static void main(String[] args) {
		//�ڡڡڡڡ�
		//�ڡڡڡ�
		//�ڡڡ�
		//�ڡ�
		//��
		//������ Ǯ��
		for(int i = 1; i <= 5; i++) {  
			for(int j =1; j <= 6-i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		//�� Ǯ��
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		*/

	
		//�ڡڡڡڡ� i=1 ��=0 ������=5
		//�١ڡڡڡ� i=2 ��=1 ������=4
		//�١١ڡڡ� i=3 ��=2 ������=3
		//�١١١ڡ� i=4 ��=3 ������=2
		//�١١١١� i=5 ��=4 ������=1
		//������ Ǯ��
		for(int i = 1; i <= 5; i++) {  
			for(int j =1; j <= i-1; j++) {
				System.out.print("��");
			}
			for(int j =1; j <= 6-i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		//�� Ǯ��
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print("��");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
        */
		
		
		//��
		//�ڡڡ�
		//�ڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡڡڡ�
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("��");	 
			}
			System.out.println();
		}
		System.out.println("========================================");

		

		//�ڡ١١١�
		//�١ڡ١ڡ�
		//�١١ڡ١�
		//�١ڡ١ڡ�
		//�ڡ١١١�
		//������ Ǯ��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j || i + j == 6) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
		//�� Ǯ��
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j || i == 1 && j == 5 || i == 5 && j == 1 || 
						i == 2 && j == 4 || i == 4 && j == 2) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
		*/

	}
}
