package example;

public class ArrayExample {
	public static void main(String[] args) {
		//������� ���̵��� ������ �迭 ����
		int[] age = {27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11};
		
		//�迭�� ����� ������� ��� ���̸� ����Ͽ� ���
		//��� ���� = 36��
		int sum = 0;
		for(int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		System.out.println("��� ���� = " + sum / age.length + "��");
		System.out.println("========================================");
		
		
		//�迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���.
		//ex) 10�� = 3��
		//    20�� = 4��
		//    ...
		//    60�� = 2��
		int[] age_cnt = new int[6];
		
		for(int i = 0; i < age.length; i++) {
			age_cnt[(age[i] / 10)-1]++;
		}
		
		for(int i = 0; i < age_cnt.length; i++) {
			System.out.println((i+1)*10 + "�� = " + age_cnt[i] + "��");
		}
	}
}
