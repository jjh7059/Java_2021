package example;

import java.util.Scanner;

//��ǻ�ͷκ��� �������� ���� �������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
//1~100 ������ ���� �������� �����޵��� �ۼ�
//�������� ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
//Ű���� �Է°��� 1~100 ������ �ƴ� ��� �޽��� ��� �� ���Է�
//�������� �Է°��� ���� ��� �Է� Ƚ�� ��� �� ���α׷� ����
//�������� �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޽��� ���
//�������� 10�� �ȿ� ������ ���� ��� ������ ��µǵ��� �ۼ�
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int com = (int)(Math.random() * 100) % 100 + 1;
		int count = 0;
		
		
		while(true) {
			System.out.print("�Է� >> ");
			int num = in.nextInt();
			
			if(num < 1 || num > 100) {
				System.out.println("1~100 ������ �ƴմϴ�.");
			} else {
				while(com != num) {
					count++;
					if(count == 10)
						System.out.println("10ȸ ��");
					
					if(com == num) {
						System.out.println("����");
						break;
					} else if(com > num) {
						System.out.println("ū�� �Է�");
						break;
					} else {
						System.out.println("������ �Է�");
						break;
					}
				}
			}
		}
	}
}
