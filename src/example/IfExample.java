package example;

public class IfExample {
	public static void main(String[] args) {
		
		//������ ����� ���ڰ��� ����ϼ���.
		//��, ������ ����� ���� ���� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun = 'x';
		if(mun >= 'a' && mun <= 'z') {
			mun -= 32;
			System.out.println("mun = " + mun);
		} else {
			System.out.println("mun = " + mun);
		}
		System.out.println("==========================");
		
		
		
		//������ ����� ���� ���� 4�� ��������� �����Ͽ� ����ϼ���.
		int num = 345644;
		if(num % 4 == 0) {
			System.out.println("4�� ����Դϴ�.");
		} else {
			System.out.println("4�� ����� �ƴմϴ�.");
		}
		
		
		System.out.println("==========================");
		
		
		//���ذ� ������� �������� �����Ͽ� ����ϼ���.
		//������ 4�� ������ �������� 0�� ��� ����
		//�� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
		//�� ������ �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
		int year = 2021;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		System.out.println("==========================");
		
		
		//�̸��� [ȫ�浿]�� �л��� ���� 89��, ���� 93��, ���� 95���϶�
		//����, ����� ����Ͽ� �̸�, ����, ����� ���
		//����,����,���� �� �ϳ��� 0~100 ������ �ƴ� ��� ���α׷� ���� ����
		//System.exit(0); : ���α׷��� ���� �����ϴ� �޼ҵ�
		//����� �̿��� ���� ��� 100~90: A, 89~80: B, 79~70: C, 69~60: D, 59~0: F
		//��, ����� �Ҽ��� ���ڸ������� ���
		
		String name = "ȫ�浿", grade = "";
		int kor = 89, eng = 93, math = 95;
		int sum = kor + eng + math;
		double avg = (int)((sum / 3.0) * 10) / 10.0;
		
		if(kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
			
			System.exit(0);
			
		} else {
			System.out.println("�̸�: " + name);
			System.out.println("����: " + sum);
			System.out.println("���: " + avg);
			
			if(avg >= 90) {
				grade = "A";
				System.out.println("����: " + grade);
			} else if(avg >= 80) {
				grade = "B";
				System.out.println("����: " + grade);
			} else if(avg >= 70) {
				grade = "C";
				System.out.println("����: " + grade);
			} else if(avg >= 60) {
				grade = "D";
				System.out.println("����: " + grade);
			} else {
				grade = "F";
				System.out.println("����: " + grade);
			}
		}

	}
}