package example;

public class IfExample {
	public static void main(String[] args) {
		
		//������ ����� ���ڰ��� ����ϼ���.
		//��, ������ ����� ���� ���� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun = 'a';
		if(mun >= 'a' && mun <= 'z') {
			mun -= 32;  //mun = mun - 32 �� int�� ����ȯ�� �߻��ؼ� ����
			System.out.println("mun = " + mun);
		} else {
			System.out.println("mun = " + mun);
		}
		System.out.println("==========================");
		
		
		
		//������ ����� ���� ���� 4�� ��������� �����Ͽ� ����ϼ���.
		int num = 345644;
		if(num % 4 == 0) {
			System.out.println(num + " >> 4�� ����Դϴ�.");
		} else {
			System.out.println(num + " >> 4�� ����� �ƴմϴ�.");
		}
		System.out.println("==========================");
		
		
		//���ذ� ������� �������� �����Ͽ� ����ϼ���.
		//������ 4�� ������ �������� 0�� ��� ����
		//�� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
		//�� ������ �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
		int year = 2021;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
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
		double avg = (int)((sum / 3.0) * 100) / 100.0;
		
		if(kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
			System.out.println("[����]0~100 ������ �ƴ� ������ �ԷµǾ����ϴ�.");
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
		
		/*
		boolean valid=false;
		
		if(kor<0 || kor>100) {
			System.out.println("[����]0~100 ������ ��� ���������� ���������� �Է� �Ǿ����ϴ�.");
			//System.exit(0);
			valid=true;
		}
		
		if(eng<0 || eng>100) {
			System.out.println("[����]0~100 ������ ��� ���������� ���������� �Է� �Ǿ����ϴ�.");
			//System.exit(0);
			valid=true;
		}
		
		if(mat<0 || mat>100) {
			System.out.println("[����]0~100 ������ ��� ���������� ���������� �Է� �Ǿ����ϴ�.");
			//System.exit(0);
			valid=true;
		}
		
		if(valid) {//���ǽ� ��� boolean �������� �̿��Ͽ� ��� ���� ����
			System.exit(0);
		}
		
		int tot=kor+eng+mat;
		double ave=tot/3.;
		String grade="";
		switch((int)ave/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		
		System.out.println("�̸� = "+name+", ���� = "+tot
				+", ��� = "+(int)(ave*100)/100.+", ���� = "+grade);
        */
		
	}
}