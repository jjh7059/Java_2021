package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���. �Ϸ� 86400��
		int time = 245678;
		int day = time / 86400;
		int hour = (time - (day * 86400)) / 3600;
		int minute = (time - ((day * 86400) + (hour * 3600))) / 60;
		int second = time % 60;
		
		System.out.println(day + "�� " + hour + "�� " + minute + "�� " + second + "��");
		System.out.println("==========================");
		
		
		//�Ѵ��� ������ 1�� 5õ������ ����⸦ 20�� ������ ��� �����ؾߵ� �ݾ��� ����Ͽ� 
		//����ϼ���.
		//��, 15�� �̻� ������ ��� 1��� 25%�� �������� �����Ͽ� ���
		//���׿����� �̿�
		int pay = 150000000;
		int plane = 20;
		
		if(plane >= 15) {
			System.out.println((pay * plane) - (pay * plane) / 4);
			
		} else {
			System.out.println(pay * plane);
		}
		
		//System.out.println(plane >= 15 ? (pay * plane) - (pay * plane) * 0.25 : pay * plane + "���Դϴ�.");
		
		
		
		System.out.println("==========================");
	}
}
