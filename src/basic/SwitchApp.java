package basic;

public class SwitchApp {
	public static void main(String[] args) {
		
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		}
		System.out.println("==========================");
		
		choice = 4;
		
		switch(choice) {  //�ش�Ǵ� ���� ������ ����X
		case 1:           //default: ��� ���̽� ���� ���� ���� ��� ������ ����
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		default:
			System.out.println("�������� �̵��մϴ�.");
		}
		System.out.println("==========================");
		
		choice = 1;
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
			break;  //switch ���� ���� ����
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
			break;
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
			break;
		default:
			System.out.println("�������� �̵��մϴ�.");
		}
		System.out.println("==========================");
		
		int jumsu = 88;
		//���� ����  0~100 ������ ��ȿ ������ �ƴ����� �����Ͽ� ��� - ��ȿ�� �˻�
		//���� ���� ���� ����� �����Ͽ� ���
		//100~90: A, 89~80: B, 79~70: C, 69~60: D, 59:~0: F
		String grade = "";
		if(jumsu >=0 && jumsu <= 100) {
			switch(jumsu / 10) {  //10.0�̶�� ���� (switch���� �Ǽ� ���� ��� �Ұ�)
			case 10:
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
			}
			System.out.println("[���]" + jumsu + "�� >> " + grade + "����");
		} else {
			System.out.println("[����]0~100 ������ ��� ���������� ���� �Է� �Ǿ����ϴ�.");
		}
		System.out.println("==========================");
		
		//JDK1.7 �̻󿡼��� switch �������� ���ڿ��� ���Ͽ� ��� ���� ���� ����
		String kor = "��";
		String eng = "";  //�ʱⰪ ������ ����!!
		
		switch(kor) {
		case "�ϳ�": eng = "One"; break;
		case "��": eng = "Two"; break;
		case "��": eng = "Three"; break;
		}
				
		System.out.println("[���]" + kor + " = " + eng);
		System.out.println("==========================");
	}
}
