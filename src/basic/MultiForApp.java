package basic;

public class MultiForApp {
	public static void main(String[] args) {
		
		int cnt = 0;  //�̵������ ������ �����ϱ� ���� ����
		for(int i = 1; i <= 3; i++) {  //A���� ���� �� : �ݺ�
			for(int j = 1; j <= 4; j++) {  //������ B���� : �ݺ�
				cnt++;
			}
		}
		System.out.println("�̵������ ���� = " + cnt);
		System.out.println("========================================");
		
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		//�ڡڡڡڡڡڡ�
		for(int j = 1; j <= 5; j++) {  //��(Row)�� �ݺ� ó���ϱ� ���� ���
			for(int i = 1; i <= 7; i++) {  //��(Column)�� �ݺ� ó���ϱ� ���� ���
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//������
		for(int i = 1; i <= 9; i++) {  //��(Row)�� �ݺ� ó���ϱ� ���� ���
			for(int j = 2; j <= 9; j++) {  //��(Column)�� �ݺ� ó���ϱ� ���� ���
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//��			i=1 ��=1
		//�ڡ�			i=2 ��=2
		//�ڡڡ�		i=3 ��=3
		//�ڡڡڡ�		i=4 ��=4
		//�ڡڡڡڡ�	i=5 ��=5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//�١١١١�	i=5 ��=4 ������=1
		//�١١١ڡ�	i=4 ��=3 ������=2
		//�١١ڡڡ�	i=3 ��=2 ������=3
		//�١ڡڡڡ�	i=2 ��=1 ������=4
		//�ڡڡڡڡ�	i=1 ��=0 ������=5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print("��");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//�١١١١�	i=1 
		//�١١١ڡ�	i=2 
		//�١١ڡڡ�	i=3 
		//�١ڡڡڡ�	i=4 
		//�ڡڡڡڡ�	i=5 
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i+j < 6) {
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
