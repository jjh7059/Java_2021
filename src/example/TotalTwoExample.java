package example;

import java.util.Scanner;

//Ű����� �������� ��� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� �������� 0�� ��� �Է��� �����ϰ� �հ踦 ���
//    ������ �Է�[0:����] >> 10
//    ������ �Է�[0:����] >> 20
//    ������ �Է�[0:����] >> 0
//    [���]�հ� = 90
public class TotalTwoExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int a = 1;
		while(a != 0) {
			System.out.print("������ �Է�[0:����] >> ");
			a = in.nextInt();
			sum += a;
		}
		System.out.println("[���]�հ� = " + sum);
		in.close();
	}
}
