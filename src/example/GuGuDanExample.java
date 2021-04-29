package example;

import java.util.Scanner;

//Ű����� �������� �Է¹޾� 1~9 ������ �������� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���
//��, �Էµ� �������� 2~9 ������ �������� ���Ǹ� ���� ���� �������� �Է��� ���
//�޽��� ����� ���Է�
//ex) �� �Է�[2~9] >> 7
//    7 * 1 = 7
//       ...
//    7 * 9 = 63
public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("�Է�[2~9] >> ");
			int num = in.nextInt();
			
			if(num < 2 || num > 9) {
				System.out.println("2~9 ������ �Է����ּ���.");
			} else {
				for(int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + num * i);
				}
				break;
			}
		}
		in.close();
	}
}
