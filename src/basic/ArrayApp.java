package basic;

public class ArrayApp {
	public static void main(String[] args) {
		
		//�迭�� �����Ͽ� ���������� ���� - �ڷ���[] �������� = new �ڷ���[��Ұ���];
		//�ڷ���[] �������� : �迭 ������ �����ϱ� ���� ���������� �ڷ���
		//new �ڷ���[��Ұ���] : �ڷ����� ���� ������ŭ ���� ������ �迭 ����
		//�迭�� ���(Element)�� �̿��Ͽ� ���� ���� �� ���� - ��Ҵ� ÷��(Index)�� �ڵ� �ο�
		//��Ҵ� ÷��(Index : 0���� 1�� �����Ǵ� ������)�� �ڵ� �ο�
		//��Ҵ� �ڵ����� �⺻���� ����
		
		int[] num = new int[3];
		
		System.out.println("num = " + num);
		System.out.println("========================================");
		
		//���������� ����� �迭������ ÷�ڸ� �̿��Ͽ� �迭 ��� ǥ��
		//��������[÷��]
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		System.out.println("num[2] = " + num[2]);
		//�迭 ��Ҹ� �����ϴ� ÷�ڸ� �߸� ����� ��� ���� �߻�
		//ArrayIndexOutOfBoundsException �߻�
		//System.out.println("num[3] = " + num[3]); ����
		
		//�迭�������� .length : ���������� ����� �迭�� ���
		System.out.println("========================================");
		System.out.println("�迭 ����� ���� = "+num.length);
		System.out.println("========================================");
		
		int index = 0;
		//����� ÷�ڴ� ���� �Ǵ� ������� ����Ͽ� ǥ�� ����
		num[index] = 10;
		num[index+1] = 20;
		num[index+2] = 30;
		
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		System.out.println("num[2] = " + num[2]);
		System.out.println("========================================");
		
		//for ������ �̿��Ͽ� �迭�� ��ҿ� ���� �ϰ� ó�� : ÷�� �̿�(�Է�, ����, ��� ����)
		//�ʱ��, ���ǽ�, �������� �̿��Ͽ� ÷�� ǥ��(�Է�, ����, ���)
		for(int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		System.out.println("========================================");
		
		//�迭 ������ ��ҿ� �⺻�� ��� ���ϴ� �ʱⰪ�� ����ǵ��� �ۼ�
		//{} �ȿ� ������ ���� ������ŭ�� ��Ҹ� ���� �迭 ����
		int[] su = {10, 20, 30};
		
		//for ������ �̿��Ͽ� �迭�� ��ҿ� ���� �ϰ� ó��
		//���� �ݺ������ڸ� �̿��Ͽ� ��Ұ��� �����޾� ������ �����Ͽ� ó�� 
		// - �Է�X, ����, ���O
		//�迭�� ��� ��Ұ��� ������ ��� �ݺ��� ����
		//�����߻��� ����
		//�ܼ�����Ҷ� ���� for�� �̿�
		for(int temp:su) {
			System.out.print(temp + "\t");
		}
		System.out.println();
		System.out.println("========================================");
		
		//�迭�� ��� ��Ұ����� �հ踦 ����Ͽ� ����ϼ���.
		int[] array = {54, 70 ,64 ,87 ,96 ,21 ,65 ,76 ,11 ,34 ,56 ,41 ,77 ,90};
		int total = 0;
		
		for(int number:array) {
			total += number;
		}
		System.out.println("�հ� = " + total);
		System.out.println("========================================");
		
		//�迭�� ��Ұ� �� 30~60 ������ ��Ұ� ������ ����Ͽ� ����ϼ���.
		int count = 0;
		
		for(int number:array) {
			if(number >= 30 && number <= 60) {
				count++;
			}
		}
		System.out.println("30~60 ������ ��� ���� = " + count);
		System.out.println("========================================");
	}
}
