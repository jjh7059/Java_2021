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
		
		
		
		//�迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���.
		//ex) 10�� = 3��
		//    20�� = 4��
		//    ...
		//    60�� = 2��
		int[] age_cnt = new int[6];
		
		for(int i = 0; i < age.length; i++) {
			switch(age[i] / 10) {
			case 1: age_cnt[0] += 1;
			case 2: age_cnt[1] += 1;
			case 3: age_cnt[2] += 1;
			case 4: age_cnt[3] += 1;
			case 5: age_cnt[4] += 1;
			case 6: age_cnt[5] += 1;
			}
		}
		
		for(int i = 0; i < age_cnt.length; i++) {
			System.out.println((i+1)*10 + "�� = " + age_cnt[i] + "��");
		}
	}
}
