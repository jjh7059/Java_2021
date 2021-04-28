package example;

public class ForExample {
	public static void main(String[] args) {
		//���� �̸��� ȭ�鿡 7�� ����ϼ���.
		//ex) ������ ������  ....
		for(int i = 1; i <= 7; i++) {
			System.out.print("������ ");
		}
		System.out.println();
		System.out.println("========================================");
		
		
		//1~10 ������ ���� �� Ȧ���� ȭ�鿡 ����ϼ���.
		//ex) 1  3  5  7  9
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("========================================");
		
		
		//1~100 ������ �������� 3�� ������� �հ�� 5�� ������� �հ踦 ����Ͽ�
		//3�� ����� �հ迡�� 5�� ����� �հ踦 �� ����� ����ϼ���.
		//ex) ��� = 633
		int sum3 = 0, sum5 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum3 += i;
			}
			if(i % 5 == 0) {
				sum5 += i;
			}
		}
		System.out.println(sum3 - sum5);
		System.out.println("========================================");
		
		
		//������ �� 7���� ȭ�鿡 ����ϼ���.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//      ...
		//    7 * 9 = 63
		for(int i = 1; i <= 9; i++) {
			System.out.println(7 + " * " + i + " = " + 7 * i);
		}
		System.out.println("========================================");
		
		
		//5!�� ������� ����Ͽ� ������� ����ϼ���.(5! = 5 * 4 * 3 * 2 * 1)
		//ex)5! = 120
		int fac = 1;
		for(int i = 5; i >= 1; i--) {
			fac *= i;
		}
		System.out.println("5! = " + fac);
		System.out.println("========================================");
		
		
		//�� ������ ����� ������ ������ �������� ȭ�鿡 ����ϼ���.
		//��, �� �ٿ� �������� 7���� ��µǵ��� �ۼ��ϼ���.
		//ex) 36 27 38 39 40 41 42
		int begin = 36, end = 57;
		for(int i = begin-1; i <= end; i++) {
			for(int j = 1; j <= 7; j++) {
				System.out.print(i+j + " ");				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("========================================");
	}
}
