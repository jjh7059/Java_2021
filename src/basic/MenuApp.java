package basic;

import java.util.Scanner;

//Ű����� �޴� �� �ϳ��� �Է¹޾� ���ø޴��� ���� ����� �����ϴ� ���α׷��� �ۼ��ϼ���.
//[���α׷� ����] �޴��� �����ϱ� ������ ����ڰ� ���ϴ� ����� ��� ����
//���� �޴��� �������� ���� ��� ���� �޽��� ��� �� ���Է�
public class MenuApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("<<�л� ���� ���α׷�>>");
		
		while(true) {
			//�޴� ��� ���
			System.out.println("1.�л����� ����");
			System.out.println("2.�л����� ����");
			System.out.println("3.�л����� ����");
			System.out.println("4.�л����� �˻�");
			System.out.println("5.�л����� ����");
			
			//�޴� �Է�
			System.out.print("�޴� ����[1~5] >> ");
			int choice = in.nextInt();
			
			//���� �޴��� ���� ��ȿ�� �˻�
			if(choice < 1 || choice > 5) {  //���� �޴��� ���������� ���
				System.out.println("[����]������ �޴��� �������� �ʽ��ϴ�.");
				continue;
			}
			
			//���� �޴��� ���� ��� ����
			if(choice == 5) break;  //�ݺ��� ����
			
			switch(choice) {
			case 1:
				System.out.println("[���]�л������� ���������� ���� �Ͽ����ϴ�.");
				break;
			case 2:
				System.out.println("[���]�л������� ���������� ���� �Ͽ����ϴ�.");
				break;
			case 3:
				System.out.println("[���]�л������� ���������� ���� �Ͽ����ϴ�.");
				break;
			case 4:
				System.out.println("[���]�л������� ���������� �˻� �Ͽ����ϴ�.");
				break;
			}
			System.out.println();
		}
		
		System.out.println("[�޽���]�л� ���� ���α׷��� �����մϴ�.");
		in.close();
	}
}
