package example;

public class MultiForExample {
	public static void main(String[] args) {
		//�ڡڡڡڡ�
		//�ڡڡڡ�
		//�ڡڡ�
		//�ڡ�
		//��
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		//�ڡڡڡڡ� i = 1, ��0 ��5
		//�١ڡڡڡ� i = 2, ��1 ��4
		//�١١ڡڡ� i = 3, ��2 ��3
		//�١١١ڡ� 
		//�١١١١�
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("��");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		
		//��
		//�ڡڡ�
		//�ڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡڡڡ�
		for(int i = 1; i <= 9; i++) {
			for(int j =1; j <= i; j++) {
				if(i % 2 == 1) {
					System.out.print("��");					
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		//�ڡ١١١�
		//�١ڡ١ڡ�
		//�١١ڡ١�
		//�١ڡ١ڡ�
		//�ڡ١١١�
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
	}
}
