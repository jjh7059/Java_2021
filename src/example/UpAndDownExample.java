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
		int user = 0;
		int com = (int)(Math.random() * 100) % 100 + 1;  
		int count = 0, count_limit = 10;
		
		while(true) {
			while(true) {
				System.out.print("[�Է�] >> ");
				user = in.nextInt();
				
				if(user < 1 || user > 100) {
					System.out.println("[����]1~100 ���� ���� �������� �Է����ּ���.");
				} else {
					break;
				}
			}
			
			count++;
			
			if(count == count_limit) {
				System.out.println("[����]��ȸ " + count_limit + "ȸ�� �����Ǿ����ϴ�.");
				System.out.println("���� >> " + com);
				break;
			}
			
			if(com > user) {
				System.out.println("ū�� �Է�");
			} else if(com < user) {
				System.out.println("������ �Է�");
			} else {
				System.out.println("[����]�����Դϴ�.");
				break;
			}
		}
		in.close();	
	}
}
