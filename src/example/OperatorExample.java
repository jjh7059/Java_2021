package example;

public class OperatorExample {
	public static void main(String[] args) {

		//245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���. �Ϸ� 86400��
		int time = 245678;
		int day = time / 86400;  //�Ϸ� 24*60*60 = 86400��
		time %= 86400;
		int hour = time / 3600;
		time %= 3600;
		int minute = time / 60;
		int second = time % 60;
		System.out.println(day + "�� " + hour + "�� " + minute + "�� " + second + "��");
		System.out.println("==========================");

		
		//�Ѵ��� ������ 1�� 5õ������ ����⸦ 20�� ������ ��� �����ؾߵ� �ݾ��� ����Ͽ� 
		//����ϼ���.
		//��, 15�� �̻� ������ ��� 1��� 25%�� �������� �����Ͽ� ���
		//���׿����� �̿�
		int danga = 150000000, gae = 20;
		long don = (long)(gae>=15?danga*0.75:danga)*gae;
		System.out.println("���ұݾ� = " + don);
		System.out.println("==========================");
	}
}
