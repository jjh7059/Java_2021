package example;

public class VariableExample {
	public static void main(String[] args) {
		
		//������ ���� 7, ���� ���� 10�� �簢���� ���� ���
		int garo = 7, sero = 10;
		int nulbe = garo * sero;
		System.out.println("�簢���� ���� = " + nulbe);
		System.out.println("==========================");
		
		//������ ���� 9, �غ��� ���� 7�� �ﰢ���� ���� ���
		int x = 9, y = 7;
		double area = x * y / 2.0;
		System.out.println("�ﰢ���� ���� = " + area);
		System.out.println("==========================");
		
		//10�� ��ü �����԰� 759kg�� ��� ��� �����Ը� ����Ͽ� ���
		int weight = 759;
		double avg = weight / 10.0;
		System.out.println("��� ������ = " + avg + "kg");
		System.out.println("==========================");
		
		//�̸��� [ȫ�浿]�� �л��� ���� 89��, ���� 93��, ���� 95���϶�
		//����, ����� ����Ͽ� �̸�, ����, ����� ���
		//��, ����� �Ҽ��� ���ڸ������� ���
		String name = "ȫ�浿";
		int kor = 89, eng = 93, math = 95;
		int sum = kor + eng + math;
		double avg1 = (int)((sum / 3.0) * 10) / 10.0;
		System.out.println("�̸�: " + name);
		System.out.println("����: " + sum + "��");
		System.out.println("���: " + avg1 + "��");
		
	}
}