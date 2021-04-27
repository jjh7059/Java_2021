package basic;

//����ȯ(Type Cast): ���� �ڷ����� �Ͻ������� ��ȯ�Ͽ� ����ϴ� ���
//�ڵ� ����ȯ(JVM) - �ڷ����� �ٸ� �� ���� ���� ���
//���� ����ȯ(���α׷���)

public class TypeCastApp {
	public static void main(String[] args) {
		
		System.out.println("��� = " + (3 + 1.5));  //�ڵ� ����ȯ
		
		System.out.println("��� = " + (95 / 10));
		System.out.println("��� = " + ((double)95 / 10));  //���� ����ȯ
		
		int kor = 95, eng = 90;
		int tot = kor + eng;
		double avg = tot / 2.0;  //tot / 2 (X)
		
		System.out.println("���� = " + tot + ", ��� = " + avg);
		
		byte su1 = 10, su2 = 20;
		//int �ڷ������� ���� �ڷ����� ���� ������ ��� �ڵ����� int �ڷ������� ����ȯ ��
		int su3 = su1 + su2;
		System.out.println("su3 = " + su3);
		System.out.println("================================================");
		
		int num = (int)12.3;
		System.out.println("num = " + num);  //12
		
		int num1 = 95, num2 = 10;
		double num3 = num1 / (double)num2;  //��������ȯ + �ڵ�����ȯ
		System.out.println("num3 = " + num3);  //9.5
		
		int num4 = 100_000_000, num5 = 30;  //����ٷ� �ڸ��� ����
		long num6 = (long)num4 * num5;
		System.out.println("num6 = " + num6);
		
		double number = 1.23456789;
		System.out.println("number = " + number);
		System.out.println("number(����) = " + (int)(number * 100) / 100.0);
		System.out.println("number(�ݿø�) = " + (int)(number * 100 + 0.5) / 100.0);
		System.out.println("number(�ø�) = " + (int)(number * 100 + 0.9) / 100.0);
	}
}